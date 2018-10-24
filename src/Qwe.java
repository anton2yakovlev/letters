public class Qwe {
    public static boolean correct(String s, int i) {
        if (s.length()==0) {
            return (i==0);
        }
        if (i<0) {
            return false;
        }
        if (s.charAt(0)=='(') {
            return correct(s.substring(1),i+1);
        } else if (s.charAt(0)==')') {
            return correct(s.substring(1),i-1);
        } else {
            return false;
        }

    }
}
