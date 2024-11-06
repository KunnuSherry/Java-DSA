public class E6_ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse(8976));
    }
    static int reverse(int num){
        if(num==0){
            return 0;
        }
        return (int) (num%10*(Math.pow(10,Integer.toString(num).length()-1)) + reverse(num/10));
    }
}
