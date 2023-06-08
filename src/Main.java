public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat("Schwarz", 10);
        System.out.println(cat.getName() + " " + cat.getAge());

        People jimmy = new People("Jimmy","male", 17,1000, cat);
        jimmy.pet();
    }
}
