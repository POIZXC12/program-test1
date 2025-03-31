import Foundation

func solution() {
    let input = readLine()!.split(separator: " ").map { Int($0)! }
    let x = input[0]
    let y = input[1]
    let w = input[2]
    let h = input[3]
    
    let distances = [x, w - x, y, h - y]
    
    print(distances.min()!)
}

solution()
