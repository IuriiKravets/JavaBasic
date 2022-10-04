package HomeWork;
/* Java Basic . Homework #3.
@ autor Iurii Kravets.
@ todo 14.09.2022
@ date 18.09.2022
*/
public class HomeWork3 {
    public static void main(String[] args) {
        int[] array = {2, 45, 32, 3, 76, 3};
        printArray(array);
        int max = getMax(array);
        System.out.println(max);
        int[] invertArray = { 0, 0, 1, 1, 0, 1, 0, 1, 1,};
        printArray(invertArray);
        printArray(invertArray(invertArray));
    }
    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println("]");
    }
    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    static int[] invertArray(int[] array) {
        int[] myarray = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            myarray[i] = 1 - array[i];
        }
        return myarray;
    }
}