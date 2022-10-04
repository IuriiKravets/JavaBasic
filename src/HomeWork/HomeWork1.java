package HomeWork;
/* Java Basic . Homework # 1.
@ autor Iurii Kravets.
@ version 6.09.2022
*/
public class HomeWork1 {
    public static void main(String[] args) {
        // task 1
        int a = 5;
        int b = 3;
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));

        // task 2
        int a1 = 12;
        int b1 = 8;
        int p = a1 * 2 + b1 * 2;
        int s = a1 * b1;
        System.out.println("P = " + p + " cm");
        System.out.println("S = " + s + " cm^2");

        // task 3
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 11;
        array[2] = 8;
        array[3] = 2;
        array[4] = 19;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);


        //task 4
        int a2 = 28;
        int b2 = 40; // kall в 1 см^2
        double pi = 3.14;
        double s1 = pi * a2 * a2;
        double kall = s1 * b2;
        System.out.println(s1);
    }
}
