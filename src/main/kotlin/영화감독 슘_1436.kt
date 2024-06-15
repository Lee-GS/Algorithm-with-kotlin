import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var count = 0
    var i = 0

    while(i < 10e9){
        if (i.toString().contains("666")){
            count++
        }
        if (count == n) break
        i++
    }
    print(i)
}