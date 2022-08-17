class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.",
                          "....","..",".---","-.-",".-..","--","-.",
                          "---",".--.","--.-",".-.","...","-","..-",
                          "...-",".--","-..-","-.--","--.."};
        
        int len = words.length;
        String[] transformations = new String[len];
        Set<String> set = new HashSet<String>();
        for(int i=0; i<len; i++) {
            int l=words[i].length();
            transformations[i] = "";
            for(int j=0; j<l; j++) {
                transformations[i] += morse[words[i].charAt(j)-97];
            }
            set.add(transformations[i]);
        }
        return set.size();
    }
}