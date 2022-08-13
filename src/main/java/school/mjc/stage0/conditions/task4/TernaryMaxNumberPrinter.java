package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maximum = first;
        maximum = first >= second ? first: second;
        maximum = maximum >= third ? maximum: third;
        System.out.println(maximum);
    }
}
