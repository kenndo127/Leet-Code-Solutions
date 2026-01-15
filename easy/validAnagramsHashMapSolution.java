class Solution {
    public static boolean isAnagram(String s, String t) {
        boolean output = false;

        //Create a hashmap for both strings
        HashMap<Character, Integer> str1 = new HashMap<>();
        HashMap<Character, Integer> str2 = new HashMap<>();

        //Check for validity of length
        if(s.length() != t.length()){
            return false;
        }

        //add characters to a map
        for(int i = 0; i < s.length(); i++){
            if(!(str1.containsKey(s.charAt(i)))){
                str1.put(s.charAt(i), 1);
            }else{
                str1.put(s.charAt(i), (str1.get(s.charAt(i)) + 1));
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(!(str2.containsKey(t.charAt(i)))){
                str2.put(t.charAt(i), 1);
            }else{
                str2.put(t.charAt(i), (str2.get(t.charAt(i)) + 1));
            }
        }

        //compare the two hashmaps
        if(str1.equals(str2)){
            output = true;
        }
        return output;
    }
}
