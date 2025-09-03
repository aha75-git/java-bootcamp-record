import bootcamp.schulung.zoo.Animal;
import bootcamp.schulung.zoo.Owner;
import bootcamp.schulung.zoo.Species;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("John Smith", "Teststr. 4, 44453 Dortmund", 55);
        Owner owner2 = new Owner("Albert Smith", "Musterstr. 4, 44453 Dortmund", 51);

        Species speciesAffe = new Species("Affe", 500);

        Animal animal = new Animal(1, "Gibbon", speciesAffe, 25, owner);
        Animal animal2 = new Animal(2, "Gorilla", speciesAffe, 34,  owner2);

        System.out.println(animal);
        System.out.println(animal2);
        System.out.println(animal.equals(animal2));
        System.out.println(animal == animal2); // Referenzvergleich
        System.out.println("Tier: " + animal.name() + ", Besitzer: " + animal.owner().name());
        System.out.println("Tier: " + animal2.name() + ", Besitzer: " + animal2.owner().name());
    }
}
