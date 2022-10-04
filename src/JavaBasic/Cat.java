package JavaBasic;

public class Cat {
    String name;
    String color;
    int age;
    boolean full;
    int jumpMax;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.jumpMax = this.jumpMax;
        this.full = false;
    }

    public String voice() {
        return this.name + " meow!";
    }

    public void feed() {
        this.full = true;
    }

    public boolean play() {
        if (this.full) {
            this.full = false;
            return true;
        } else {
            System.out.println(this.voice());
            return false;
        }
    }

    public boolean jump(int height) {
        if (this.full) {
            this.full = false;
            if (height <= this.jumpMax) {
                return true;
            } else {
                System.out.println(this.voice());
                return false;
            }
        } else {
            System.out.println(this.voice());
            return false;
        }
    }

    public String toString() {
        return "Cat: " + this.name + ", color: " + this.color + ", age: " + this.age;
    }
}
