package HomeWork9;
/*
@ HomeWork 9
@ autor Iurii Kravets.
@ todo 04.10.2022
@ date 10.10.2022
*/
public class HomeWork9 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2);
        Dog dog = new Dog("Graf", "blec", 3);
        IAnimal[] animals={cat, dog};

        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
    }
}