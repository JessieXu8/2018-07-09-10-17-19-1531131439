package practice10;

import java.util.LinkedList;

public class Teacher extends Person{

    private LinkedList<Klass> classes = new LinkedList<>();

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }
    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }
    public Teacher(int id,String name, int age, LinkedList<Klass> classes) {
        super(id,name, age);
        this.classes = (LinkedList<Klass>) classes.clone();
    }

    public String introduce(){
        String teachOrNot = "No Class";
        if(!(classes.isEmpty())) {
            teachOrNot = "Class ";
            for(Klass klass:classes){
                String tmp = String.valueOf((klass.getNumber()));
                teachOrNot+= tmp;
                if(classes.getLast()!=klass)
                    teachOrNot+= ", ";
            }
        }
        return super.introduce() + String.format(" I am a Teacher. I teach %s.", teachOrNot);
    }

    public String introduceWith(Student student){
        String teachOrNot = isTeaching(student)?"teach":"don't teach";
        return super.introduce()+String.format(" I am a Teacher. I %s %s.", teachOrNot, student.getName());
    }

    public Boolean isTeaching(Student student){
        boolean isTeach = false;
        for (Klass klass: classes){
            if(klass.equals(student.getKlass())){
                isTeach = true;
                break;
            }
        }
        return isTeach;
    }
}
