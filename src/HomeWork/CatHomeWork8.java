package HomeWork8;
/*
@ HomeWork 8
@ autor Iurii Kravets.
@ todo 28.09.2022
@ date 3.10.2022
*/
class Cat{
    String name;
    String color;
    int age;
    boolean full;
    int jumpMax;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.jumpMax = jumpMax;
        this.full = false;

        }

        public String voice() {
            return name + " " + "meow!";
        }

        public void feed() {
            full = true;
        }

        public boolean play() {
            if (full) {
                full = false;
                return true;
            } else {
                System.out.println(voice());
                return false;
            }
        }

        public boolean jump(int height) {
            if (full) {
                full = false;
                if (height <= jumpMax) {
                    return true;
                }else {
                    System.out.println(voice());
                    return false;
                }
            } else {
                System.out.println(voice());
                return false;
            }
        }

        public String toString() {
            return "Cat: " + name + ", color: " + color + ", age: " + age;
        }
    }

