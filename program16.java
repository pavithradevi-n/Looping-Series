import java.util.Scanner;
class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0, num=2;
        while (count < n) {
            boolean prime=true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime=false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

