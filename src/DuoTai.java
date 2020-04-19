public class DuoTai {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        Animal b = new Dog();
        b.eat();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}

abstract class Animal {
    abstract public void eat();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("eat fish");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("eat bone");
    }
}