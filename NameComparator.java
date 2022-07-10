package GenTree;

import java.util.Comparator;

public class NameComparator implements Comparator<Node> {

    @Override
    public int compare(Node name1, Node name2) {
        return Integer.compare(name1.getPerson().getName().charAt(0), name2.getPerson().getName().charAt(0));
    }

}
