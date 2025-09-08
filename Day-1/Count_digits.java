import java.util.*;

public class Count_digits{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n;
            System.out.print("Enter the number : ");
            n = s.nextInt();
            int cnt = 1;
            while(n > 0){
                n /= 10;
                cnt++;
            }
            System.out.println("The number of digits in "+n+" is : "+cnt);
        }
    }
}