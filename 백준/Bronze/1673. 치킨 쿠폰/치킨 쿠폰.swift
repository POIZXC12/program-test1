while let input = readLine()?.split(separator: " ").map({ Int($0)! }) {
    var n = input[0]
    let k = input[1]
    var totalChicken = 0
    var a = 0
    
    while n > 0 {
        totalChicken += n 
        a += n
        n = a / k
        a %= k
    }
    
    print(totalChicken)
}