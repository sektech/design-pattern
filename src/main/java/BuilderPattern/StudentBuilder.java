package BuilderPattern;

public class StudentBuilder {
    private String name;
    private String university;
    private int  age;

    public StudentBuilder(){

    }
    public StudentBuilder setName(String _name){
        this.name = _name;
        return this;
    }
    public StudentBuilder setUniversity(String _univer){
        this.university = _univer;
        return this;
    }
    public StudentBuilder setAge(Integer _age){
        this.age = _age;
        return this;
    }
    public Student buildStudent(){
        return new Student(name,university,age);
    }
}
