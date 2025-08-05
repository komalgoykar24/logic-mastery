public class SumOfDigits {
    public static void find(int n){
        int sum=0;
        System.out.print("Sum of Number "+n+" is : ");
        while (n>0){
            int r=n % 10;
            sum=sum+r;
            n=n /10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        find(123);
    }
}
