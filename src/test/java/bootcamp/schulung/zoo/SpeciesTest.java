package bootcamp.schulung.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpeciesTest {
    @Test
    public void testSpeciesCreation() {
        Species species = new Species("Affe", 500);

        assertEquals("Affe", species.name());
        assertEquals(500, species.foodRequirementInGrams());
    }
}