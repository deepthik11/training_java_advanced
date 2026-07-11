package day6;

public class swapletters {
    public static void main(String[] args)
    {
      System.out.println("Enter a string to swap first and last letters:");
      String s = new java.util.Scanner(System.in).nextLine();

        char[] arr = s.toCharArray();
        
        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    
        String swapped = new String(arr);
        System.out.println(swapped);
    }
    }
