import kotlin.math.abs

fun solution(name: String): Int {
    var answer = 0
    val a = 'A'.code
    val z = 'Z'.code

    fun findNearAlphabet(str : String) : Int {
        return if (abs(str.toInt()-a) > abs((str.toInt()-z)+1)){
            abs((str.toInt()-z)+1)
        }else if(str.toInt() == a){
            return 0
        }
        else{
            abs(str.toInt()-a)
        }
      //  answer = answer.coerceAtMost()
    }

    return answer
}
