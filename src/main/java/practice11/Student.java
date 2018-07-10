package practice11;

public class Student extends Person{
    private Klass klass;

    Student(int id,String name, int age) {
        super(id,name, age);
    }

    Student(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        if(klass.getLeader() != null &&  getId() == klass.getLeader().getId() ){
            return super.introduce()+" I am a Student. I am Leader of "+klass.getDisplayName()+".";
        }else {
            return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
        }
    }
}
