public class Example {
    public static void main(String[] args ){
        int[] arr={1,2,3,4};
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }
        try{
            System.out.println(arr[9]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }
    }
}