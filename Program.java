package GenTree;

import GenTree.Person.Sex;

public class Program {
    public static void main(String[] args) {

        Person andrew = new Person("Андрей", 36, Sex.MALE);
        Person yana = new Person("Яна", 7, Sex.FEMALE);
        Person anna = new Person("Анна", 3, Sex.FEMALE);
        Person matthew = new Person("Матвей", 1, Sex.MALE);
        Person stepan = new Person("Степан", 10, Sex.MALE);
        Person sveta = new Person("Светлана", 30, Sex.FEMALE);
        Person irina = new Person("Ирина", 52, Sex.FEMALE);
        Person victor = new Person("Виктор", 57, Sex.MALE);

        Node nodeAndrew = new Node(andrew);
        andrew.setNode(nodeAndrew);
        Node nodeYana = new Node(yana);
        yana.setNode(nodeYana);
        Node nodeAnna = new Node(anna);
        anna.setNode(nodeAnna);
        Node nodeStepan = new Node(stepan);
        stepan.setNode(nodeStepan);
        Node nodeMatthew = new Node(matthew);
        matthew.setNode(nodeMatthew);
        Node nodeSveta = new Node(sveta);
        sveta.setNode(nodeSveta);
        Node nodeIrina = new Node(irina);
        irina.setNode(nodeIrina);
        Node nodeVictor = new Node(victor);
        victor.setNode(nodeVictor);

        nodeYana.setFather(nodeAndrew);
        nodeYana.setMother(nodeSveta);

        nodeAndrew.addChild(nodeStepan, Parent.FATHER);
        nodeSveta.addChild(nodeStepan, Parent.MOTHER);
        nodeAndrew.addChild(nodeMatthew, Parent.FATHER);
        nodeSveta.addChild(nodeMatthew, Parent.MOTHER);

        nodeAndrew.addChild(nodeAnna, Parent.FATHER);
        nodeSveta.addChild(nodeAnna, Parent.MOTHER);

        nodeAndrew.setFather(nodeVictor);
        nodeAndrew.setMother(nodeIrina);

        // Это исследование показывает всех детей, отсортированных по первой букве имени
        Researchable reserach1 = new ResearchChildren();
        reserach1.buttonClick(andrew);
        System.out.println("----------------");
        reserach1.buttonClick(victor);
        System.out.println("----------------");
        reserach1.buttonClick(matthew);

        System.out.println("\n");

        //Это исследование показывает узел с родителями и детьми
        Researchable reserach2 = new ResearchNode();
        reserach2.buttonClick(andrew);
        System.out.println("----------------");
        reserach2.buttonClick(yana);
        System.out.println("----------------");
        reserach2.buttonClick(irina);

    }

}
