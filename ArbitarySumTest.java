

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ArbitarySumTest.
 *
 * @author  (Afrah Rahim)
 */
public class ArbitarySumTest
{
    private ArbitrarySum _sum;
    /**
     * Default constructor for test class ArbitarySumTest
     */
    public ArbitarySumTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        _sum = new ArbitrarySum();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        _sum = null;
    }

    //Tests the filler method
    @Test
    public void testFiller(){
        ArbitrarySum test = new ArbitrarySum();
        test.filler(10);

        assertTrue ("Error in testFiller", test.length() == 10);
    }

    //Test the sum method
    @Test
    public void testSum(){
        int [] testArray = {9, 6, 3, 1, 5, 7, 6, 6, 3}; //All positives
        int [] testArray2 = {-3, 7, 6, 1, -9, 7, 8, -12}; //Positives and negatives
        int [] testArray3 = {-3, 7, 6, 1, 0, 7, 8, 0}; //Mix with zeros
        int [] testArray4 = {1, -3, 2, -33, -55, -10}; //Less than 5 positive integers
        int [] testArray5 = {2, -33, -55, 10}; //Less than five numbers in total
        
        ArbitrarySum test = new ArbitrarySum(testArray);
        ArbitrarySum test2 = new ArbitrarySum(testArray2);
        ArbitrarySum test3 = new ArbitrarySum(testArray3);
        ArbitrarySum test4 = new ArbitrarySum(testArray4);
        ArbitrarySum test5 = new ArbitrarySum(testArray5);
        
        int actual = test.sum();
        int actual2 = test2.sum();
        int actual3 = test3.sum();
        int actual4 = test4.sum();
        int actual5 = test5.sum();
        
        final int expected = 24;
        final int expected2 = 29;
        final int expected3 = 21;
        final int expected4 = -1;
        final int expected5 = -1;
        
        assertTrue ("Error in testSum", actual == expected);
        assertTrue ("Error in testSum", actual2 == expected2);
        assertTrue ("Error in testSum", actual3 == expected3);
        assertTrue ("Error in testSum", actual4 == expected4);
        assertTrue ("Error in testSum", actual5 == expected5);
    }
}
