package triangle;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.fail;
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
        float expected = 6.0F;
        triangle1 = new Triangle(1.0F,3.0F,2.0F);
        // à continuer
    }

}
