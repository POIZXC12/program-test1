func solution(_ arr:[Int]) -> [Int] {
    // 1. 빈 배열 체크 (문제 조건상 arr.count >= 1이지만, 안전하게 처리)
    guard !arr.isEmpty else { return [-1] }
    
    // 2. 최소값 찾기
    let minValue = arr.min()!
    
    // 3. 최소값을 제외한 배열 생성
    let result = arr.filter { $0 != minValue }
    
    // 4. 결과가 비어있으면 [-1], 아니면 result 반환
    return result.isEmpty ? [-1] : result
}