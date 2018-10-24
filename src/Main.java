public class Main {
    public static void main(String[] args) {
        Les3 k = new Les3(3,5);
        System.out.println(k.toString());

    }

    public static class Les3 {
        int a;
        int b;
        Les3 (int a, int b){
            this.a = a;
            this.b = b;
        }

        public String toString(){
            return Integer.toString(a)+" + i*"+Integer.toString(b);
        }


    }

}
