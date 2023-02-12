fun main(args: Array<String>) {
    while (true){
        var n = readLine()
        if (n=="0"){
            break
        }
        var n2 = n?.reversed()
        if (n == n2){
            println("yes")
        }
        else{
            println("no")
        }
    }
}
