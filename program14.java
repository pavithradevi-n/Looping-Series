import java.util.Scanner;
class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0, count=0;
        while (count < n) {
            int x=sc.nextInt();
            if (x > 0) {
                sum += x;
                count++;
            }
        }
        System.out.println(sum);
    }
}

