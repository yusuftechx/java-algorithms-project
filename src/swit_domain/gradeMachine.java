package swit_domain;

class SuperVehicle {
    private String model;
    private String color;
    private int year;
    private double topSpeed;
    private boolean isAutonomous;

    // Constructor
    public SuperVehicle(String model, String color, int year, double topSpeed, boolean isAutonomous) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.topSpeed = topSpeed;
        this.isAutonomous = isAutonomous;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isAutonomous() {
        return isAutonomous;
    }

    public void setAutonomous(boolean autonomous) {
        isAutonomous = autonomous;
    }

    // Method to accelerate
    public void accelerate() {
        System.out.println("The " + model + " is accelerating!");
    }

    // Method to brake
    public void brake() {
        System.out.println("The " + model + " is braking.");
    }

    // Method to engage autonomous mode
    public void engageAutonomousMode() {
        if (isAutonomous) {
            System.out.println("Autonomous mode engaged.");
        } else {
            System.out.println("This vehicle does not support autonomous mode.");
        }
    }

    public static void main(String[] args) {
        SuperVehicle hyperStreak = new SuperVehicle("HyperStreak", "Blue", 2023, 250.0, true);
        hyperStreak.accelerate();
        hyperStreak.brake();
        hyperStreak.engageAutonomousMode();
    }
}


