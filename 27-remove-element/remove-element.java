class Solution {
    public int removeElement(int[] arr, int val) {
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!= val){
                int temp= arr[i];
                arr[i]= arr[index];
                arr[index]= temp;
                index++;
            }
        }
        return index;
    }
}