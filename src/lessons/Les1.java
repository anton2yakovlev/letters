package lessons;

public class Les1 {
    public static int ex1(int a0, int n, int b){
        if (n==0) {
            return a0;
        }
        return b + ex1(a0, n-1,b);
    }

    public static int ex2(int[] a) {
        if (a.length>0) {
            int max = a[0];
            for (int i: a) {
                if (i>max) {
                    max = i;
                }
            }
            return max;
        } else {
            return 0;
        }
    }

    public static int ex3(int[] a, int l, int r) {
        if (l == r-1) {
            return a[l];
        }
        int max1 = ex3(a, l, (l+r)/2);
        int max2 = ex3(a, (l+r)/2, r);
        if (max1>max2) {
            return max1;
        } else {
            return max2;
        }

    }

}
