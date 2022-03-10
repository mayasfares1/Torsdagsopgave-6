package Task1;

public class Driver {

    String name;
    int age;

    public static void main(String[] args) {

        Driver d = new Driver();
        d.getName("Mayas");
        System.out.println();
    }

    public static void getName(int age, String name) {

        System.out.println(name + age);
    }
}