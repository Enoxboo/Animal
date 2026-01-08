// TP 7
void main() {
    Dog chien = new Dog("Paf", 5);

    chien.play();

    Pet pet1 = new Cat("El gatito", 3);;
    pet1.play();

    ArrayList<Animal> animalsList = new ArrayList<>();
    animalsList.add((Animal) pet1);
    animalsList.add(chien);
    IO.println(animalsList);
}
