//for loop
/*fun main(){
    for(i in 1..10){
        println(i)
    }
}*/
/*/ fun main(){
     for(i in 1 until 10){
         println(i)
     }
}*/
/* fun main(){
     for(i in 10 downTo 1){
         println(i)
     }
 }*/
/* fun main(){
     for(i in 1 until 10 step 3){
         println(i)
     }
 }*/
/*fun main(){
    var a=0
    while(a<10){            //while(a<10) println(a++)
        println(a)          //while(a<10) println(++a)
       a=a+1
    }
}*/
/*fun main(){
    var a=0
    while(a<10){
        a++
        println(a)
    var i=0
    while(i<5){
        i++
        println("****$i")
    }}}*/
    /*fun main(){
    var a=0
    outer@  while(a<10){
        a++
        println(a)
    var i=0
    while(i<5){
        if(i==0) break@outer
        i++
        println("****$i")
    }}}*/
fun main(){
    var number=1
    var lastnumber=20
    var evennumbers=0
    while(number<=lastnumber){
        number++
        if(!iseven(number)){
            continue
        }
        evennumbers++
        println(number)
    }
    println("total even number is $evennumbers")
}
fun iseven(n:Int) : Boolean {
if(n%2==0){
    return true
}
else  return false
}