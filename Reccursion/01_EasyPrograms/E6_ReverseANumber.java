<<<<<<< HEAD
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
=======
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
>>>>>>> be372f68be5095a3420265508787e91550474a6b
