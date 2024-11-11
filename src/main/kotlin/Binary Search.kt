class `Binary Search` {
}

fun binarySearch(sortedList: List<Int>, target: Int): Int? {
    var left = 0
    var right = sortedList.size - 1

    while (left <= right) {
        val middle = (left + right) / 2
        val middleValue = sortedList[middle]

        when {
            middleValue == target -> return middle // Target found
            middleValue < target -> left = middle + 1 // Search in the right half
            else -> right = middle - 1 // Search in the left half
        }
    }
    return null // Target not found
}

fun main() {
    val sortedList = listOf(4, 8, 12, 16, 23, 28, 32)
    val target = 23
    val result = binarySearch(sortedList, target)

    if (result != null) {
        println("Found $target at index $result.")
    } else {
        println("$target is not in the list.")
    }
}
