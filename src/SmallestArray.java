public class SmallestArray {
    public static void findSmalles(int a[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Smallest value in array is :"+min);
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,0,7};
        findSmalles(a);
    }
}
