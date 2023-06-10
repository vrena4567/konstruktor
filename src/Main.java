public class Main {
    public static void main(String[] args) {

        Cat cica = new Cat();
        cica.setName("Albert");
        System.out.println(cica.getName());
        cica.purr();

        People ember = new People();
        ember.setHappyScore(120);
        System.out.println("happiness score of ember: " + ember.getHappyScore());
        ember.setAge(18);
        System.out.println("ember's age: " + ember.getAge());


    }
}
