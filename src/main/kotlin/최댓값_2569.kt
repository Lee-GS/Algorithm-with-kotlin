import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val arr = ArrayList<Int>()

    repeat(9){
        arr.add(br.readLine().toInt())
    }
    val maxNum = arr.maxOrNull()
    var indexNum = 0
    for (i in 0 until arr.size){
        if (maxNum == arr[i]){
            indexNum = i
            break
        }
    }
    println(maxNum)
    print(indexNum+1)
}