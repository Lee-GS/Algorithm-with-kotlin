import java.io.BufferedReader
import java.io.InputStreamReader
import java.security.KeyStore.TrustedCertificateEntry
import java.util.Scanner


fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {

    while (true){
        var lotto = ArrayList<IntArray>()
        lotto.add(readLine().split(" ").map { it.toInt() }.toIntArray())
        if (lotto[0].equals(0)){
            break
        }
        val tmp = lotto.toMutableList()
        var visited : BooleanArray = BooleanArray(Integer.parseInt(lotto[0].toString()))
        var ans = ArrayList<IntArray>()
        tmp.removeAt(0)
        dfs(ans,visited,tmp)
        println()
    }




}
fun dfs(array : MutableList<IntArray>,array2: BooleanArray,array3: MutableList<IntArray>) {
    if (array.size == 6) {
        var list2 = array.sortBy { it.size }
        if (array.equals(list2)) {
            for (i in 0 until array.size) {
                print("${array[i]}")
            }
            return
        }
        for (i in 0 until array.size){
            if (array2[i]){
                continue
            }
            array2[i] = true
            array.add(array3[i])
            dfs(array,array2, array3)
            array.removeAt(-1)
            array2[i]=false
        }
    }
}
