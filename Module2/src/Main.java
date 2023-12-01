public class Main {

        public static void main(String[] args) {
            int n = 10;
            //call fibbonaciRecursive method from Fibbonaci class
            int result = Fibbonaci.fibbonaciRecursive(n);
            System.out.println("Term " + n + " of the fibbonaci sequence is: " + result);
        }
}
