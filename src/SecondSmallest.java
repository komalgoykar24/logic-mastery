public class SecondSmallest {
    public static void find(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Second smallest element is "+a[1]);
    }
    public static void main(String[] args) {
        int a[]={2,44,6,8,9};
        find(a);
    }
}
