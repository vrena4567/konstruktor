public class People {
    private String name;
    private String gender;
    private int age;
    private int happyScore;

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
}
