import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> newMap = new HashMap<>();
        
        for(String[] newDB : db) {
            newMap.put(newDB[0],newDB[1]);
        }
        
        if (newMap.containsKey(id_pw[0])){
            if(newMap.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
        
    }
}