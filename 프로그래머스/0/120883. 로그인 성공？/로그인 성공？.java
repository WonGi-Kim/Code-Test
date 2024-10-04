// import java.util.*;
// class Solution {
//     public String solution(String[] id_pw, String[][] db) {
//         HashMap<String, String> newMap = new HashMap<>();
        
//         for(String[] newDB : db) {
//             newMap.put(newDB[0],newDB[1]);
//         }
        
//         if (newMap.containsKey(id_pw[0])){
//             if(newMap.get(id_pw[0]).equals(id_pw[1])) {
//                 return "login";
//             } else {
//                 return "wrong pw";
//             }
//         } else {
//             return "fail";
//         }
        
//     }
// }
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        // id_pw 배열에서 아이디와 비밀번호 추출
        String inputId = id_pw[0];
        String inputPw = id_pw[1];

        // db 배열을 순회하며 아이디와 비밀번호를 비교
        for (int i = 0; i < db.length; i++) {
            String dbId = db[i][0];
            String dbPw = db[i][1];

            if (dbId.equals(inputId)) { // 아이디가 일치하면
                if (dbPw.equals(inputPw)) { // 비밀번호도 일치하면
                    return "login";
                } else { // 비밀번호가 일치하지 않으면
                    return "wrong pw";
                }
            }
        }
        // 아이디가 없는 경우
        return "fail";
    }
}
