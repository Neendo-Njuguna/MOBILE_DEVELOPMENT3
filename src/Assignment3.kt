fun main(){
school("akirachix")
    details("Caroline",21 )
length("Njuguna")
    fact("Naserian")
    fact("Mwimali")
}

fun school(school:String){
    print(school[0])
    print(school [2])
    println(school [3])
}
fun details(name:String, age:Int){
    println("Hi, my name is "+ name +" I am " +age+ "years old" )

}
fun length(name:String){
    var name="Njuguna"
    println(name.length)
}
fun fact(fact:String){
    if (fact=="Naserian"){
        println("That's me!")
    }
    else {
        println("I do not know who that is")
    }
}
