import java.lang.StringBuilder

fun main(){
    val br = System.`in`.bufferedReader()
    val arr = Array(5){ br.readLine() }

    val maxLen = arr.maxOf { it.length }
    val ans = StringBuilder()

    for (i in 0 until maxLen){
        for( word in arr){
            if(i<word.length){
                ans.append(word[i])
            }
        }
    }
    println(ans.toString())
}