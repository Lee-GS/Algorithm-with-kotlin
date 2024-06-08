import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val arr = br.readLine().split(" ").map { it.toDouble()}


    val maxNum = arr.maxOrNull()

    val newScore = arr.map { it/ maxNum!! * 100 }

    println(newScore.average())

}