import kotlin.math.abs
import kotlin.math.max

fun main(){
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val visited = BooleanArray(arr.size){false}
    val tmp = mutableListOf<Int>()
    var answer = 0

    fun dfs(){
        if (tmp.size == arr.size){
            var tmp2 = 0
            for(i in 0 until tmp.size-1){
                tmp2 += abs(tmp[i]-tmp[i+1])
            }
            answer = max(answer,tmp2)
            return
        }
        for (j in arr.indices){
            if (visited[j]){
                continue
            }
            visited[j] = true
            tmp.add(arr[j])
            dfs()
            tmp.removeAt(tmp.size-1)
            visited[j] = false
        }
    }
    dfs()
    print(answer)
}