/**
 * Created by adamhurwitz on 3/10/16.
 */
public class JavaClass {
    static int[] a = {1, 2, 3, 4, 6};

    public static void main(String arg[]) {
        System.out.println(findError(a));
    }

    static public int findError(int[] a) {
        int index = 0;
        for (int n = 1; n < a.length; n++) {
            if(n == a.length && isOrdr(n) == false){
                return n;
            }
            else if (isOrdr(n) == false) {
                return n;
            }
        }
        return -1;
    }

    static public boolean isOrdr(int n){
        if(a[n] - 1 == a[n-1]){
            return true;
        }
        return false;
    }
}