/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Prime {

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if ((n % 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
    }
}
