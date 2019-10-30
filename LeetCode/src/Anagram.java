import java.util.Arrays;

public class Anagram {

	public boolean isAnagram(String s, String t) {
        char[] ch=s.toCharArray();
        char[] hc=t.toCharArray();
        
        Arrays.sort(ch);
        Arrays.sort(hc);
        if(ch.length!=hc.length)
            return false;
        
        for(int i=0; i<ch.length;i++) {
        	if(ch[i]==hc[i]) {
        		continue;
        	}else {
        		return false;
        	}
        }
        
        
        return true;
    }
}
