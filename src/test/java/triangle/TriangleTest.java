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


    /**
     *  ajout des tests pour les getters
     */
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

    /**
     *  ajout des tests pour les setters
     */
    @Test
    void SetEdgeLengthA(){
        float expected = 1.0F;
        triangle1 = new Triangle(1.0F, 3.0F, 2.0F);
        triangle1.setEdgeLengthA(expected);
        assertEquals(expected, 1.0F);
    }

    @Test
    void SetEdgeLengthB(){
        float expected = 3.0F;
        triangle1 = new Triangle(1.0F,3.0F,2.0F);
        triangle1.setEdgeLengthB(expected);
        assertEquals(expected, 3.0F);
    }

    @Test
    void SetEdgeLengthC(){
        float expected = 2.0F;
        triangle1 = new Triangle(1.0F,3.0F,2.0F);
        triangle1.setEdgeLengthB(2.0F);
        assertEquals(expected, 2.0F);
    }


    /**
     *  ajout des tests pour la méthode TriangleType type()
     */
    @Test
    void testTypeEquilateral(){
        Triangle.TriangleType expected = Triangle.TriangleType.EQUILATERAL;
        triangle2 = new Triangle(3.0F, 3.0F, 3.0F);
        assertEquals(expected,triangle2.type());
    }

    @Test
    void testTypeIsoceles(){
        Triangle.TriangleType expected = Triangle.TriangleType.ISOCELES;
        triangle2 = new Triangle(2.0F, 2.0F, 3.0F);
        assertEquals(expected,triangle2.type());
    }

    @Test
    void testTypeScalene(){
        Triangle.TriangleType expected = Triangle.TriangleType.SCALENE;
        triangle3 = new Triangle(1.0F, 2.0F, 3.0F);
        assertEquals(expected, triangle3.type());
    }



}
