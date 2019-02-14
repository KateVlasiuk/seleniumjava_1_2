import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        public static boolean isPermutation(String s1, String s2){
            Map<Character, Integer> stringMap = new HashMap<Character, Integer>();
            if (s1.length() != s2.length()) return false;
            for (int i = 0; i < s1.length(); i++){
                stringMap.put(s1.charAt(i), stringMap.getOrDefault(s1.charAt(i),0)+1);
            }
            for (int i = 0; i < s1.length(); i++){
                if (stringMap.getOrDefault(s2.charAt(i),0)==0) return false;
                else {
                    stringMap.put(s2.charAt(i),stringMap.get(s2.charAt(i))-1);
                }
            }
            return true;
        }
        public static boolean isPermutation_2(String s1, String s2){
            if ( s1.length() != s2.length()) return false;
            char [] h1Arr = new char[s1.length()];
            char [] h2Arr = new char[s2.length()];
            for ( int i = 0; i < s1.length(); i++){
                if ( h1Arr[i] != h2Arr[i] ) return false;
            }
            return true;
        }
    }
}
