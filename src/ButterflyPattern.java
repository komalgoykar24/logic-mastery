public class ButterflyPattern {
    public static void find(){
        //upper half
        for(int i=1;i<=5;i++){
            //first Half
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }


            //space
            for(int j=1;j<=2*(5-i);j++){
                System.out.print("  ");
            }
            //second Half
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }


            System.out.println();
        }

        //lower half
        for(int i=5;i>=1;i--){
            //first Half
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }


            //space
            for(int j=1;j<=2*(5-i);j++){
                System.out.print("  ");
            }
            //second Half
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }


            System.out.println();
        }
    }
    public static void main(String[] args) {
     find();
    }
}
