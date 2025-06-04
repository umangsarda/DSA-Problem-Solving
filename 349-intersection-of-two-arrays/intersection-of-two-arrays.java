class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        int i=0, j=0, lastAdded= -1;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n1= arr1.length;
        int n2= arr2.length;
        ArrayList <Integer> res= new ArrayList<>();
        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                if(lastAdded == -1 || lastAdded != arr2[j]){
                    res.add(arr2[j]);
                    lastAdded= arr2[j];
                }
                    j++;
                    i++;
            }
        }
        int arr[]= new int[res.size()];
        int a=0;
        for(int c : res){
            arr[a]= c;
            a++;
        }
        return arr;
    }
}