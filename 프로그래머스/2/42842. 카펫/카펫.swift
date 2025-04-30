func solution(_ brown: Int, _ yellow: Int) -> [Int] {
    let total = brown + yellow

    for height in 3...total {
        if total % height != 0 { continue }
        let width = total / height
        if width < height { continue }

        let innerWidth = width - 2
        let innerHeight = height - 2
        if innerWidth * innerHeight == yellow {
            return [width, height]
        }
    }

    return []
}