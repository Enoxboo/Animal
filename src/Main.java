// TP 4
void main() {
    Cow vache = new Cow("Vache", 2);
    Dog chien = new Dog("Paf", 5);

    chien.eat();
    vache.eat();

    chien.eat("de la viande");
    vache.eat("de l'herbe");
}
