let numbers = readLine()!.split(separator: " ").map { Int($0)! }
var sum = 0

for number in numbers {
    sum += number * number
}

let verificationNumber = sum % 10
print(verificationNumber)