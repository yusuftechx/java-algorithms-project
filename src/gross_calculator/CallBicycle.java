public class CallBicycle {
    public static void main(String[] args) {
        Bicycle commuterBike = new Bicycle();

        commuterBike.print();

        commuterBike.setType("fitness");

        commuterBike.print();
    }
}