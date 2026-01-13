import java.util.ArrayList;

public class Owner {
    private String name;
    private ArrayList<Pet> pets;

    public Owner(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void playWithAllPets() {
        for (Pet pet : pets) {
            pet.play();
        }
    }
}
