import java.util.*;
import java.lang.String;

public class AddingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> variables = new HashMap<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] command = line.split(" ");

            //Enter value into hashmap
            if (command[0].equals("def")) {
                int tmp = Integer.parseInt(command[2]);
                variables.put(command[1], tmp);
            }

            if (command[0].equals("clear")) {
                variables.clear();
            }

            if (command[0].equals("calc")) {
                int res = 0;
                Boolean isUnknown = false;
                if (variables.containsKey(command[1])) {
                    res = variables.get(command[1]);
                }
                else {
                    isUnknown = true;
                }
                String output = command[1];
                for (int i = 1; i < command.length; i++) {
                    //addition
                    if (command[i].equals("+")) {
                        output = output + " + " + command[i + 1];
                        if (variables.containsKey(command[i + 1])) {
                            res = res + variables.get(command[i + 1]);
                        }
                        else{
                            isUnknown = true;
                        }
                    }
                    //subtraction
                    if (command[i].equals("-")) {
                        output = output + " - " + command[i + 1];
                        if (variables.containsKey(command[i + 1])) {
                            res = res - variables.get(command[i + 1]);
                        }
                        else {
                            isUnknown = true;
                        }
                    }
                    if (command[i].equals("=")) {
                        break;
                    }
                }
                //look for val in hashmap, then iterate and add it to output.
                if (variables.containsValue(res) && !isUnknown) {
                    Iterator<Map.Entry<String, Integer>> it = variables.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Integer> pair = it.next();
                        if (pair.getValue() == res) {
                            output = output + " = " + pair.getKey();
                        }
                    }
                } else {
                    output = output + " = unknown";
                }
                System.out.println(output);
            }
            //making sure it terminates when there are no more input
            if (!(command[0].equals("def") || command[0].equals("clear") || command[0].equals("calc"))) {
                break;
            }
        }
        sc.close();
    }
}
/*
def foo 3
calc foo + bar =
def bar 7
def programming 10
calc foo + bar =
def is 4
def fun 8
calc programming - is + fun =
def fun 1
calc programming - is + fun =
clear
def foo 3
calc foo + bar =
def bar 7
def programming 10
calc foo + bar =
def is 4
def fun 8
calc programming - is + fun =
def fun 1
calc programming - is + fun =
clear
 */