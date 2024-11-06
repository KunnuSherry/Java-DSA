<<<<<<< HEAD
public class E4_SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1234424842));
    }
    static int sum(int num){
        if(num==0){
            return 0;
        }
        return num%10 + sum(num/10);
    }
}
=======
public class E4_SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1234424842));
    }
    static int sum(int num){
        if(num==0){
            return 0;
        }
        return num%10 + sum(num/10);
    }
}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
