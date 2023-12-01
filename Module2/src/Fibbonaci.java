//class to calculate fibbonaci numbers
public class Fibbonaci {

    /**
     * Takes an integer n and returns the nth term of the fibbonaci sequence.
     * <p>
     *     This method recursively calls itself to calculate the nth term of the fibbonaci sequence.
     * @param n The nth term of the fibbonaci sequence to be calculated.
     * @return int The nth term of the fibbonaci sequence.
     */
    //class to calculate fibbonaci numbers recursively
    public static int fibbonaciRecursive(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibbonaciRecursive(n-1) + fibbonaciRecursive(n-2);
    }
}

