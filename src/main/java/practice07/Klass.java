package practice07;

public class Klass {
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
