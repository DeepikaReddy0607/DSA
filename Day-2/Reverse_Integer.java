import java.util.Scanner;
public class Reverse_Integer {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n;
            System.out.println("Enter the number : ");
            n = s.nextInt();
            int sol = reverse(n);
            System.out.println("The reversed number : "+sol);
        }
    }
    public static int reverse(int x) {
        long rev = 0;  
        
        while (x != 0) {
            int digit = x % 10;   
            rev = rev * 10 + digit; 
        }
        
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}
