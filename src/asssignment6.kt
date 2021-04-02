import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName

fun main() {
var BMW = Car("Honda", "X1", "White", 5)
    BMW.carry(3)
    BMW.carry(7)
    BMW.identity()
    println(BMW.calculatePackingFees(4))
    var brand = Bus("Toyota", "Blue", "Costa", 30)
    println(brand.maxTripFare(15000.toDouble()))
    println(brand.calculatePackingFees(12))
}

 open class Car(var make:String, var model:String, var color:String, var capacity:Int){
     fun carry (people:Int){
    var x = people-capacity
    if(people<=capacity){
        println("carrying $people passengers")
    }
    else{
        println("Over capacity $x people")
    }
}
    fun identity (){
        println("I am a $color $make $model ")
    }
    open fun calculatePackingFees(hours:Int):Int{
        return hours*20
    }
}

class Bus(make:String, color:String, model:String, capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        return capacity*fare
    }
    override fun calculatePackingFees(hours:Int):Int{
        return hours*capacity
    }
}