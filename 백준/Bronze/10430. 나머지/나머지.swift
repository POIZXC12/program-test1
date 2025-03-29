let input = readLine()!.split(separator: " ").map { Int($0)! }
let A = input[0]
let B = input[1]
let C = input[2]

let case1 = (A + B) % C

let case2 = ((A % C) + (B % C)) % C

let case3 = (A * B) % C

let case4 = ((A % C) * (B % C)) % C

print(case1)
print(case2)
print(case3)
print(case4)