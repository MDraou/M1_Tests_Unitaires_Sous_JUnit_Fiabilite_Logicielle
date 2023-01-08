package search;

import com.company.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Test class for the search_Array Classes.
 */

// à continuer
class search_ArrayTest {

    private int[] t;

    private int expected;


    /**
     * test pour la méthode search() de la classe search_Array_Class_1.
     */

    // à modifier
    @Test
    void search_Array_Class_1_Test() {

        int expected = 0;
        search_Array_Class_1 objet = new search_Array_Class_1();
        int[] t = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        objet.search(t, 0);
        assertEquals(expected,0);
        assertNotEquals(expected, 1);

    }

    @Test
    void search_Array_Class_2_Test(){
        int expected = 1;
        search_Array_Class_2 objet = new search_Array_Class_2();
        int[] t = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        objet.search(t,1);
        assertEquals(expected, 1);
        assertNotEquals(expected, 2);
    }

    @Test
    void search_Array_Class_3_Test(){
        int expected = 2;
        search_Array_Class_2 objet = new search_Array_Class_2();
        int[] t = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        objet.search(t,2);
        assertEquals(expected, 2);
        assertNotEquals(expected, 3);
    }


    @Test
    void search_Array_Class_4_Test(){
        int expected = 3;
        search_Array_Class_2 objet = new search_Array_Class_2();
        int[] t = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        objet.search(t,3);
        assertEquals(expected, 3);
        assertNotEquals(expected, 4);
    }


}
