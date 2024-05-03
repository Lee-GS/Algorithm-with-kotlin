import java.util.LinkedList
import kotlin.math.ceil

fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    var answer = intArrayOf()
    var lastDay = 0
    var cnt = 0

    progresses.mapIndexed{ idx, progress -> Pair(progress, speeds[idx].toDouble()) }
        .map {(100-it.first)/it.second}
        .map { ceil(it) }
        .map { it.toInt() }
        .asSequence()
        .forEach { curDay ->
            if (lastDay>=curDay){
                cnt++
            }else{
                if(lastDay != 0 ){
                    answer.plus(cnt)
                }
                lastDay = curDay
                cnt = 1
            }
        }
    answer = answer.plus(cnt)

    return answer
}
