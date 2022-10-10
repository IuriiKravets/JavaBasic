package HomeWork9;
/*
@ HomeWork 9
@ autor Iurii Kravets.
@ todo 04.10.2022
@ date 10.10.2022
*/

public class Cat extends Animal implements IAnimal {
    public Cat(String name, String color, int age) {
        super(name,color,age);
    }

    @Override
    public String voice(){
        return "meow!";
    }
}