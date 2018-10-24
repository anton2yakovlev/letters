package lessons;

public class Les1 {
    public static int ex1(int a0, int n, int b){
        if (n==0) {
            return a0;
        }
        return b + ex1(a0, n-1,b);
    }
}
