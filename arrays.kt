/*fun main(){
    val names:Array<String> =arrayOf("virat","rajat","josh")
    names[2]="bhuvi"
    println("first element: ${names[2]}")
    println("size of array is ${names.size}")
    //start from 4 hour 35 minutes
    for(name in names){
        println(name)
    }
}*/
/*fun main(){
    //val numbers:Array<{Comparable<*> & java.io.Serializable}> =arrayOf("hii","hello","bye",1,2,3)
    var numbers=arrayOf("hii","hello","bye",1,2,3)
    for(i in numbers){
        println(i)
    }
    for(i in numbers){
        if(i is String){
        println(i)
        }
    }
}*/
/*fun main(){
  val max:Int =findmax(arrayOf(4,5,6,7,8,4,9,11))
  val min:Int =findmin(arrayOf(4,5,6,7,8,3,9))
  println("max is $max")
  println("min is $min")
}
fun findmax(numbers:Array<Int>):Int{
    var max=numbers[0]
    for(number in numbers){
        if(number>max){
            max=number
        }
    }
    return max
}
fun findmin(numbers:Array<Int>):Int{
    var min=numbers[0]
    for(number in numbers){
        if(number<min){
            min=number
        }
    }
    return min
}*/
fun main(){
    val max=findminandmax(arrayOf(10,20,30,40,50,60,70),true)
    val min=findminandmax(arrayOf(10,20,30,40,50,60,70),false)
    println("max value is $max")
    println("min value is $min")
}
fun findminandmax(numbers:Array<Int>,searchmaxmin:Boolean ):Int{
    var max=numbers[0]
    var min=numbers[0]
    if(searchmaxmin){
    for(number in numbers){
        if(number>max){
            max=number
        }
    }
return max
}
else{
    for(number in numbers){
        if(number<min){
            min=number
        }
    }
return min
    }
}
