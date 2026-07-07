public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;

        // Post Increment
        System.out.println("Post Increment (a++) : " + (a++));
        System.out.println("Value of a after a++ : " + a);

        // Pre Increment
        System.out.println("\nPre Increment (++b) : " + (++b));
        System.out.println("Value of b after ++b : " + b);

        // Post Decrement
        System.out.println("\nPost Decrement (c--) : " + (c--));
        System.out.println("Value of c after c-- : " + c);

        // Pre Decrement
        System.out.println("\nPre Decrement (--d) : " + (--d));
        System.out.println("Value of d after --d : " + d);
    }
}