package app
import utils.CalcUtils

class App {
    fun run() {
        printHeader()
        inputValue()
    }
    private fun printHeader (){
        println("====================")
        println("Simple Calc App !   ")
        println("====================")

    }
    private fun inputValue () {
        println("Enter Value For A: ")
        val a = readLine()?. toInt() ?: 0
        println("Enter Value For B: ")
        val b = readLine()?. toInt() ?: 0
        calculate(a,b)
    }
    private fun calculate(a: Int, b: Int) {
        val calcUtils = CalcUtils()
        println("Result for Plus= ${calcUtils.plus(a,b)}")
        println("Result for Minus= ${calcUtils.minus(a,b)}")
        println("Result for Multi= ${calcUtils.multi(a,b)}")
        println("Result for Devide= ${calcUtils.divide(a,b)}")
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String> ) {
            val app = App()
            app.run()
        }
    }
}