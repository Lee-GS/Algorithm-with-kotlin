import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    val n = Integer.parseInt(readLine())

    val t : IntArray = IntArray(n+1)
    val p : IntArray = IntArray(n+1)
    val dp : IntArray = IntArray(n+1)

    for (i:Int in 1 until n+1){
        t[i] = sc.nextInt()
        p[i] = sc.nextInt()
    }

    var max: Int = 0
    for(i in 1 until n+1){
        dp[i]=Math.max(dp[i],max)

        if (i+t[i]<=n+1){
            dp[i-1+t[i]] = Math.max(dp[i-1+t[i]],p[i] + dp[i-1])
        }
        if (max<dp[i]) max = dp[i]
    }
    println(max)
}
