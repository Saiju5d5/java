public class validAnagram {
    public static Boolean isAnagram(String s, String t){
        s = s.toLowerCase();
        t = t.toLowerCase();
        int[] freq = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            freq[c - 'a']--;
            if(freq[c - 'a']<0){
                return false;
            }
        }
        return true;
    }    
    public static void main(String args[]){
        String s = "AnaGram";
        String t = "NagaRam";
        boolean result = isAnagram(s, t);
        System.out.println("Is Anagram : "+result);
    }
}
