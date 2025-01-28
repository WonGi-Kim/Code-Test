import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // terms를 Map으로 변경 (약관 종류별 유효기간 저장)
        HashMap<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] splitTerm = term.split(" ");
            termsMap.put(splitTerm[0], Integer.parseInt(splitTerm[1]));
        }

        List<Integer> expiredList = new ArrayList<>();
        int todayDate = convertToDate(today); // 오늘 날짜를 변환

        // 개인정보 수집 데이터 확인
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            int collectedDate = convertToDate(privacy[0]); // 수집 날짜 변환
            int termMonths = termsMap.get(privacy[1]); // 해당 약관의 유효기간 가져오기

            int expirationDate = collectedDate + (termMonths * 28) - 1; // 보관 가능 날짜 계산

            // 파기 대상인지 확인
            if (expirationDate < todayDate) {
                expiredList.add(i + 1); // 개인정보 번호는 1부터 시작
            }
        }

        // 오름차순 정렬 후 배열로 변환
        return expiredList.stream().mapToInt(Integer::intValue).toArray();
    }

    // 날짜를 숫자로 변환하는 함수 (YYYY.MM.DD -> 일 수 변환)
    private int convertToDate(String date) {
        String[] splitDate = date.split("\\.");
        int year = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]);
        int day = Integer.parseInt(splitDate[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}
