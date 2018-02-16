public class MatchRec{
    Stack<String> sta;

    public static void main(String[] args){
        print(match("{()[]()}"));
    }

    private static boolean match(String s){
        Stack sta = new Stack<String>();
        return matchRec(s, sta);

    }
    
    private static boolean matchRec(String s, Stack<String> sta){
        // {()[]}
        if(sta.isEmpty() && s == null){
            return true;
        }else if(!sta.isEmpty() && s == null){
            return false;
        }

        char curr = s.charAt(0);
        if(curr == "( { ["){
            sta.push(curr);
        } else if(curr == ')' && sta.peek() == '('){
            sta.pop();
        }
        else if(curr == "} ]" && sta.peek() == "{ ["){
            sta.pop();
        }else{
            return false;
        }

        return matchRec(s.substring(1), sta);
    }

}
