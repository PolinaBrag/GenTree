package GenTree;
import java.util.ArrayList;

public class Childrens {

    ArrayList <String> childrens = new ArrayList<>();

    public void saveChildrens(Person person){
        
        if (person.child_1 != null){
            childrens.add(person.child_1);
        }
        if (person.child_2 != null){
            childrens.add(person.child_2);
        }
        if (person.child_3 != null){
            childrens.add(person.child_3);
        }
        if (person.child_4 != null){
            childrens.add(person.child_4);
        }
        if (person.child_5 != null){
            childrens.add(person.child_5);
        }
    }

    public void printChildrens(ArrayList<String> array){
        System.out.println("Дети: ");
        if (array.isEmpty() == false){
            for (String n : array) {
                System.out.println(n);
                }
        }
        else {
            System.out.println("Детей не имеет");
        }
        System.out.println("-------------");

    }
    
}
