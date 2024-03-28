import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WardrobeTestClass {

    private Wardrobe wardrobe_50;
    private Wardrobe wardrobe_75;
    private Wardrobe wardrobe_100;
    private Wardrobe wardrobe_120;
    private Wall wall;

    @BeforeEach
    public void setup() {
        wardrobe_50 = new Wardrobe(50);
        wardrobe_75 = new Wardrobe(75);
        wardrobe_100 = new Wardrobe(100);
        wardrobe_120 = new Wardrobe(120);
        wall = new Wall(250);
    }

    @Test
    void should_return_total_of_250_cm_for_the_wall() {
        assertEquals(wall.getLenghtOfWall(), 250);
    }

    @Test
    void should_create_wardrobe_elements_with_different_size() {
        assertEquals(wardrobe_50.getWardrobeElementSize(), 50);
        assertEquals(wardrobe_75.getWardrobeElementSize(), 75);
        assertEquals(wardrobe_100.getWardrobeElementSize(), 100);
        assertEquals(wardrobe_120.getWardrobeElementSize(), 120);
    }

}
