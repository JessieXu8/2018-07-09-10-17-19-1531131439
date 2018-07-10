package practice10;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public void assignLeader(Student student){
        if (student.getKlass().getNumber() == getNumber()){
            leader = student;
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember (Student student){
        //if (student.getKlass().getNumber() == getNumber()){ }
        student.setKlass(this);
    }


    public void setLeader(Student leader) {
        this.leader = leader;
    }
    public Student getLeader(){
        return leader;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        if (number == 0){
            return "";
        }else {
            return "Class " + number;
        }
    }
}
