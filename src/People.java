public class People {
    private String name;
    private String gender;
    private int age;
    private int happyScore;
    private Cat myCat;

    public People(String name, String gender, int age, int happyScore, Cat myCat) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.happyScore = happyScore;
        this.myCat = myCat;
    }

    public void work(){
        happyScore--;
        System.out.println(name + " dolgozik");
    }

    public void lunch(String food){
        happyScore++;
        System.out.println(name + " eszik " + food);
    }

    public void birthDayFest(){
        happyScore += 5;
        age++;
        System.out.println(name + " szülinapja van");
    }
    public void pet(){
        myCat.purr();
        this.happyScore++;
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

    public int getHappyScore() {
        return happyScore;
    }

    public void setHappyScore(int happyScore) {
        this.happyScore = happyScore;
    }

    public void setMyCat(Cat myCat){
        this.myCat = myCat;
    }

    public Cat getMyCat(){
        return myCat;
    }
}
