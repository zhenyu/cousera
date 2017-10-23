package funsets

object Main extends App {
  import FunSets._
  printSet(map(union(singletonSet(1),singletonSet(2)), (x:Int)=>x+1))
}
