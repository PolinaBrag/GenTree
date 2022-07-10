package GenTree;

public class Person {

    enum Sex {
        MALE,
        FEMALE,
        UNKNOWN
    }

    private String name;
    private int age;
    private Sex sex;
    public Node node;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s\nВозраст: %d\n", this.name, this.age);
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

}
