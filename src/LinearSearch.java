public class LinearSearch {
    public static void findKey(int key ,int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("Element " +a[i]+" found at "+i+" Index. ");
            }

            }
        System.out.println("Element NOT found");
        }

    public static void main(String[] args) {
        int a[]={2,4,6,8};
        findKey(18,a);
    }
}

