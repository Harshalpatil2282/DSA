class Solution{
    public double myPow(double x, int n) {
        // Time complexity = O(n) 
    //     double result = 1.0f;
    //     if(n<0){
    //         for(int i=0 ; i<(n-n+(-n)); i++){
    //             result = result*x;
    //         }
            

    //         result = 1/result;
    //     }else{
    //         for(int i = 0; i<n; i++){
    //             result = result*x;
    //         }
    //     }
    // return result;
    // } 

        // Optimum solution time complexity = O(logn)

        if(n == 0) return 1; // x^0 = 1
        if(n == 1) return x; // x^1 = x 
        if(x == -1 && n % 2 == 0) return 1; // (-1)^even = 1
        if(x == -1 && n % 2 == 1) return -1;// (-1)^odd = -1

        long binForm = n;
        double res = 1;
        if(binForm < 0){
            binForm = -binForm;
            x = 1/x;
        }
        while(binForm>0){
            if(binForm % 2 == 1){
                res *= x;
            }
            x *= x;
            binForm /= 2 ;  
        }
        return res;
}
}


public class Pow_xn {
    public static void main(String[] args){
        Solution sl = new Solution();
        System.out.println(sl.myPow(2, 10));
        System.out.println(sl.myPow(1, 10));
        System.out.println(sl.myPow(-1, 10));
        System.out.println(sl.myPow(-1, 3));
        System.out.println(sl.myPow(2, 1003455));
        System.out.println(sl.myPow(2, -100304));
        System.out.println(sl.myPow(2, 100));

    }
}
