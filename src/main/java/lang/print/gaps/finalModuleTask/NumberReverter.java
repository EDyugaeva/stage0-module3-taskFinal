package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    static public void revert(int number) {
        int c = number % 10;
        int b = number % 100 / 10;
        int a = number / 100;
        System.out.println(c * 100 + b * 10 + a );

    }

    public static void main(String[] args) {
        revert(334);
    }
}
