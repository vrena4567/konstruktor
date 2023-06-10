public abstract class Mammal {
    protected String name;
    protected String gender;
    protected int age;

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + "!");
    }

    public void sayHelloTo(String userName) {
        System.out.println("Hi, " + userName + "! Nice to meet you, I am " + this.name + "!");
    }

    protected Mammal(String name, String gender, int age) {
        System.out.println("Mammal constructor run");
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
