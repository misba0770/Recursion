class solve
{
    //HashSet<ArrayList<Integer>> ans=new HashSet<>();
    //Function to find all possible unique subsets.
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
        // your code here
        ArrayList <ArrayList <Integer>> ans=new ArrayList <ArrayList <Integer>>();
        solve(arr,n,0,new ArrayList<>(),ans);
        return ans;
        
    }
    public static void solve(int[] arr,int n,int start,ArrayList<Integer> as,ArrayList<ArrayList<Integer>> ans){
        if(!as.isEmpty()&&!ans.contains(as))ans.add(as);
        for(int i=start;i<n;i++){
            ArrayList<Integer> x=new ArrayList<>(as);
            x.add(arr[i]);
            solve(arr,n,i+1,x,ans);
        }
    }
}
