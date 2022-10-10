package HomeWork9;
/*
@ HomeWork 9
@ autor Iurii Kravets.
@ todo 04.10.2022
@ date 10.10.2022
*/
public abstract class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name= '" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

