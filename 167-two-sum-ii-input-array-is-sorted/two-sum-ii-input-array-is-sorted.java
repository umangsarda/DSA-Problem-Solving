class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0, n= nums.length;
        int j= n-1;
        int arr[] = new int[2];
        while(i<j){
            int sum= nums[i]+nums[j];
            if(sum> target){
                j--;
            }
            else if(sum< target){
                i++;
            }
            else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[] {-1,-1};
    }
}