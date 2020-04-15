public class PowerOf3 {

    public static void main(String[] args) {
        boolean res = new PowerOf3().isPowerOfThree(175783);
        System.out.println(res);
    }

    public boolean isPowerOfThree(int n){
        //We will use the regular expression above for checking if the string starts with 1 ^1,
        //is followed by zero or more 0s 0* and contains nothing else ＄.
        return Integer.toString(n, 3).matches("^10*$");
    }
}
