//class to calculate fibbonaci numbers
public class Fibbonaci {

    //class to calculate fibbonaci numbers recursively
    public static int fibbonaciRecursive(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibbonaciRecursive(n-1) + fibbonaciRecursive(n-2);
    }
}

