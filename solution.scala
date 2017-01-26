object Solution {
    
     private var fibs = scala.collection.mutable.HashMap.empty[Int,Int]
     def fibonacci(x:Int):Int = {
          if (fibs contains x) {
              return fibs(x)
          }
          else if (x < 2) {
              return 0
          }
          else if (x < 4) {
              return 1
          }
          else {
              val result:Int = fibonacci(x-2) + fibonacci(x-1)
              fibs += (x -> result)
              return result
          }
     }

    def main(args: Array[String]) {
         val x:Int = readLine().toInt
         println(fibonacci(x))
    }
}
