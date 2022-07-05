package GenTree;
import java.util.ArrayList;

public class Parents {

    ArrayList <String> parents = new ArrayList<>(2);

    public void saveParents(Person person){
        
        if (person.father != null){
            parents.add(person.father);
        }
        else {
            parents.add("нет");
        }
        if (person.mother != null){
            parents.add(person.mother);
        }
        else {
            parents.add("нет");
        }
        
    }

    public void printParents(ArrayList<String> array){
        System.out.println("Родители: ");
        if (array.isEmpty() == false){
                System.out.printf("Мама: %s\nПапа: %s\n", array.get(1), array.get(0));
        }
        System.out.println("-------------");

    }
    
}
