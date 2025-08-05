public class FibonacciSeries {
    public static void find(int n){
        int start=0,end=1;
        System.out.print(start+" "+end+" ");
        for(int i=1;i<=n-2;i++){
            int next=start+end;
            System.out.print(next+" ");
            start=end;
            end=next;

        }
    }
    public static void main(String[] args) {
        find(7);

    }
}
