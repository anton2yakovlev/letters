import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {2,1,3,6,8,2};
        Les2.ex2(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Les2.ex1(10));


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


    }

}
