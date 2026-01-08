public abstract class Animal {
    private String name;
    private int age;
    public int size;

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

    public void eat(String food) {
        IO.println(getName() + " mange " + food + ".");
    }

    protected void digest() {
        IO.println(name + " digère.");
    }

    public void eatAndDigest(String food) {
        eat(food);
        digest();
    }

    private int calculateEnergyLevel() {
        return 100 - (age * 2);
    }

}
