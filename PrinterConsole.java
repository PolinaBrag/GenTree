package GenTree;

import java.util.ArrayList;

public class PrinterConsole {
    
    public static void printPerson(Person person){
        System.out.printf("Имя: %s\nВозраст: %d\n",  person.getName(),  person.getAge());
    }

    public static void printArray(ArrayList<Node> node){
        if (!node.isEmpty()){
            for (Node m : node) {
                System.out.print(m.getPerson().getName() + " ");
        }
        System.out.print("\n");
        }
        else {
            System.out.print(" \n");
        }

    }

    public static void printNode(Node node){
        if (node.getFather() != null && node.getMother() != null){
        System.out.printf("%s %s\n%s\n", node.getFather().getPerson().getName(), node.getMother().getPerson().getName(), node.getPerson().getName());
        }
        else {
            System.out.printf("%s\n", node.getPerson().getName());
        }
        printArray(node.getChildren());

    }
    
}
