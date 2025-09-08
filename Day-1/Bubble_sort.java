import java.util.*;
public class Bubble_sort {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n ;
            System.out.println("Enter the number of elements in array : ");
            n = s.nextInt();
            int[] a = new int[n];
            System.out.print("Enter the elements on the array : ");
            for(int i = 0; i < n; i++){
                a[i] = s.nextInt();
            }
            for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < n - i - 1; j++){
                    if(a[j] > a[j+1]){
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            System.out.println("The sorted array : ");
            for(int k = 0; k < n; k++){
                System.out.print(a[k] + " ");
            }
        }
    }
}
