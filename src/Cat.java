public class Cat extends Mammal {

    public Cat(String name, String gender, int age) {
        super(name, gender, age);
    }
    public void lunch(String food) {
        System.out.println(this.getName() + " is eating: " + food);
    }

    public void purr() {
        System.out.println(this.getName() + ": prrrrrr");
    }
}
