package GenTree;


public class ResearchNode implements Researchable{

    public void buttonClick(Person person){
        PrinterConsole pc = new PrinterConsole();
        pc.printNode(person.getNode());
    }
    
}
