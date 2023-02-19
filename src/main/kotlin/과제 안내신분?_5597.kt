import java.util.Scanner

fun main() {
    val allNumbers = (1..30).toSet()  // 모든 학생의 출석번호를 Set에 저장
    val submittedNumbers = mutableSetOf<Int>()  // 제출한 학생의 출석번호를 저장할 Set

    repeat(28) {
        val submittedNumber = readLine()!!.toInt()  // 제출한 학생의 출석번호를 입력받음
        submittedNumbers.add(submittedNumber)  // Set에 제출한 학생의 출석번호를 추가
    }

    val absentNumbers = allNumbers - submittedNumbers  // 제출하지 않은 학생의 출석번호를 계산
    val sortedAbsentNumbers = absentNumbers.sorted()  // 출석번호를 정렬

    println(sortedAbsentNumbers[0])  // 가장 작은 출석번호 출력
    println(sortedAbsentNumbers[1])  // 그 다음으로 작은 출석번호 출력
}
