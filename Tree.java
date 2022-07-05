package GenTree;
import java.util.ArrayList;

public class Tree {

    ArrayList <String> tree = new ArrayList<>();

    // public void saveTree(Person person){
    //     Parents p = new Parents();
    //     Childrens ch = new Childrens();
    //     if (p.parents != null){
    //         tree.addAll(p.parents);
    //     }
    //     tree.add(person.name);
    //     if (ch.childrens != null){
    //         tree.addAll(ch.childrens);
    //     }

    // }

    public void printTree(Person person){
        Parents p = new Parents();
        Childrens ch = new Childrens();
        ch.saveChildrens(person);
        p.saveParents(person);

        System.out.println("Генеалогическое древо:\n");
        if (p.parents.isEmpty() == false){
            System.out.printf("%s   +   %s\n\n", p.parents.get(0), p.parents.get(1));
        }
        System.out.printf("      %s     ", person.name);
        if (ch.childrens.isEmpty() == false){
            System.out.println("\n");
            for (String n : ch.childrens) {
                switch (ch.childrens.size()){
                    case (1):
                        System.out.printf("----- %s -----", n);
                        break;
                    case (2):
                        System.out.printf("%s           ", n);
                        break;
                    case 3, 4, 5:
                        System.out.printf("%s  ", n);
                        break;
                }
            }
        }
        else {
            System.out.print("");
        }
        System.out.println("\n");
        System.out.println("========================\n");

    }
    
}
