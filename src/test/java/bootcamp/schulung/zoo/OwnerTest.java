package bootcamp.schulung.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OwnerTest {
    @Test
    public void testOwnerCreation() {
        Owner owner = new Owner("Anna Beispiel", "Beispielweg 2, 54321 Beispielstadt", 28);

        assertEquals("Anna Beispiel", owner.name());
        assertEquals(28, owner.age());
        assertEquals("Beispielweg 2, 54321 Beispielstadt", owner.address());
    }
}