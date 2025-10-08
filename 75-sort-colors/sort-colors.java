class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int c0 = map.getOrDefault(0, 0);
        int c1 = map.getOrDefault(1, 0);
        int c2 = map.getOrDefault(2, 0);
        for(int i=0;i<c0;i++){
            nums[i]=0;
        }
        for(int i=c0;i<c0+c1;i++){
            nums[i]=1;
        }
        for(int i=c1+c0;i<nums.length;i++){
            nums[i]=2;
        }
    }
}