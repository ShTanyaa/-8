fun main(){
    //класс собаки
    println("введите кличку")
    val name:String= readLine().toString()
    println("введите породу")
    val breed:String= readLine().toString()
    println("введите рост")
    val height:Int= readLine()!!.toInt()
    println("введите окрас")
    val color:String= readLine().toString()
    println("введите вес")
    val weight:Double= readLine()!!.toDouble()
    println("введите характер")
    val charakt:String= readLine().toString()
    if(name==""||breed==""||charakt==""||color==""|| height<15||weight<1.5) println("error")
    else{
        val dogg:Dogs=Dogs(name,breed,height,color,weight,charakt)
        dogg.info()
        dogg.size()
        dogg.group()
    }

        //класс кинотеатр
    println("введите название фильма")
    val namee:String= readLine().toString()
    println("введите сеанс")
    val seanse:Int= readLine()!!.toInt()
    println("введите стоимость билета")
    val cost:Int= readLine()!!.toInt()
    println("введите зал")
    val zal:Int= readLine()!!.toInt()
    println("введите кол-во зрителей")
    val kol:Int= readLine()!!.toInt()
    if(namee==""||seanse<1||cost<30||zal<1||kol<1) println("error")
    else{
        val sen:Cinema=Cinema(namee,seanse,cost,zal,kol)
        sen.cena()
        sen.info()
        sen.zr()
    }
}