let input = readLine()!.split(separator: " ").map { Int($0)! }
let N = input[0]
let M = input[1]

var passwordDict = [String: String]()

for _ in 0..<N {
    let siteInfo = readLine()!.split(separator: " ")
    let site = String(siteInfo[0])
    let password = String(siteInfo[1])
    passwordDict[site] = password
}

for _ in 0..<M {
    let site = readLine()!
    print(passwordDict[site]!)
}