package bootcamp.schulung.zoo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ZooTest {
    @Test
    public void testZooCreation() {
        Species dogSpecies = new Species("Hund", 300); // 300 Gramm Futterbedarf pro Tag
        Owner owner1 = new Owner("Max Mustermann", "Musterstraße 1, 12345 Musterstadt", 30);
        Owner owner2 = new Owner("Anna Beispiel", "Beispielweg 2, 54321 Beispielstadt", 28);

        Animal animal1 = new Animal(1, "Bello", dogSpecies, 5, owner1);
        Animal animal2 = new Animal(2, "Fido", dogSpecies, 3, owner2);
        Animal animal3 = new Animal(3, "Rex", dogSpecies, 4, owner1);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);

        Zoo zoo = new Zoo(animalList);

        // Erwarteter Futterbedarf: 3 Tiere * 300g = 900g
        assertEquals(900, zoo.totalFoodRequirementInGrams());
    }
}