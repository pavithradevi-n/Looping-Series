import java.util.Scanner;
class Q26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i * i * i <= n; i++)
            System.out.print(i * i * i + " ");
    }
}
