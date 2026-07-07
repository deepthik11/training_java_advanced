public class Example2 {
    public static void m1() throws Exception
    {
        throw new ArithmeticException("dont divide by zero");
    }
    public static void abc() throws Exception
    {
        m1();

    }
    public static void main(String[] args) {
        try{
            abc();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
