class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp= nums[c];
                nums[c]= nums[i];
                nums[i]= temp;
                c++;
            }
        }
    }
}