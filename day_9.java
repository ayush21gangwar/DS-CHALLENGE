class Solution {
    public boolean isValid(String s) {
        int curSize = s.length();
        while(s.length()>0){
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            if(s.length() != 0 && s.length() == curSize){
                return false;
            }
            curSize = s.length();
        }
        return true;
    }
    }
