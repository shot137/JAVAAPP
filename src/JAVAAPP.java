
/**
 * Александр Литвинов, задание №1, 02.06.2019
 */

public class JAVAAPP {
    public static void main(String[] args) {
        byte q = 120;
        short w = 16000;
        int e = 34;
        long r = -150000L;
        float t = 23.45f;
        double y = -15.467;
        char u = 0;

        System.out.println(calculate(5, 7, 11, 29));
        System.out.println(task10and20(12, 6));
        isPositiveOrNegative(-15);
        System.out.println(isNegative(-9));
        greetings(" Александр !");
    }

    public static double calculate(int a, int b, double c, double d) {
        return a * (b + (c / d));
    }

    public static  boolean task10and20(int x1, int x2) {
        int summ = x1 + x2;
        if (summ > 10 && summ <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void  isPositiveOrNegative(int x) {
        if(x<0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
    public static boolean isNegative(int y) {
        if(y<0) {
            return true;
        }
        return false;
    }
    public static void greetings(String name) {
        System.out.println("Привет" + name);
    }



}