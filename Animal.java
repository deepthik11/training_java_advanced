

public class Animal {
    String color;
    int noOfLegs;
}

class Dog extends Animal {
    String breed;
}

class DriverDog{
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.breed);
        System.out.println(d.color);
        System.out.println(d.noOfLegs);

        Animal a = new Animal();
        System.out.println(a.color);
        System.out.println(a.noOfLegs);
    }
}