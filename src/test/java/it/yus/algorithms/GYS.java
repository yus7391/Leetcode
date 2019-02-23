package it.yus.algorithms;

/**
 * 求两个数的最大公约数
 *
 * @author yusong
 * @version 1.0
 * @date 2019/2/20 18:36
 */
public class GYS {

    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
    
    public static void main(String[] args){
        int gcd = gcd(5, 2);
        System.out.println(gcd);

        System.out.println('b'); // b
        System.out.println('b' + 'c'); // 197
        System.out.println((char) ('a' + 4)); // e
        System.out.println(Character.MAX_VALUE + 0); // 65535  \uffff
        System.out.println(Integer.MAX_VALUE); // 2147483647   0x7fffffff
        
        System.out.println(1 << 16); // 65536
        System.out.println((1 << 30) + ((1 << 30) - 1) ); //2147483647
    }
}
