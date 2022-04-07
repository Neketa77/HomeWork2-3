fun main () {

    val moneys = 124124
    val x = 100
    val variant1 = moneys - 100
    val variant2 = moneys - (moneys * 0.05)
    val variant3: Int = variant2.toInt()
    val sumv2 = moneys * 0.05
    val sumv21:Int = sumv2.toInt()

    val result = if (moneys <= 1_000) {
        print("Сумма покупки : $moneys , сумма скидки: 0 рублей")
    } else if (moneys >= 1001 && moneys <= 10_000) {
        print("Сумма покупки : $variant1  , сумма скидки: $x рублей")
    } else if (moneys >= 10_000){
        print("Сумма покупки : $variant3 , сумма скидки: $sumv21")
    } else {

    }




}








