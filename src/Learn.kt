
fun main(args : Array<String>) {
   val d = InterImpl()

   //We can also called the interface method from the instance of the class
   d.name = "Cool boy iiiii"
   println("Now i am calling to the prop = ${d.name}")
   //Interace can be implemented by the object and class
   //The difference between the abstract class and interface is that interface can't store the state.
   //Both can be create properties

   val list = mutableListOf<Int>(2, 4, 8, 9)
   val name = "Ankit"
   print(name.toUppercase())
   
}