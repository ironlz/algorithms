package uint2_3;

/**
 * 欧几里得算法，求取最大公约数
 */
public class Gcd {
    public static int getGcd(int m, int n){
        int max = Math.max(m,n);
        int min = Math.min(m,n);
        while(min != 0){
            int rem = max % min;
            max = min;
            min = rem;
        }
        return max;
    }
}
