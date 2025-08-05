public class Factorial {
    public static void find(int num){
        int fact=1;
        System.out.print("Factorial of number "+num+" is :");
        while(num>0){
            fact=num*fact;
            num--;
        }
        System.out.print(fact);

    }
    public static void main(String[] args) {
        find(5);
    }
}
