/**
  * Created by Cypress on 24.02.2017.
  */

import Tables._
import LexAnal._

object Main extends App{
  val an = new LexicalAnalyzer("test.txt")
  an.printAnalyzeRes()
  printTables()
}
