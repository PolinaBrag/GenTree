package GenTree;

public class Research_2 {

    public static void getParents(Person person){
        Parents p = new Parents();
        p.saveParents(person);
        p.printParents(p.parents);
    }
    
}
