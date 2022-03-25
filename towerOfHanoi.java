class Hanoi {
long c=0;
    public long toh(int n, int from, int to, int aux) {
        // Your code here
        
        solve(n,from,to,aux);
        return c;
    }
    public void solve(int n, int from, int to, int aux){
        if(n==0){return;}
        solve(n-1,from,aux,to);
        c++;
        System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
        solve(n-1,aux,to,from);
        return;
    }
        
}
