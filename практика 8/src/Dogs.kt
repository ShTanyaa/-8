class Dogs constructor(var nik:String,var breed:String,var height:Int,var color:String, var weight:Double,var charakt:String) {

        fun size(){
            if(height<40) println("маленькая собака")
        }
        fun info(){
            println("кличка:$nik\nпорода:$breed\nрост:$height\nокрас:$color\nвес:$weight\nхарактер:$charakt")
        }
        fun group(){
            if(weight<5) println("декоративная порода")
        }
    }
