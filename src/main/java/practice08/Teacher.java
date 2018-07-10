package practice08;

public class Teacher extends Person{
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }
    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public String introduce(){
        if(klass == null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }else {
            return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
        }
    }

    public String introduceWith(Student student){
        if (student.getKlass() == this.getKlass()){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else {
            return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}
