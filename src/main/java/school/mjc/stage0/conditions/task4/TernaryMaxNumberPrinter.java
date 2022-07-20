package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatestFromThree = (first > second)
                ? first
                :
                (third > second) ?
                        third
                        : second;

        System.out.println(greatestFromThree);
    }
}
