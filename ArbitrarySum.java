/**
 * Write specifications for a method that computes the sum of the 
 * first five positive integers in an array of N arbitrary integers.
 * 
 * @author Afrah Rahim
 * @date 1'March'2017
 */
public class ArbitrarySum {
    private int [] array;
    private int length;

    //Constructor
    public ArbitrarySum(){
    }

    public ArbitrarySum(int [] a){
        array = a;
    }

    /**
     * Fills the array with a N amount of random numbers between -100 and 100
     * 
     * Precondition: none
     * Postcondition: the array is filled
     * @param       int n: length of array[]
     * @return      void
     */
    public void filler(int n) {
        //Loop Invariant: 0 <= i < n
        //Loop Invariant: -100 <= array[i] < 100
        
        array = new int[n];

        for(int i=0; i<n; i++){
            //array[i] =(int) Math.random();
            array[i] = -100 + (int) (Math.random() * ((100 - (-100)) + 1));
        }
    }

    /**
     * Adds all the digits in the arbitrary array
     * 
     * Precondition: the array has been filled with "n" amount of random numbers
     * Postcondiion: the value of sum is changed according to the total sum. Zero is treated a 
     *               positive numbers. If the array is less than 5 or has less than 5 positive
     *               numbers, it will return -1 as error code.
     * @param       a[] (array of integers)
     * @return      int (the sum)
     */
    public int sum() {
        //Loop Invariant: 0 <= count < array.length
        //Loop Invariant: 0 <= temp < 5
        //Loop Invariant: sum >= -1
        
        int sum, count, temp;
        sum = count = temp = 0;

        while(count<array.length){
            if(array[count] >= 0 && temp < 5){
                sum+=array[count];
                temp++;
            }
            count++;
        }
        
        if(array.length < 5 || temp < 5){
            sum = -1;
            
            System.out.print("\f{ ");
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.print("}\n");
            
            System.err.print("\nArray is either too short or has too few psoitive numbers");
        }

        return sum;
    }

    /**
     * Returns the length of the array 
     * 
     * @param       none
     * @return      int, length of array[]
     */
    public int length(){
        length = array.length;
        return length;
    }
}
