//*
//* *
//* * *
//* * * *

public class PR2 {
    public static void main(String[] args) {
        pattern(1,0);
    }
    static void pattern(int row, int col){
        if(row==5){
            return;
        }
        if(row==col){
            System.out.println();
            pattern(row+1,0);
        }
        else {
            System.out.print("* ");
            pattern(row, col+1);
        }
    }
}
