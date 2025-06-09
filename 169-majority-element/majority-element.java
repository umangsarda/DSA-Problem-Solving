class Solution {
    public int majorityElement(int[] arr) {
        int c=1;
        int el=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] == el){
                c++;
            }
            else{
                c--;
            }
            if(c == 0){
                el= arr[i];
                c=1;
            }
        }
        int ct=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== el){
                ct++;
            }
        }
        if(ct> (arr.length/2)){
            return el;
        }
        return -1;
    }
}