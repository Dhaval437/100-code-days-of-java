public class day1{
    public static void pattern_print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        pattern_print(n);
    }
}

