import Foundation

func solution() {
    let input = readLine()!.split(separator: " ").map { Int64($0)! }
    let n = input[0]
    let m = input[1]
    print(abs(n - m))
}

solution()
