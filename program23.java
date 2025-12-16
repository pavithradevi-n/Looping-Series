import java.util.Scanner;
class Q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = i;
            while (x > 9) {
                int sum = 0;
                while (x > 0) {
                    sum += x % 10;
                    x /= 10;
                }
                x = sum;
            }
            if (x == 1) System.out.print(i + " ");
        }
    }
}
