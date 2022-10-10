package HomeWork9;
/*
@ HomeWork 9
@ autor Iurii Kravets.
@ todo 04.10.2022
@ date 10.10.2022
*/

public class Dog extends Animal implements IAnimal {
    public  Dog(String name, String color, int age) {
        super(name,color,age);
    }

    @Override
    public String voice() {
        return "gaf-gaf";
    }
}
