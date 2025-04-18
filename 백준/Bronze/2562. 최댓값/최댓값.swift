var numbers = [Int]()
for _ in 1...9 {
    numbers.append(Int(readLine()!)!)
}

let maxValue = numbers.max()!
let maxIndex = numbers.firstIndex(of: maxValue)! + 1

print(maxValue)
print(maxIndex)
//하..