let S = readLine()!

var result = [Int](repeating: -1, count: 26)

for (index, char) in S.enumerated() {
    let alphabetIndex = Int(char.unicodeScalars.first!.value) - Int("a".unicodeScalars.first!.value)
    
    if result[alphabetIndex] == -1 {
        result[alphabetIndex] = index
    }
}
print(result.map { String($0) }.joined(separator: " "))