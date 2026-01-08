public class Cat extends Animal implements Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        IO.println("Miaou");
    }

    @Override
    public void eat() {
        IO.println(getName() + " mange les croquettes de chat.");
    }

    public void play() {
        IO.println(getName() + " s'en fout.");
    }
}
