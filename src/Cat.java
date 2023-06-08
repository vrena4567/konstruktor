public class Cat {
    private String name;
    private String gender;
    private int age;

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
