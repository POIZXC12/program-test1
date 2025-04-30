func solution(_ s: String) -> [Int] {
    var lastIndex: [Character: Int] = [:]
    var result: [Int] = []
    
    for (i, char) in s.enumerated() {
        if let last = lastIndex[char] {
            result.append(i - last)
        } else {
            result.append(-1)
        }
        lastIndex[char] = i
    }
    
    return result
}