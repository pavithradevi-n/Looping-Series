import java.util.Scanner;
class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp = i, sum = 0;
            while (temp > 0) {
                int d = temp % 10, fact = 1;
                for (int j = 1; j <= d; j++)
                    fact *= j;
                sum += fact;
                temp /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}
