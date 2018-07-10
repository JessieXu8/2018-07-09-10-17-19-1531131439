package practice08;

public class Klass {
    private Student leader;

    public void assignLeader(Student student){
        leader = student;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }
    public Student getLeader(){
        return leader;
    }

    public Klass(int number) {
        this.number = number;
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

    private int number;
}
