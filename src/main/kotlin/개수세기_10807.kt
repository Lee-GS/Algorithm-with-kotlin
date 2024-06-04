        fun main(){
            val count = readln().toInt()
            val num = readln().split(" ")
            val num2  = readln().toInt()
            println(num.count { it.toInt() == num2 })
        }