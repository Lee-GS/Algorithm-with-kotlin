fun main(){
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    var count = 0
    for (i in 1 .. n){
        val num = i.toString()
        if (num.length < 3){
            count++
        }
        else if (num[1]-num[0] == num[2]-num[1]){
            count++
        }
    }
    print(count)
}