import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val canvas = Array(100) { BooleanArray(100) }

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        for (i in 0 until 10) {
            for (j in 0 until 10) {
                canvas[x + i][y + j] = true
            }
        }
    }

    var blackArea = 0
    for (i in 0 until 100) {
        for (j in 0 until 100) {
            if (canvas[i][j]) {
                blackArea += 1
            }
        }
    }

    println(blackArea)
}