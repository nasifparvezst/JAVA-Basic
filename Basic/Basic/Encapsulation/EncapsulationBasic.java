public class EncapsulationBasic {
    private String name;
    private int age;
    static String country = "Qatar";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void display() {

        System.out.print(getName() + " ");
        System.out.print(getAge() + " ");
        System.out.println(country + " ");
    }
}
