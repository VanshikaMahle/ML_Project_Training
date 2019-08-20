package OOP_Constructor_Demo;

public class ConstructorDemo {
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public ConstructorDemo(int number, String name){
        this.name = name;
        this.number = number;

    }
}

