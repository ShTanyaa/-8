class Cinema constructor(var name:String,var seanse:Int, var cost:Int,var zal:Int,var kol:Int){
    fun cena(){
        if(cost>250) println("дорогой билет")
    }
    fun info(){
        println("название фильма:$name\nсеанс:$seanse\nцена билета:$cost\nзал:$zal\nкол-во зрителей:$kol")
    }
    fun zr(){
        if(kol>70) println("этот фильм популярный и интересный")
    }

}