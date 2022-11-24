class DateFormat {
    var day: String = "00"
    var month: String = "00"
    var year: String = "0000"
    var fullDate: String? = null

    fun getFullDate(day: String, month: String, year: String): String? {
        var setDay = day
        var setMonth = month
        var setYear = year

        if (day.toInt() in 1..31) {
            setDay = day
            if (month.toInt() in 1..12) {
                setMonth = month
                if (year.toInt() in 1..9999) {
                    setYear = year
                    return fullDate?.format("s%, s%, s%", day, month, year)
                } else {
                    return ""
                }
            } else {
                return ""
            }
        } else {
            return ""
        }
    }
}