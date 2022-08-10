class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[s.length()];
       for(int i = 0; i < s.length(); i++){
           if(s.indexOf(s.charAt(i)) == i){
               arr[i]++;
           }
           else{
               arr[s.indexOf(s.charAt(i))]++;
           }
       }
        for(int i = 0; i < arr.length; i++){
           if(arr[i] == 1){
               return i;
           }
        }
        return -1;
    }
}