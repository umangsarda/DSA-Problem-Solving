class Solution {
    public int maxArea(int[] h) {
        int n= h.length;
        if(n==0 || n==1){
            return 0;
        }
        int max= 0;
        int i=0,j=n-1;
        while(i<j){
            int area= (Math.min(h[i],h[j])*(j-i));
            max= Math.max(max,area);
            if(h[i]<h[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}