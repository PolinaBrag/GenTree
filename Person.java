package GenTree;

public class Person {

    String name;
    int age;
    String brother;
    String sister;
    String father;
    String mother;
    String child_1;
    String child_2;
    String child_3;
    String child_4;
    String child_5;

    public Person(String name, int age, String brother, String sister, String father, String mother, String child_1, String child_2, String child_3, String child_4, String child_5){
        this.name = name;
        this.age = age;
        this.brother = brother;
        this.sister = sister;
        this.father = father;
        this.mother = mother;
        this.child_1 = child_1;
        this.child_2 = child_2;
        this.child_3 = child_3;
        this.child_4 = child_4;
        this.child_5 = child_5;
    }

    public static void getBaseInfo(Person person){
        System.out.printf("Имя: %s\nВозраст: %d\n",  person.name,  person.age);
        System.out.println("-------------");
    }

    
}
