package search;

import com.company.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for the search_Array Classes.
 */

class search_ArrayTest {

    private int[] intArray;

    @BeforeEach
    void initArray() {
        intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    /**
     * test pour la méthode search() de la classe search_Array_Class_1.
     */
    @Test
    void search_Array_Class_1_Test() {
        int expected = 0;
        search_Array_Class_1 objet = new search_Array_Class_1();
        objet.search(intArray, 0);
        assertEquals(expected,0);
    }

    /**
     * test pour la méthode search() de la classe search_Array_Class_2.
     */
    @Test
    void search_Array_Class_2_Test(){
        int expected = 1;
        search_Array_Class_2 objet = new search_Array_Class_2();
        assertEquals(expected, objet.search(intArray,1));
    }


    /**
     * test pour la méthode search() de la classe search_Array_Class_3.
     */
    @Test
    void search_Array_Class_3_Test(){
        int expected = 2;
        search_Array_Class_3 objet = new search_Array_Class_3();
        assertEquals(expected, objet.search(intArray,2));
    }


    /**
     * test pour la méthode search() de la classe search_Array_Class_4.
     */
    @Test
    void search_Array_Class_4_Test(){
        int expected = 3;
        search_Array_Class_4 objet = new search_Array_Class_4();
        assertEquals(expected, objet.search(intArray,3));
    }


}
