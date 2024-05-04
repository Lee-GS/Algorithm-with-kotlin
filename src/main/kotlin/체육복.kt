fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    var answer = 0
    var count = n
    val arr = reserve.toMutableList()
    val arr2 = lost.toMutableList()
    var removed = mutableListOf<Int>()
    arr.sort()
    arr2.sort()
    arr2.forEach{
        if (arr.contains(it)){
            removed.add(it)
        }
    }
    arr.removeAll(removed)
    arr2.removeAll(removed)
    for (i in arr2.indices){
        print(arr)
        if (arr2[i]-1 in arr ){
            arr.remove(arr2[i]-1)
            //count++
        }
        else if (arr2[i]+1 in arr){
            arr.remove(arr2[i]+1)
            //count++
        }
        else{
            count--
        }
    }

    answer = count
    return answer
}