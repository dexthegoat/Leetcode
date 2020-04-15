/**
 * Input: 00000010100101000001111010011100
 * Output: 00111001011110000010100101000000
 * int index2 = index>>1,则表示将7转化为二进制数后向右移动一位，而原值不变，故index = 7 ,index2 = 3；
 */
public class ReverseBits {

    public static void main(String[] args) {

        int res = 1;
        int res2 = res << 1;//左移变大 右移变小
        System.out.println(res2);

        int index = 7;//000111
        int index2 = index >> 1;//000011
        System.out.println(index2);//3

        int a = 5; // 0000 0101
        int b = 3; // 0000 0011
        a |= b; // 0000 00111 有一个1就是1 全0才是0 或
        System.out.println(a);

        int c = 5; // 0000 0101
        int d = 3; // 0000 0011
        c &= d; // 0000 0001 全1才是1 有一个0就是0 与
        System.out.println(c);

        int e = 5; // 0000 0101
        int f = 3; // 0000 0011
        e ^= f; // 0000 0110 相同为0 相异为1 异或
        System.out.println(e);
    }

    private int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int end = n & 1;
            n >>= 1;
            result <<= 1;
            result |= end;
        }
        return result;
    }
}
