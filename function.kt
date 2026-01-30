/*fun getmax(a: Int,b:Int):Int{
    val max=if(a>b) a else b
    return max
}
fun main(){
   val high:Int= getmax(5,9)
   println(high)
}*/
/*fun main(){
    val max= getmax(5,6)
    println(max)
}
fun getmax(a:Int,b:Int)= if (a>b) a else b*/
//function overloading
/*fun main(){
    val max= getmax(5.4,6.3)
    println(max)
}
fun getmax(a:Int,b:Int)= if(a>b) a else b
fun getmax(a:Double,b:Double)= if(a>b) a else b */
//function overloading 2
/*fun main(){
    val max= getmax(5,7,8)
    println(max)
}
fun getmax(a:Int,b:Int)= if(a>b) a else b
fun getmax(a:Double,b:Double)= if(a>b) a else b 
fun getmax(a:Int,b:Int,c:Int):Int {
    if(a>=b && b>=c){ return a}
    else if(b>=a && b>=c){return b}
    else return c
}*/
/*fun main(){
    sendmessage()
}
fun sendmessage(name:String="user",message:String=sendtext()){
    println("Name=$name and message =$message")
}
fun sendtext():String ="sometext"*/
//#
//vararg
/*fun main(){
          println(sum(5,6,7,4,2,3,5,5,4,6,7))
}
fun sum(vararg numbers:Int): Int {
    var sum=0
    for (i in numbers){
        sum+=i
    }
        return sum
    }*/
//
fun main(){
          sum(5,6,7,4,2,3,5,5,4,6,7)
}
fun sum(vararg numbers:Int) {
    numbers.forEach{ println(it)} 
}  