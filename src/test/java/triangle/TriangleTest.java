package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;


/**
 * Test class for the triangle class.
 */
class TriangleTest {

    private Triangle triangle;

    @BeforeEach
    void initTriangle() {
        triangle = new Triangle(1.0F,3.0F,2.0F);
    }

    /**
     *  ajout des tests pour les getters
     */
    @Test
    void testGetterEdgeLengthA(){
        float expected = 1.0F;
        assertEquals(expected, triangle.getEdgeLengthA());
    }

    @Test
    void testGetterEdgeLengthB(){
        float expected = 3.0F;
        triangle = new Triangle(1.0F,3.0F,2.0F);
        assertEquals(expected, triangle.getEdgeLengthB());
    }

    @Test
    void testGetterEdgeLengthC(){
        float expected = 2.0F;
        assertEquals(expected, triangle.getEdgeLengthC());
    }

    /**
     *  ajout des tests pour les setters
     */
    @Test
    void SetEdgeLengthA(){
        float expected = 2.0F;
        triangle.setEdgeLengthA(2.0F);
        assertEquals(expected, triangle.getEdgeLengthA());
    }

    @Test
    void SetEdgeLengthB(){
        float expected = 2.0F;
        triangle.setEdgeLengthB(2.0F);
        assertEquals(expected, triangle.getEdgeLengthB());
    }

    @Test
    void SetEdgeLengthC(){
        float expected = 3.0F;
        triangle.setEdgeLengthC(3.0F);
        assertEquals(expected, triangle.getEdgeLengthC());
    }


    /**
     *  ajout des tests pour la méthode TriangleType type()
     */
    @Test
    void testTypeEquilateral(){
        Triangle.TriangleType expected = Triangle.TriangleType.EQUILATERAL;
        triangle = new Triangle(3.0F, 3.0F, 3.0F);
        assertEquals(expected,triangle.type());
    }

    @Test
    void testTypeIsoceles(){
        Triangle.TriangleType expected = Triangle.TriangleType.ISOCELES;
        triangle = new Triangle(2.0F, 2.0F, 3.0F);
        assertEquals(expected,triangle.type());
    }

    @Test
    void testTypeScalene(){
        Triangle.TriangleType expected = Triangle.TriangleType.SCALENE;
        triangle = new Triangle(1.0F, 2.0F, 3.0F);
        assertEquals(expected, triangle.type());
    }

    @Test
    void testTriangleFile() {
        float expected = 2.0F;
        triangle = new Triangle(new File("triangleFile"));
        assertEquals(expected, triangle.getEdgeLengthA());
    }

}
