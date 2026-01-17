class Solution {
    public boolean isPalindrome(String s) {
        //turn everything to lowercase
        String lowerS = s.toLowerCase();

        //loop through the string and compare
        int i = 0, j = s.length() - 1;

        while(i < j){
            //skip special characters

            if(!(Character.isLetterOrDigit(lowerS.charAt(i)))){
                i++; continue; //continue prevents wrong checks due to skips
            }
            if(!(Character.isLetterOrDigit(lowerS.charAt(j)))){
                j--; continue; //continue prevents wrong checks due to skips
            }
            
            if(!(lowerS.charAt(i) == lowerS.charAt(j))){
                return false;
            } i++; j--;
        }
        return true;
    }
}
