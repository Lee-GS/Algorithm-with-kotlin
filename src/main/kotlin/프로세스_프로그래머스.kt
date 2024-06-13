import java.util.LinkedList
import java.util.Queue


fun solution(priorities: IntArray, location: Int): Int {
    var queue: Queue<Int> = LinkedList<Int>()
    priorities.sortedDescending().forEach {
        queue.add(it)
    }
    var answer = 0
    while (!queue.isEmpty()) {
        for (i in priorities.indices) {
            if (priorities[i] == queue.peek()) {
                queue.poll()
                answer++
                if (i == location) {
                    return answer
                }
            }
        }
    }
    return answer
}


