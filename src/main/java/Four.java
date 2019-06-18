import java.util.Scanner;

public class Four {

    public static boolean check(String s) {
        int[] a = new int[s.length()];
        int border = 0;

        if (s.charAt(0) == ')' || s.charAt(0) == ']') return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                a[border] = 1;
                border++;
            }
            if (s.charAt(i) == '[') {
                a[border] = 0;
                border++;
            }
            if (s.charAt(i) == ')') {
                if (border == 0 || a[border - 1] == 0) return false;
                else border--;
            }
            if (s.charAt(i) == ']') {
                if (border == 0 || a[border - 1] == 1) return false;
                else border--;
            }
        }
        if (border != 0) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        String s = f.nextLine();
        System.out.println(check(s));
        f.close();
    }
}