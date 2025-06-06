class Solution {
    public int missingNumber(int[] arr) {
        //Taking the Sum of 1st N natural number
        int n= arr.length;
        int s=0;
        int sum= ((n)*(n+1))/2;
        for(int i=0;i<n;i++){
            s+= arr[i];
        }
        if(s== sum){
            return 0;
        }
        return sum-s;
    }
}