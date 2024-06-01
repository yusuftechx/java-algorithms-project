public class Bicycle {
    private String type;
    private int year;

    public Bicycle() {
        type = "NoType";
        year = -1;
    }

    public void setType(String bicycleType) {
        type = bicycleType;
    }

    public void setYear(int bicycleYear) {
        year = bicycleYear;
    }

    public void print() {
        System.out.println(type + " " + year);
    }
}