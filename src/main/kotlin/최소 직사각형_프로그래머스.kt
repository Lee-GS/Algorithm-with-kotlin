fun solution(sizes: Array<IntArray>): Int {
    var maxW = 0
    var maxH = 0
    for (size in sizes) {
        val (w, h) = size.sortedDescending()
        if (w > maxW) maxW = w
        if (h > maxH) maxH = h
    }
    return maxW * maxH
}