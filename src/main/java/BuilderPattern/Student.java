package BuilderPattern;

public class Student {
    private String name;
    private String university;
    private int  age;

    public Student(String name, String university, int age) {
        this.name = name;
        this.university = university;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                '}';
    }
}
