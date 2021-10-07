func bubbleSort<T: Comparable>(_ list: inout [T]) {
    let n = list.count
    for i in 0..<n {
        for  j in 0..<n-i-1 {
            if list[j] > list[j+1] {
                let tmp = list[j]
                list[j] = list[j+1]
                list[j+1] = tmp
            }
        }
    }
}

func bubbleSort<T:Comparable>(_ list: [T]) -> [T] {
    var temp = list
    bubbleSort(&temp)
    return temp
}

var list = ["f", "e", "d", "b", "a", "c"]
var list2 = [5, 2, 1, 6, 4, 3]
bubbleSort(&list)
print(list)
print(bubbleSort(list2))
