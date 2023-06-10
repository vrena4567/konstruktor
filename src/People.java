public class People extends Mammal {
    private int happyScore;

    Cat myCat = new Cat("Alma", "male", 2);


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
        this.age++;
        happyScore += 10;
    }

  public People(String name, String gender, int age, int happyScore, String catname) {
        super(name, gender, age);
      this.happyScore = happyScore;
      myCat.setName(catname);
  }

    public void pet() {
        happyScore++;
        myCat.purr();
    }
}
