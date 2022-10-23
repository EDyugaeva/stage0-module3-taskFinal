package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int a = number % 10; // 4
        int b = number % 100 / 10; // 3
        int c = number / 100 % 10; // 2
        int d = number / 1000; // 1
        System.out.println(a + b+ c+d);

    }

    public static void main(String[] args) {
        System.out.println(1234 / 100 %10);
    }
}

