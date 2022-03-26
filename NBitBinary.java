class Solution {
    ArrayList<String> NBitBinary(int N) {
        // code here
         ArrayList<String> ans = new ArrayList<>();
       int one = 0;
       int zero = 0;
       String op = "";
       solve(one, zero, op, ans, N);
       
       return ans;
   }
    void solve(int one, int zero, String op, ArrayList<String> ans, int N){
         if(one + zero == N){
           ans.add(op);
           return;
       }
         if(one!=N){
           String op1 = op;
           op1 = op1 + "1";
           solve(one + 1, zero, op1, ans, N);
       }
       if(one > zero){
           String op2 = op;
           op2 = op2 + "0";
           solve(one, zero + 1, op2, ans, N);
       }
       return;
   }
    }
