public class SecondLargest {
    public static void find(int a[]){
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
        int a[]={2,124,6,8,506,4};


        find(a);
        System.out.println("Second Largest Element is: "+a[a.length-2]);
    }
}
