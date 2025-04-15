let T = Int(readLine()!)!
for _ in 1...T {
    let nums = readLine()!.split(separator: " ").map { Int($0)! }
    print(nums[0] + nums[1])
}