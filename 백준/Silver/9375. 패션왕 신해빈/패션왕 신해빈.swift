let T = Int(readLine()!)!
for _ in 0..<T {
    let n = Int(readLine()!)!
    var categoryCount = [String: Int]()
    
    for _ in 0..<n {
        let parts = readLine()!.split(separator: " ")
        let category = String(parts[1])
        categoryCount[category] = (categoryCount[category] ?? 0) + 1
    }
    
    var result = 1
    for (_, count) in categoryCount {
        result *= (count + 1)
    }
    print(result - 1)
}