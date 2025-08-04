public class INVERTEDROTATEDHALFPYRAMID {
    public static void find(){
        for(int i=1;i<=4;i++){
            //for space
            for(int j=1;j<=4-i;j++){
                System.out.print("   ");
            }
            //for star
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        find();
    }
}
