public class Vehicle {

    String color;
    String type;
    int year;

    //no args
    public Vehicle() {

    }

    //1 arg
    public Vehicle(String color) {
        this.color = color;
    }

    //2 arg
    public Vehicle(String color, String type) {
        this.color = color;
        this.type = type;
    }

    //3 arg
    public Vehicle(String color, String type, int year) {
        this.color = color;
        this.type = type;
        this.year = year;
    }

}
