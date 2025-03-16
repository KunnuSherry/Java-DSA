//Memoization
class Main {
    static int[] dp = {-1,-1,-1,-1,-1,-1};
    static int fib(int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1) return dp[n];
        dp[n] = fib(n-1) + fib(n-2);
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci of 4 is: "+fib(4));
    }
}

// Tabular
class Main {
    public static void main(String[] args) {
        int n=5;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
        // Here the time complexity is o(n) and space complexity is o(n) as well.
        tabular2(5);
    }
    static void tabular2(int n){
        int prev = 0;
        int prev2 = 1;
        int curr = -1;
        for(int i=2; i<=n; i++){
            curr = prev + prev2;
            prev = prev2; 
            prev2 = curr;
        }
        System.out.println("The answer is: "+curr+" with prev and prev2 as: "+prev+" and  "+ prev2);
        //here the TC is o(n) but the SC is o(1).

    }
}