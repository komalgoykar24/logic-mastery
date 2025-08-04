public class LargestInArray {
    public static  void find(int a[]){
       int max=Integer.MIN_VALUE;
       for(int i=0;i<a.length;i++){
           if(a[i]>max){
               max=a[i];
           }
       }
        System.out.println("Largest elemnt in array is "+max);
    }
    public static void main(String[] args) {
        int a[]={2,47,6,8};
        find(a);


    }
}
