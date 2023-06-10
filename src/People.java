public class People extends Mammal {

    private int happyScore;

    Cat myCat = new Cat();


    public int getHappyScore() {
        return happyScore;
    }

    public void setHappyScore(int happyScore) {
        this.happyScore = happyScore;
    }

    public void work() {
        System.out.println(this.getName() + " is working, so her/his happiness score decreases to: " + (happyScore - 15));
    }

    public void lunch(String food) {
        System.out.println(this.getName() + " is eating lunch: " + food + ", the happiness score is elevating to: " + (happyScore + 25));
    }

    public void birthDayFest() {
  //      age += 1;
        happyScore += 10;
    }

    public People(String name, int age, String catname) {
        myCat.setName(catname);
        this.setName(name);
        this.setAge(age);
        this.happyScore = 120;
    }

    public void pet() {
        happyScore++;
        myCat.purr();
    }
}
