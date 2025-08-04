public class Pattern1 {
    public static void findPattern(){
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     findPattern();
    }
}
