import Foundation

var allStudents = Set(1...30)

for _ in 1...28 {
    if let input = readLine(), let num = Int(input) {
        allStudents.remove(num)
    }
}

let missing = allStudents.sorted()

for student in missing {
    print(student)
}
