package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeapYear;
        isLeapYear =(year % 4 == 0);

        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);
        if (isLeapYear) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }

    public static void main(String[] args) {
        LeapYearPrinter  leapYearPrinter =new LeapYearPrinter();
        leapYearPrinter.isLeapYear(2024);
    }
}

