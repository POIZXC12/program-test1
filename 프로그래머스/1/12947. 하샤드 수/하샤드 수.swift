func solution(_ x: Int) -> Bool {
    let digitSum = String(x).compactMap { $0.wholeNumberValue }.reduce(0, +)
    return x % digitSum == 0
}
