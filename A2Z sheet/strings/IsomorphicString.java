import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapS2T = new HashMap<>();
        Map<Character, Character> mapT2S = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapS2T.containsKey(c1) && mapS2T.get(c1) != c2) {
                return false;
            }

            if (mapT2S.containsKey(c2) && mapT2S.get(c2) != c1) {
                return false;
            }

            mapS2T.put(c1, c2);
            mapT2S.put(c2, c1);
        }

        return true;
    }

    public static boolean isIsomorphicOptimal(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> mappedCharInT = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return  false;
                }
            }
            else{
                if (mappedCharInT.contains(c2)) {
                    return  false;
                }
                map.put(c1, c2);
                mappedCharInT.add(c2);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "paper", t ="title";
        System.out.println(isIsomorphic(s, t));
        System.out.println(isIsomorphicOptimal(s, t));
        
    }
}
