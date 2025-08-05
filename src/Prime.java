public class Prime {
    public static void find(int n){
        if(n<=1){
            System.out.println("Cant find prime number..");
            return;
        }
        if(n==2){
            System.out.println(" 2 is Prime number.");
            return;
        }
        if(n % 2==0){
            System.out.println(n+" is Not Prime Number.");
            return;
        }
        else
        {
            for(int i=3;i<=Math.sqrt(n);i=i+2){
                if(n % i==0){
                    System.out.println(i+"is Not Prime Number");
                }
            }
        }
        System.out.println(n+" is Prime Number");
    }
    public static void main(String[] args) {
find(29);
    }
}
