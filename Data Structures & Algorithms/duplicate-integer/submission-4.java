class Solution {
  
      public static boolean hasDuplicate(int[] num) {
        for (int i=0 ; i< num.length; i++){
            for (int j =i+1 ; j< num.length; j++){
                if (num[i] == num[j]){
                    return true;
                }

            }
        }
        return false;
    }
}
