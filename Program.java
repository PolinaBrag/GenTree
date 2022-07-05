package GenTree;

public class Program {
    public static void main(String[] args) {

        Person andrew = new Person("Андрей", 36, null, "Виктория", "Виктор", "Ирина", "Яна", "Матвей", null, null,
                null);
        Person sveta = new Person("Светлана", 30, "Даниил", null, "Дмитрий", "Мария", "Яна", "Матвей", null, null,
                null);
        Person yana = new Person("Яна", 7, "Матвей", null, "Андрей", "Светлана", null, null, null, null, null);
        Person matthew = new Person("Матвей", 1, null, "Яна", "Андрей", "Светлана", null, null, null, null, null);
        Person irina = new Person("Ирина", 52, null, "Софья", "Виктор", "Екатерина", "Андрей", "Виктория", "Александр",
                null, null);
        Person victor = new Person("Виктор", 57, null, null, "Степан", "Елена", "Андрей", "Виктория", "Александр", null,
                null);
        Person maria = new Person("Мария", 51, null, null, "Владимир", "Наталья", "Светлана", null, null, null, null);
        Person dmitry = new Person("Дмитрий", 55, null, "Екатерина", "Анатолий", "Галина", "Светлана", null, null, null,
                null);

        Person.getBaseInfo(maria);
        Research_1.getChildrens(maria);
        Research_2.getParents(maria);
        Research_3.getTree(maria);

        Person.getBaseInfo(andrew);
        Research_1.getChildrens(andrew);
        Research_2.getParents(andrew);
        Research_3.getTree(andrew);

        Person.getBaseInfo(victor);
        Research_1.getChildrens(victor);
        Research_2.getParents(victor);
        Research_3.getTree(victor);

        Person.getBaseInfo(matthew);
        Research_1.getChildrens(matthew);
        Research_2.getParents(matthew);
        Research_3.getTree(matthew);

    }

}
