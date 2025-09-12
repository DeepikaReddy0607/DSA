class Armstrong_number {
    public static boolean armstrongNumber(int n) {
        int temp = n;
        int sum = 0;
        
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        return sum == temp;
        
    }
}