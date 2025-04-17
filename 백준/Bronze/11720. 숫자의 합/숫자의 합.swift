let N = Int(readLine()!)!
let numbers = readLine()!.map { Int(String($0))! }
print(numbers.reduce(0, +))