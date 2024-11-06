<<<<<<< HEAD
//* * * *
//* * *
//* *
//*

public class PR1 {
    public static void main(String[] args) {
        pattern(4,0);

    }
    static void pattern(int row, int col){
        if(row==0){
            return;
        }
        if(row==col){
            System.out.println();
            pattern(row-1,0);
        }
        else {
            System.out.print("* ");
            pattern(row, col+1);
        }
    }
}
=======
//* * * *
//* * *
//* *
//*

public class PR1 {
    public static void main(String[] args) {
        pattern(4,0);

    }
    static void pattern(int row, int col){
        if(row==0){
            return;
        }
        if(row==col){
            System.out.println();
            pattern(row-1,0);
        }
        else {
            System.out.print("* ");
            pattern(row, col+1);
        }
    }
}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
