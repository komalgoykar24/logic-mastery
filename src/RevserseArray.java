public class RevserseArray {
    public static void find(int a[]){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        find(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
