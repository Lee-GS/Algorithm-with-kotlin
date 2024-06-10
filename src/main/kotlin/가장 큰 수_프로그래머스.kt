class Solution {
    fun solution(numbers: IntArray): String {
        val nums = numbers.map { it.toString() }
        val sortedNums = nums.sortedWith {
                a, b -> (b + a).compareTo(a + b)
        }
        val result = sortedNums.joinToString("")

        // 결과가 "0"으로 시작하는 경우 처리
        return if (result.startsWith("0")) "0" else result

    }
}