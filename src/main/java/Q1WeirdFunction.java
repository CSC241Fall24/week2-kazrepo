// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function
        if(n >= 3){
            int v1 = fRecursive(n - 1);
            int v2 = 2*fRecursive(n - 2);
            int v3 = 3*fRecursive(n - 3);
            int result = v1 + v2 + v3;
            return result;
        } else {
            return n;
        }
    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        if(n < 3){
            return n;
        }
        
        int v1 = 2;
        int v2 = 1;
        int v3 = 0;
        
        int result = 0;
        
        for (int i = 3; i <= n; i++) {
            result = v1 + 2 * v2 + 3 * v3;
            
            v3 = v2;
            v2 = v1;
            v1 = result;
        }

        return result;
    }
}