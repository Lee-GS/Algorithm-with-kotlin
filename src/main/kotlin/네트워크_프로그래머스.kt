fun solution(n: Int, computers: Array<IntArray>): Int {
    var answer = 0
    val visited = Array(n) { false }
    var ans = arrayListOf<Int>()
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j) {
                computers[i][j] = 0
            }
        }
    }


    fun dfs(V: Int): Int {
        var cnt = 0
        visited[V] = true
        cnt += 1
        for (k in 0 until n) {
            if (computers[V][k] == 1 && !visited[k]) {
                dfs(k)
            }
        }
        return cnt
    }

    for (l in 0 until n) {
        if (!visited[l]) {
            ans.add(dfs(l))
        }
    }
    answer = ans.size

    return answer
}
