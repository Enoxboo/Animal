public class Cat extends Animal implements Pet, Wild {
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

    @Override
    public void play() {
        IO.println(getName() + " s'en fout.");
    }

    @Override
    public void hunt() {
        IO.println(getName() + " chasse des souris.");
    }
}
