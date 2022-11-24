fun main(args: Array<String>) {
//    var dateFrom = 2
//    var timeFrom = 100
//    var dateTest = 2
//    var timeTest = 500
//    var dateTo = 2
//    var timeTo = 1000

    val dateFrom = 1
    val timeFrom = 1

    val dateTest = 1
    val timeTest = 1

    val dateTo = 1
    val timeTo = 1

    println(niceCheck(dateFrom, timeFrom, dateTo, timeTo, dateTest, timeTest))
}

fun niceCheck(dateFrom: Int, timeFrom: Int, dateTo: Int, timeTo: Int, dateTest: Int, timeTest: Int): Boolean {

    if (dateFrom <= dateTo) {
        if (dateTest == dateFrom) {
            if (dateTest < dateTo && timeTest >= timeFrom) {
                return true
            }
            return if (dateTest == dateTo) {
                timeTest <= timeTo && timeFrom <= timeTest && timeFrom <= timeTest
            } else {
                false
            }
        }
        if (dateFrom == dateTo && dateFrom == dateTest) {
            return timeFrom == timeTo && timeFrom == timeTest
        }
        if (dateFrom < dateTo) {
            if (dateTest >= dateFrom) {
                if (dateTest <= dateTo) {
                    if (dateTest == dateTo) {
                        return timeTest <= timeTo
                    }
                    return if (dateTest < dateTo) {
                        timeTest >= timeFrom
                    } else {
                        false
                    }
                } else {
                    return false
                }
            } else {
                return false
            }
        } else {
            return false
        }
    } else {
        return false
    }
}
