// TP 5
void main() {
    Cow vache = new Cow("Vache", 2);
    Dog chien = new Dog("Paf", 5);

    chien.eat();
    vache.eat();

    chien.eat("de la viande");
    vache.eat("de l'herbe");

    // Saperlipopette je n'ai pas accès à vache.name, je dois passer par la methode getName()
    chien.eatAndDigest("Croquettes");
    // Je ne peux pas acceder à la méthode calculateEnergyLevel() car elle est privée
    IO.println(chien.size);
    chien.size = 10;
    IO.println(chien.size);
    // Je peux acceder à la variable size et la modifier mais ce n'est pas une bonne pratique
}
