package GenTree;

import java.util.ArrayList;

public class Research_1 implements Researchable {

    public void buttonClick(Person person) {

        ArrayList<Node> lst = person.node.getChildren();
        lst.sort(new NameComparator());
        PrinterConsole.printArray(lst);
    }

}
