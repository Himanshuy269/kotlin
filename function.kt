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
fun main(){
    val max= getmax(5,7,8)
    println(max)
}
fun getmax(a:Int,b:Int)= if(a>b) a else b
fun getmax(a:Double,b:Double)= if(a>b) a else b 
fun getmax(a:Int,b:Int,c:Int):Int {
    if(a>=b && b>=c){ return a}
    else if(b>=a && b>=c){return b}
    else return c
}