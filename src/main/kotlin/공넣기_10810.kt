import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n,m) = br.readLine().split(" ").map { it.toInt() }

    val basket = IntArray(n)

    repeat(m){
        val (i,j,k) = br.readLine().split(" ").map { it.toInt() }
        for (a in i-1 until j){
            basket[a] = k
        }
    }
    println(basket.joinToString(" "))
}