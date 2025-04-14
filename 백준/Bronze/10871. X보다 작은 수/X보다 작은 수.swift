let input = readLine()!.split(separator: " ").map { Int($0)! }
let N = input[0], X = input[1]
let A = readLine()!.split(separator: " ").map { Int($0)! }

let result = A.filter { $0 < X }.map { String($0) }.joined(separator: " ")
print(result)