package bootcamp.schulung.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    @Test
    public void testAnimalCreation() {
        Owner owner = new Owner("John Smith", "Teststr. 4, 44453 Dortmund", 55);
        Species species = new Species("Hund", 100);
        Animal animal = new Animal(1, "Bello", species, 5, owner);

        assertEquals(1, animal.id());
        assertEquals("Bello", animal.name());
        assertEquals("Hund", animal.species().name());
        assertEquals(5, animal.age());
        assertEquals(owner, animal.owner());
        assertEquals(owner.name(), animal.owner().name());
    }
}