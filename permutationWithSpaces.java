class Solution{
    ArrayList<String> ans=new ArrayList<>();
    
    
    ArrayList<String> permutation(String S){
        // Code Here
       
        String out="";
        out=out+S.charAt(0);
        String inp=S.substring(1);
        //System.out.print(out);
        solve(inp,out);
        return ans;
    }
    void solve(String input,String output){
        if(input.length()==0){ans.add(output);return;}
       
        String out1=output+" "+input.charAt(0);
        String out2=output+input.charAt(0);
       input=input.substring(1,input.length());
        solve(input,out1);
        solve(input,out2);
        return;
    }
    
}
