public class E5_ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(product(124));
    }
    static int product(int num){
        if(num==0){
            return 1;
        }
        return num%10 * product(num/10);
    }
}
