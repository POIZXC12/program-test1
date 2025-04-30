import Foundation

if let input = readLine(), let N = Int(input) {
       for i in 1...N {
           let spaces = String(repeating: " ", count: N - i)
           let stars = String(repeating: "*", count: 2 * i - 1)
           print(spaces + stars)
       }

       for i in stride(from: N - 1, through: 1, by: -1) {
           let spaces = String(repeating: " ", count: N - i)
           let stars = String(repeating: "*", count: 2 * i - 1)
           print(spaces + stars)
       }
}
