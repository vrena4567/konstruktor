public class Mammal {
    private String name;
    private String gender;
    private int age;

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + "!");
    }

    public void sayHelloTo(String userName) {
        System.out.println("Hi, " + userName + "! Nice to meet you, I am " + this.name + "!");
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
