class Solution {
    public boolean isAnagram(String s, String t) {
        boolean output = false;

        //covert to array
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        //Sort the string arrays
        Arrays.sort(s1);
        Arrays.sort(s2);

        //compare length of anagrams 
        if(s.length() == t.length()){

            //Compare each letter in the same index
            for(int i = 0; i < s1.length; i++){
                if(s1[i] == s2[i]){
                    output = true;
                } else {
                    output = false;
                    break;
                }
            }
        }
        return output;
    }
}
