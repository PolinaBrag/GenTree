package GenTree;

public class Research_1 implements Researchable{

    public void buttonClick(Person person){
        PrinterConsole.printArray(person.node.getChildren());
    }

}
