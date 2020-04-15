public class HammingDistance {

    public static void main(String[] args) {

    }

    public static int hammingDistance(int x, int y){
        return Integer.bitCount(x ^ y);
    }
}
