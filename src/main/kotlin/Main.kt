//import java.util.Scanner
//KYUNNDAYO-022523

open class person(val name: String, val age: Int){
    open fun greet(){
        println("Hello! my name is $name and I am $age years old")
    }
}

class classMate(name: String, age: Int, val section: String) : person(name, age){
    override fun greet(){
        println("Hello! I am $name from the class of $section, and I am $age years old!")
    }
}
class diffUni(name: String, age:Int, val uni: String,val section:String) : person(name, age){
    override fun greet(){
        println("Hello! I am $name from $uni, my section is $section and I am $age years old")
    }
}
class faculty(name: String, age: Int, val uni: String, val facultyNum: Int) : person(name, age){
    override fun greet(){
        println("Hello! My name is $name, $age years old, I come from $uni university and my faculty number is $facultyNum")
    }

}

fun main(){
    val fred = classMate("Fred", 21,"AN21")
    val angel = classMate("Angel", 20, "MedTech")
    val angel2 = diffUni("Angel",20, "DLSM-HSI", "MLS-21")
    val theo = faculty("Theo", 20, "SJA", 3125412)


    fred.greet()
    angel2.greet()
    theo.greet()

}
