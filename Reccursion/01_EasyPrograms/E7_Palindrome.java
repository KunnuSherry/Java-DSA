public class E7_Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(121));
    }
    static int reverse(int num){
        if(num==0){
            return 0;
        }
        return (int) (num%10*(Math.pow(10,Integer.toString(num).length()-1)) + reverse(num/10));
    }
    static boolean palin(int num){
        if(num==reverse(num)){
            return true;
        }
        return false;
    }
}
