import Foundation

if let input = readLine() {
    let word = input.uppercased()
    var alphabetCount = [Int](repeating: 0, count: 26)
    
    for char in word {
        if let ascii = char.asciiValue {
            let index = Int(ascii - 65)
            alphabetCount[index] += 1
        }
    }
    if let max = alphabetCount.max() {
        let maxCount = alphabetCount.filter { $0 == max }.count
        
        if maxCount > 1 {
            print("?")
        } else {
            if let index = alphabetCount.firstIndex(of: max) {
                let resultChar = Character(UnicodeScalar(index + 65)!)
                print(resultChar)
            }
        }
    }
}