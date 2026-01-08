public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static void sleep() {
        IO.println("Zzzzz...");
    }

    public void eat() {
        IO.println(name + " mange.");
    }
}
