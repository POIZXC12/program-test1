import Foundation

func solution(_ N: Int) -> Int {
    return String(N).map { Int(String($0))! }.reduce(0, +)
}
