class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String s1= sb.toString().toLowerCase();
        int i=0, j= s1.length()-1;
        while(i<j){
            char c1= s1.charAt(i);
            char c2= s1.charAt(j);
            if(c1!= c2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}