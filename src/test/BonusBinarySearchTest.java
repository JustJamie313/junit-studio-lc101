package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static main.BonusBinarySearch.binarySearch;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    int[] pool = {0,1,2,3,5,8,13,21,34,55,89};
    @Test
    public void testReturnsNegative1WhenNotFound(){
        assertEquals(-1, binarySearch(pool,7));
    }
    @Test
    public void testReturnsZeroWhenFirstElementFound(){
        assertEquals(0,binarySearch(pool,0));
    }
    @Test
    public void testReturnsLastIndexWhenLastElementFound(){
        assertEquals(10,binarySearch(pool,89));
    }
    @Test
    public void testReturnsMiddleIndexWhenFound(){
        assertEquals(4,binarySearch(pool,5));
    }
}
