import java.awt.BufferCapabilities
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.StreamTokenizer
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine(), " ")

    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()

    val sb = StringBuilder()
    st = StringTokenizer(br.readLine(), " ")

    for(i in 0 until n){
        val value = st.nextToken().toInt()
        if (value < x) sb.append(value).append(' ')
    }
    print(sb)
}