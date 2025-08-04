public class SortArray {
    public static void sortArray(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={20,56,43,2,78};
        sortArray(a);
        System.out.println("Sorted Array : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
