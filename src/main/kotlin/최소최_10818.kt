import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.StringTokenizer
import kotlin.math.min

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine()," ")

    val n = st.nextToken().toInt()
    val sb = StringBuilder()
    st = StringTokenizer(br.readLine(), " ")

    for( i in 0 until n){
        val value = st.nextToken().toInt()
        sb.append(value).append(' ')
    }



    print(sb.max())

}