package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Student student = new StudentBuilder().setName("Alex").buildStudent();
        System.out.println(student);

        StudentBuilderStatic.StudBuilder studBuilder = new StudentBuilderStatic.StudBuilder();
        studBuilder.setAge(10).setName("Steve");
        StudentBuilderStatic studentBuilderStatic = studBuilder.buildStudentClass();
        System.out.println(studentBuilderStatic);
    }

}
