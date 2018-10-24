import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {2,1,3,6,8,2};
        int[][] a2 = {{1,0,2},{0,0,4},{5,7,3}};
        Les2.ex2(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Les2.ex1(10));
        System.out.println(Les2.ex3(2,4));
        System.out.println(Les2.ex4(a2));

    }

    public static class Les2 {


        public static int ex1(int n) {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                if (i % 3 == 0) {
                    sum += i;
                }
            }
            return sum;
        }


        public static void ex2(int[] arr) {
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
        }


        public static int ex3(int x, int n) {
            if (n==0) {
                return 1;
            } else {
                return ex3(x, n-1)*x;
            }
        }

        public static int ex4(int[][] a) {
            int max = 0;
            for (int[] i:a){
                int k = 0;
                int k_max = 0;
                for (int j: i) {
                    if (j==0){
                        k++;
                    } else {
                        if (k>k_max){
                            k_max = k;
                        }
                        k = 0;
                    }
                }
                if (k>k_max){
                    k_max = k;
                }
                if (k_max>max) {
                    max = k_max;
                }
            }

            return max;
        }


    }

}
