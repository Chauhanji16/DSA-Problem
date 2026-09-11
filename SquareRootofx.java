// Find square root of given number by binary search
import java.util.*;
public class SquareRootofx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        System.out.println("Enter the number");
        long n = sc.nextInt();
        long start = 0;
        long end = n;
        long mid = (start + end) / 2;
        while (start <= end) {
            if (mid * mid == n) {
               ans=mid;
            } else if (mid * mid < n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        System.out.println(ans+ "is the approx square of the number " +n);
        sc.close();
    }
}
