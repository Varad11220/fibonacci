public class fib{
    public static void main(String[] args) {
        int n = 10; // The number of terms to display in the sequence
        System.out.println("Fibonacci Sequence up to " + n + " terms:");

        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
