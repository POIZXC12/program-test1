let N = Int(readLine()!)!
var dna = Array(readLine()!)  //이렇게 하면 효율적이라네요..

let decodingTable: [Character: [Character: Character]] = [
    "A": ["A": "A", "G": "C", "C": "A", "T": "G"],
    "G": ["A": "C", "G": "G", "C": "T", "T": "A"],
    "C": ["A": "A", "G": "T", "C": "C", "T": "G"],
    "T": ["A": "G", "G": "A", "C": "G", "T": "T"]
]

var current = dna

while current.count > 1 {
    let last = current.removeLast()
    let secondLast = current.removeLast()
    
    let decodedChar = decodingTable[secondLast]![last]!
    current.append(decodedChar)
}

print(current[0])