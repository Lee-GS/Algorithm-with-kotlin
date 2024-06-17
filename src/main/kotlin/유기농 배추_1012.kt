import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val t = br.readLine().toInt()
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)

    repeat(t) {
        val (m, n, k) = br.readLine().split(" ").map { it.toInt() }
        val graph = Array(n) { IntArray(m) }
        val visited = Array(n) { BooleanArray(m) }
        val ans = arrayListOf<Int>()

        repeat(k) {
            val (a, b) = br.readLine().split(" ").map { it.toInt() }
            graph[b][a] = 1
        }

        fun bfs(a: Int, b: Int): Int {
            val q: Queue<Pair<Int, Int>> = LinkedList()
            var cnt = 0
            q.add(Pair(a, b))
            visited[a][b] = true
            cnt += 1

            while (q.isNotEmpty()) {
                val (x, y) = q.poll()

                for (i in 0 until 4) {
                    val nx = x + dx[i]
                    val ny = y + dy[i]

                    if (nx in 0 until n && ny in 0 until m && graph[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true
                        q.add(Pair(nx, ny))
                        cnt += 1
                    }
                }
            }
            return cnt
        }

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    ans.add(bfs(i, j))
                }
            }
        }
        println(ans.size)
    }
}
