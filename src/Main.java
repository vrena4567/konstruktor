public class Main {
    public static void main(String[] args) {

        Cat cica = new Cat("Ágó", "male", 12);
        System.out.println(cica.getName() + " " + cica.getGender() + " " + cica.getAge());



        cica.setName("Albert");
        System.out.println(cica.getName());
        cica.purr();

        People ember = new People("Anna", "nő", 18, 120, "Alma");





        ember.setHappyScore(120);
        System.out.println("happiness score of ember: " + ember.getHappyScore());
        ember.setAge(18);
        System.out.println("ember's age: " + ember.getAge());
        ember.birthDayFest();
        System.out.println("A szülinap után: kor " + ember.getAge() + " boldogságszint " + ember.getHappyScore());
    }
}
