package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {

      int theBiggerNumber = first < second ?
                 second
                : first;
        System.out.println(theBiggerNumber);
    }
}
