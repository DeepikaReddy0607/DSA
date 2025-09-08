import java.util.*;
public class nozero_integers {
    public static void main(String[] args) {
        int n,a,b;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number : ");
            n = s.nextInt();
        }
        for(int i = 1; i < n; i++){
            a = i;
            b = n - i;
            if(haszero(a) && haszero(b)){
                System.out.println("The no zero integers of "+n+" are : "+a+" "+b);
                return;
            }
        }
    }
    public static boolean haszero(int n) {
        while(n > 0){
            if(n % 10 == 0)
                return false;
            n /= 10;
        }
        return true;
    }
}
