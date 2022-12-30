# 프로그래머스
# lV2
# DFS를 활용한 재귀 탐색
# numbers 배열의 길이가 20까지 때문에 2^20 이므로 완전 탐색으로 구현이 가능하다.
# https://school.programmers.co.kr/learn/courses/30/parts/12421

def solution(numbers, target):
    if not numbers and target == 0:
        return 1
    elif not numbers:
        return 0
    return solution(numbers[1:], target - numbers[0]) + solution(numbers[1:], target + numbers[0])