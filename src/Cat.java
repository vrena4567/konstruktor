import java.util.Random;

public class Cat {
    private String name;
    private String gender;
    private int age = 10;

    public Cat(String gender){
        this(gender, "anonymus", 0);
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat(String gender, String name, int age){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void eat(String food){
        System.out.println(name + " eszik " + food);
    }

    public void purr(){
        System.out.println(name + ": prrrrrrrrrrrr");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 3){
            return;
        }
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
        if(age < 0){
            Random random = new Random();
            this.age = random.nextInt(Integer.MAX_VALUE);
            return;
        }
        this.age = age;
    }

}
