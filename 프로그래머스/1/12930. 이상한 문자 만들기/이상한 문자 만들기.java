class Solution {
    public String solution(String s) {
        
        // 1. 문자열을 가장 가볍고 빠른 char 배열로 산산조각 냅니다.
        char[] charArr = s.toCharArray();
        
        // 단어별 인덱스를 셀 카운터 변수
        int wordIndex = 0; 
        
        for(int i = 0; i < charArr.length; i++) {
            
            // 2. 공백을 만나면 단어 인덱스를 0으로 초기화
            if(charArr[i] == ' ') {
                wordIndex = 0;
            } 
            // 3. 공백이 아닌 알파벳이라면 대/소문자 변환 후 덮어쓰기
            else {
                if(wordIndex % 2 == 0) {
                    // Character 도우미를 써서 대문자로 바꾼 뒤 원본 배열에 다시 넣음
                    charArr[i] = Character.toUpperCase(charArr[i]); 
                } else {
                    // 소문자로 바꾼 뒤 원본 배열에 다시 넣음
                    charArr[i] = Character.toLowerCase(charArr[i]); 
                }
                wordIndex++; // 알파벳을 처리했으니 인덱스 1 증가
            }
        }
        
        // 4. 조작이 다 끝난 char 배열을 한 번에 String으로 포장해서 반환!
        return new String(charArr);
    }
}