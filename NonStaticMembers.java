public class NonStaticMembers {
    int rno;

    public void m1() {
        System.out.println("Hello Non Static");
    }

    String name = "AIML";

    {
        System.out.println("I'm Executed at Object Creation");
    }
}

class NonStaticDriver {
    public static void main(String[] args) {

        NonStaticMembers n = new NonStaticMembers();

        System.out.println(n.rno);
        n.m1();
        System.out.println(n.name);
    }
}