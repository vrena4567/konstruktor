public class Cat extends Mammal {

    public void lunch(String food) {
        System.out.println(this.getName() + " is eating: " + food);
    }

    public void purr() {
        System.out.println(this.getName() + ": prrrrrr");
    }
}
