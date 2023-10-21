package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {


        switch (1 <= number && number <= 5  ? 0 : (6 <= number && number <= 10) ? 1 : 2) {

            case 0:
                System.out.println("number is between 1 and 5");
                break;
            case 1:
                System.out.println("number is between 6 and 10");
                break;
            case 2:
                System.out.println("out of range");

        }

    }

    public static void main(String[] args) {
        RangeNumbersPrinter rangeNumbersPrinter = new RangeNumbersPrinter();
        rangeNumbersPrinter.printRange(11);
    }
}
