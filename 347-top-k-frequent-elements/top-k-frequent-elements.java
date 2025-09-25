class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
           map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> res= new ArrayList<>(map.entrySet());
        Collections.sort(res, (a,b)-> b.getValue() - a.getValue());
        int arr[]= new int[k];
        for(int i=0;i<k;i++){
            arr[i]= res.get(i).getKey();
        }
        return arr;
    }
}