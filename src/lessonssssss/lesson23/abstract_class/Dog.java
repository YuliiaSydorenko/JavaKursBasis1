package lessonssssss.lesson23.abstract_class;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Dog eat");
    }

    @Override
    void move() {
        System.out.println(name + " передвигается!");
    }

    @Override
    public void sayHello() {
        System.out.println(name + " says hello. Bark!");
    }

}
