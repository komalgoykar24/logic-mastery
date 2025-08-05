public class Armstrong {
    public static void find(int n){
        int sum=0;
        int x=n;

        while(n>0){
            int r=n % 10;
            sum=sum+ r*r*r;
            n=n /10;
        }
        if(sum==x){
            System.out.println(x+" is Armstrong number");
        }
        else{
            System.out.println(x+" is NOT Armstrong number");
        }
    }
    public static void main(String[] args) {
        find(113);
    }
}
