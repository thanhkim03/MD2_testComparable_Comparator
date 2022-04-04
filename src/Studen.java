public class Studen implements Comparable<Studen> {
    private int id;
    private String name;
    private int age;
    private double GPA;

    public Studen() {
    }

    public Studen(int id, String name, int age, double GPA) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Studen studen) {
        if (this.age == studen.age){
            return studen.getId() -this.getId() ;
        }
        return this.getAge() - studen.getAge();
    }
 @Override
    public String toString() {
        return "Studen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }
}
