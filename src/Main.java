public class Main {
    public static void main(String[] args) {
        Cat safranek = new Cat("Male");
        System.out.println(safranek.getAge() +" kor "
                + safranek.getGender() + " nem "
        + safranek.getName() + " név ");

        Cat cat = new Cat("Schwarz", 10);
        System.out.println(cat.getName() + " " + cat.getAge());
    }
}
