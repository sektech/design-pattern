package BuilderPattern;

public class StudentBuilderStatic {
    private String name;
    private String university;
    private int  age;

    public  StudentBuilderStatic(StudBuilder builder){
        this.name = builder.name;
        this.university=builder.university;
        this.age=builder.age;
    }

    @Override
    public String toString() {
        return "StudentBuilderStatic{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                '}';
    }

    public static class StudBuilder{
        private String name;
        private String university;
        private int  age;
        public StudBuilder setName(String _name){
            this.name = _name;
            return this;
        }
        public StudBuilder setUniversity(String _univ){
            this.university = _univ;
            return this;
        }
        public StudBuilder setAge(Integer _age){
            this.age = _age;
            return this;
        }
        public StudentBuilderStatic buildStudentClass(){
            return new StudentBuilderStatic(this);
        }
    }
}
