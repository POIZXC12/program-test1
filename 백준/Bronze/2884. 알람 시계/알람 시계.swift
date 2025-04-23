let input = readLine()!.split(separator: " ").map { Int($0)! }
var H = input[0]
var M = input[1]

if M >= 45 {
    M -= 45
} else {
    M += 15  // 60 - 45
    H = H == 0 ? 23 : H - 1
}

print("\(H) \(M)")