public class E8_CountZeros {
    public static void main(String[] args) {
        System.out.println(czeros(100, 0));
    }
    static int czeros(int num, int c){
        if (num == 0) {
            return c;
        }
        if(num%10==0){
            return czeros(num/10,c+1);
        }

        return czeros(num/10, c);




    }
}
