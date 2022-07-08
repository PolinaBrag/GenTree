package GenTree;
import java.util.ArrayList;

public class Node {

    private Person person;
    private Node father;
    private Node mother;
    private ArrayList<Node> children = new ArrayList<>();

    public Node(Person person) {
        this.person = person;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
        father.addChild(this, Parent.FATHER);
    }

    public Node getMother() {
        return mother;
    }

    public void setMother(Node mother) {
        this.mother = mother;
        mother.addChild(this, Parent.MOTHER);
    }

    public Person getPerson() {
        return person;
    }
    
    
    public void addChild(Node child, Parent parent) {
        if (children.contains(child)) {
            return;
        }
        children.add(child);

        switch (parent) {
            case FATHER: {
                child.setFather(this);
                break;
            }

            case MOTHER: {
                child.setMother(this);
                break;
            }
        }

    }

    public ArrayList<Node> getChildren() {
        return children;
    }

}
