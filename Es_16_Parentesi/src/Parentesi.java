import java.util.*;

public class Parentesi {
    private LinkedList<Character> caratteri = new LinkedList<>();

    public Parentesi() {
    }

    public boolean parentesiAperte(char a) {
        if (a == '(' || a == '[' || a == '{') {
            return true;
        } else return false;
    }

    public boolean parentesiChiuse(char a) {
        if (a == ')' || a == ']' || a == '}') {
            return true;
        } else return false;
    }

    public boolean match(char a, char b) {
        if (a == '(' && b == ')' || a == '[' && b == ']' || a == '{' && b == '}' ) {
            return true;
        } else return false;
    }

    public boolean isValid(String s) {
        for (Character c : s.toCharArray()) {
            caratteri.add(c);
        }
        for (int i = 0; i < caratteri.size(); i=i) {
            if (caratteri.getFirst()==null){
                break;
            }
            if (!parentesiAperte(caratteri.peekFirst())){
                return false;
            }
            if (caratteri.size() < 2){
                return false;
            }
            if (!match(caratteri.peekFirst(), caratteri.get(i+1))){
                return false;
            }
            else {
                caratteri.removeFirst();
                caratteri.removeFirst();
            }
        }
        return true;
    }
}
