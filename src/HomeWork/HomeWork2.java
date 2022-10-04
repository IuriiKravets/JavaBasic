package HomeWork;
/* Java Basic . Homework # 2.
 @ autor Iurii Kravets.
 @ todo 7.09.2022
 @ date 9.09.2022
 */
public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(checkWeather(23));
        System.out.println(canWalk(true, false));
        System.out.println(add(3, 8));
        System.out.println(sub(6, 0));
        System.out.println(mult(7, 4));
        System.out.println(div(4, 65));
        System.out.println(dayOfWeek(6));
        System.out.println(canBuyFood(true, false));
    }
    static String checkWeather(int temp) {
        if (temp < 0) {
            return "It `s frost";
        } else if (temp <= 18) {
            return "It`s cold";
        } else if (temp <= 28) {
            return "It`s warm";
        } else {
            return "It`s hot";
        }
    }
    static String canWalk(boolean isWeekend, boolean isRain) {
        if (isWeekend && !isRain) {
            return "I`can walk";
        } else
            return "I`connot walk";
    }
    static int add(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mult(int a, int b) {
        return a * b;
    }
    static float div(float a, float b) {
        return a / b;
    }
    static String dayOfWeek(int d) {
        switch (d) {
            case 1:
                return "Today is Sunday";
            case 2:
                return "Today is Monday";
            case 3:
                return "Today is Tuesday";
            case 4:
                return "Today is Wednesday";
            case 5:
                return "Today is Thursday";
            case 6:
                return "Today is Friday";
            case 7:
                return "Today is Saturday";
        }
        return ("output error of the day");
    }
    static boolean canBuyFood(boolean isLidlOpen, boolean isTescoOpen) {
        if (isLidlOpen && !isTescoOpen) {
            System.out.println("I can buy food in Lidl ");
        } else if (!isLidlOpen && isTescoOpen) {
            System.out.println("I can buy food in Tesco ");
        } else if (!isLidlOpen && !isTescoOpen) {
            System.out.println("I can`t buy food");
        } else if (isLidlOpen && isTescoOpen) {
            System.out.println("I can buy food in Lidl && I can buy food in Tesco");
        }
        return isLidlOpen || isTescoOpen;
    }
}
