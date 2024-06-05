package Algebra;

public class Math {
    public static int abs(int n) {
        if ( n < 0 ) {
            return -n;
        }
        return n;
    }
    public static int pow(int a, int b) {
        if ( b == 0 ) {
            return 1;
        }
//        a = 2, a = 2 * 2
//        a = 4, a = 4 * 4
//        a = 2 * 2 * 2
        int temp = 1;
        for ( int i = 0; i < b; i++ ) {
            temp *= a;
        }
        return temp;
    }
    public static int max(int a, int b) {
//        Toan tu 3 ngoi
        return a > b ? a : b;
    }
    public static int max(int a, int b, int c) {
        return max(a, max(b, c));
    }
}
