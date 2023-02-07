fun main(args: Array<String>){
    val T = Integer.parseInt(readlnOrNull())
    for(i: Int in 0 until T){
        var floor = Integer.parseInt(readLine())
        var room = Integer.parseInt(readLine())

        var apart = ArrayList<Int>()
        for(l: Int in 1..room){
            apart.add(l)
        }
        for (k: Int in 0 until floor){
            for (j: Int in 1 until room){
                apart[j] = apart[j]+apart[j-1]
            }
        }
        println(apart.last())
    }
}