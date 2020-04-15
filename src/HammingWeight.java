public class HammingWeight {

    public static void main(String[] args) {
        String n = Integer.toBinaryString(50);
        System.out.println(n);
        //System.out.println(hammingWeight());
    }

    public static int hammingWeight(int n){
        int sum = 0;
        while (n != 0){
            sum++;
            n &= (n-1);
        }
        return sum;
    }
}
