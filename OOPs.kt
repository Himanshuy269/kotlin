/*fun main(){
    val car1=car()
    car1.name = "tesla"
    car1.model="s plaid"
    car1.colors="red"
    car1.doors=4
    println( "Name=${car1.name}")
    println( "model=${car1.model}")
    println( "colors=${car1.colors}")
    println( "doors=${car1.doors}")
    car1.move()
    car1.stop()

    val car2=car()
    car2.name = "ford"
    car2.model="mustang"
    car2.colors="blue"
    car2.doors=4
    println("\n")
    println( "Name=${car2.name}")
    println( "model=${car2.model}")
    println( "colors=${car2.colors}")
    println( "doors=${car2.doors}")
    car2.move()
    car2.stop()
    
}
class car{
    var name=""
    var model=""
    var colors=""
    var doors=0
    fun move(){
        println("the car $name is moving")
    }
    fun stop(){
        println("the car $name is moving")
    }
}*/
//constructor
/*fun main(){
    val car1=car("   tesla","s plaid","red",4)
    println( "Name=${car1.name}")
    println( "model=${car1.model}")
    println( "colors=${car1.colors}")
    println( "doors=${car1.doors}")
    car1.move()
    car1.stop()

    val car2=car("Ford","mustang","blue",4)
    println("\n")
    println( "Name=${car2.name}")
    println( "model=${car2.model}")
    println( "colors=${car2.colors}")
    println( "doors=${car2.doors}")
    car2.move()
    car2.stop()
    
}
class car(name:String,model:String,color:String,doors:Int){
    var name=name
    var model=model
    var colors=color
    var doors=doors
    fun move(){
        println("the car $name is moving")
    }
    fun stop(){
        println("the car $name is moving")
    }
}*/
//constructor as parameter
fun main(){
    val car1=car("   tesla","s plaid","red",4)
    println( "Name=${car1.name}")
    println( "model=${car1.model}")
    println( "colors=${car1.colors}")
    println( "doors=${car1.doors}")
    car1.move()
    car1.stop()

    val car2=car("Ford","mustang","blue",4)
    println("\n")
    println( "Name=${car2.name}")
    println( "model=${car2.model}")
    println( "colors=${car2.colors}")
    println( "doors=${car2.doors}")
    car2.move()
    car2.stop()
    
}
class car(var name:String,var model:String,var colors:String,var doors:Int){
        fun move(){
        println("the car $name is moving")
    }
    fun stop(){
        println("the car $name is moving")
    }
}