package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        return id == ((Person)obj).getId() ;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
}
