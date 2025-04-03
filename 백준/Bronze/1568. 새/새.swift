let N = Int(readLine()!)!
var remainingBirds = N
var currentNumber = 1
var totalTime = 0

while remainingBirds > 0 {
    if currentNumber > remainingBirds {
        currentNumber = 1  //새로 시작
    }
    remainingBirds -= currentNumber
    totalTime += 1
    currentNumber += 1
}

print(totalTime)