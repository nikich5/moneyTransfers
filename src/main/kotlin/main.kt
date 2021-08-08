fun main() {
    val amount = 10000
    val commissionPercent = 0.0075
    val minimalAmount = 3500
    if (amount >= minimalAmount) {
        val commissionAmount = amount * commissionPercent
        println("Комиссия с перевода составит $commissionAmount копеек")
    } else {
        println("Минимальный перевод составляет $minimalAmount рублей")
    }
}