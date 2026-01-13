import java.util.ArrayList;

public class Owner {
    private ArrayList<Pet> pets;

    public Owner(String name) {
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void playWithAllPets() {
        for (Pet pet : pets) {
            pet.play();
        }
    }
}
