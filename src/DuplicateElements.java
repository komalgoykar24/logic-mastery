public class DuplicateElements {
   public static void find(int a[]){
       boolean visited[]=new boolean[a.length];
       System.out.println("Duplicate elemnts are :");
       for(int i=0;i< a.length;i++){
           if(visited[i]) continue;
           boolean isDuplicate=false;
           for(int j=i+1;j<a.length;j++){

               if(a[i]==a[j]){
                   isDuplicate=true;
                   visited[j]=true;

               }
           }
           if(isDuplicate){
               System.out.println(a[i]);
           }
       }
   }

    public static void main(String[] args) {
        int a[] = {1, 6, 2, 8, 5, 6, 8, 1};
        find(a);
    }
}
