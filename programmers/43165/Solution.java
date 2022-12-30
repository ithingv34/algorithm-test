# 프로그래머스
# lV2
# DFS를 활용한 재귀 탐색
# numbers 배열의 길이가 20까지 때문에 2^20 이므로 완전 탐색으로 구현이 가능하다.
# https://school.programmers.co.kr/learn/courses/30/parts/12421

class Solution {
    
    int[] numbers;
    int target;
    int answer;
    
    void dfs(int index, int sum) {
        // 1. 탈출 조건
        if (index == numbers.length) {
            if (sum == target) answer++;
            return;
        }
        
        // 2. 수행 동작
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;
        
        dfs(0, 0);
        
        return answer;
    }
}