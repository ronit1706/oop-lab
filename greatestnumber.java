import java.util.*;

public class greatestnumber {
    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = numbers.nextInt();
        int b = numbers.nextInt();
        int c = numbers.nextInt();

        System.out.println("The greatest number is: " + Math.max(a, Math.max(b, c)));
    }

}
