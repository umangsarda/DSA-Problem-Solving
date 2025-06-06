class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int c=0, max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== 1){
                c++;
            }
            else{
                if(c>max){
                    max=c;
                }
                c=0;
            }
        }
        if(c>max){
            max=c;
        }
        return max;
    }
}