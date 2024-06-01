package gross_calculator;

public class CallDog {
    public static void main(String [] args) {
        Dog buddy = new Dog();

        buddy.setWeightAndAge(40, 9);
        System.out.print("Human years: " + buddy.getHumanYears());

    }
}