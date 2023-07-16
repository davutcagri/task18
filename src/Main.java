public class Main {
    public static void main(String[] args) {

        Vehicle veh1 = new Vehicle();
        Vehicle veh2 = new Vehicle("Red");
        Vehicle veh3 = new Vehicle("Black", "SUV");
        Vehicle veh4 = new Vehicle("White", "Super", 2021);

        System.out.println("\n-----------------\nVehicle 1 \n-----------------\n"+ "Color:" + veh1.color + "\n" + "Type: " + veh1.type + "\n" + "Year: " + veh1.year);
        System.out.println("\n-----------------\nVehicle 2 \n-----------------\n"+ "Color:" + veh2.color + "\n" + "Type: " + veh2.type + "\n" + "Year: " + veh2.year);
        System.out.println("\n-----------------\nVehicle 3 \n-----------------\n"+ "Color:" + veh3.color + "\n" + "Type: " + veh3.type + "\n" + "Year: " + veh3.year);
        System.out.println("\n-----------------\nVehicle 4 \n-----------------\n"+ "Color:" + veh4.color + "\n" + "Type: " + veh4.type + "\n" + "Year: " + veh4.year);

    }
}