let input = readLine()!.split(separator: " ").map { Int($0)! }
let N = input[0], M = input[1]
print(100 * N >= M ? "Yes" : "No")