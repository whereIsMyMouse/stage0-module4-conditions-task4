package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maximum = first;
        if (maximum < second){
            maximum = second;
        }
        if (maximum < third){
            maximum = third;
        }
        System.out.println(maximum);
    }
}
