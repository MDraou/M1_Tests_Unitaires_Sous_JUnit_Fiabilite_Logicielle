package triangle;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Test class for the triangle class.
 */
class TriangleTest {

    private Triangle triangle1;
    private Triangle triangle2;
    private Triangle triangle3;

    @Test
    void testGetterEdgeLengthA(){
        float expected = 1.0F;
        triangle1 = new Triangle(1.0F,3.0F,2.0F);
        assertEquals(expected, triangle1.getEdgeLengthA());
    }

    @Test
    void testGetterEdgeLengthB(){
        float expected = 3.0F;
        triangle1 = new Triangle(1.0F,3.0F,2.0F);
        assertEquals(expected, triangle1.getEdgeLengthB());
    }

    @Test
    void testGetterEdgeLengthC(){
        float expected = 2.0F;
        triangle1 = new Triangle(1.0F,3.0F,2.0F);
        assertEquals(expected, triangle1.getEdgeLengthC());
    }

}
