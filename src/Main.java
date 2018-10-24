public class Main {
    public static void main(String[] args) {


    System.out.println(Les2.ex1(10));


    }

    public static class Les2{


        public static int ex1(int n){
            int sum = 0;
            for (int i = 0; i<=n; i++) {
                if (i%3==0) {
                    sum += i;
                }
            }
            return sum;
        }

    }


}
