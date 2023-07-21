import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


val dx = arrayListOf<Int>(0, 1, 0, -1)
val dy = arrayListOf<Int>(1, 0, -1, 0)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    repeat(case) {
        val (m, n, k) = readLine().split(" ").map { it.toInt() }
        val graph = Array(m) { Array(n) { 0 } }
        var answer = 0

        //배추위치찍기
        repeat(k) {
            val (x, y) = readLine().split(" ").map { it.toInt() }
            graph[x][y] = 1
        }

        fun bfs(x: Int, y: Int) {
            var queue = LinkedList<Pair<Int, Int>>()
            queue.offer(Pair(x, y))
            while (!queue.isEmpty()) {
                var cur = queue.poll()

                for (d in 0..3) {
                    val nx = cur.first + dx[d]
                    val ny = cur.second + dy[d]

                    if (nx < 0 || nx >= m || ny < 0 || ny >= n || graph[nx][ny] != 1) continue
                    graph[nx][ny] = 2
                    queue.offer(Pair(nx, ny))
                }
            }

        }

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (graph[i][j] == 1) {
                    bfs(i, j)
                    answer++
                }
            }
        }
        println(answer)
    }
}