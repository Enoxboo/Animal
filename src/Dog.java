public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        IO.println("Waf");
    }

    @Override
    public void eat() {
        IO.println(getName() + " mange les croquettes de chieng.");
    }

}
