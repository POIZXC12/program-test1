import Foundation

func solution(_ n: Int) -> Int {
    let sqrtValue = sqrt(Double(n))
    return sqrtValue == floor(sqrtValue) ? 1 : 2
}
