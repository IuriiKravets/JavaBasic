package Lesson8;
/* Java Basic . Homework # 7.
 @ autor Iurii Kravets.
 @ todo 26.09.2022
 @ date 28.09.2022
*/
public class Lesson8 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik","red",2);
        System.out.println(cat);
        System.out.println(cat.voice());
        System.out.println("Try to play" + cat.play());
        cat.feed();
        System.out.println("Try to play" + cat.play());
        System.out.println("Try to play" + cat.play());
        System.out.println("Try to jump" + cat.jump(1));
        System.out.println("Try to jump" + cat.jump(2));
    }
}
