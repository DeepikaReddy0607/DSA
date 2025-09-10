public class Palindrome {
    public boolean isPalindrome(int x) {
        int t=x;
        int r=0;
        while(x>0){
            int l=x%10;
            r=r*10+l;
            x = x / 10;
        }
         return t == r;
    }
}
