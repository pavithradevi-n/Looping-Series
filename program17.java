import java.util.Scanner;
class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp = i, sum = 0;
            while (temp > 0) {
                int d=temp % 10;
                sum += d * d * d;
                temp /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}
