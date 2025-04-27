func solution(_ dots: [[Int]]) -> Int {
    func isParallel(_ a: [Int], _ b: [Int], _ c: [Int], _ d: [Int]) -> Bool {
        let dy1 = a[1] - b[1]
        let dx1 = a[0] - b[0]
        let dy2 = c[1] - d[1]
        let dx2 = c[0] - d[0]
        return dy1 * dx2 == dy2 * dx1
    }
    
    let dots = dots
    if isParallel(dots[0], dots[1], dots[2], dots[3]) { return 1 }
    if isParallel(dots[0], dots[2], dots[1], dots[3]) { return 1 }
    if isParallel(dots[0], dots[3], dots[1], dots[2]) { return 1 }
    return 0
}
