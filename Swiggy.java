public class Swiggy {
    public static void orderFood() {
        System.out.println("Ordering food from Swiggy");
    }
    public static void orderFood(String message) {
        System.out.println("Ordering " + message + " from Swiggy");
    }
    public static void orderFood(String message, int quantity) {
        System.out.println("Ordering " + quantity + " " + message + " from Swiggy");
}
public static void main(String[] args) {
        orderFood();
        orderFood("Pizza");
        orderFood("Burger", 2);
    }
}