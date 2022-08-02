fun main() {
    // Step 1: Declare Variables 
    val candles = 2
    val layers = 6
    println("Number of Candles = $candles") // one single value of variable
    //println("Number of Candles = ${candles+layers}") // total of multiple values
    println("Length of cake top = $candles")
    println("Number of layers = $layers")
    
    // step 1: print candles
    printCakeCandles(candles)
    // step 2: print cake top
    printCakeTop(candles)
    // step 3: print cake layers
    printCakeBottom(candles, layers)
}

fun printCakeCandles(candles: Int){
    print(" ")
    repeat(candles){
     	print(",")
    }
    println() // Print an empty line
	print(" ")
    repeat(candles){
     	print("|")
    }
    println() // Print an empty line 
}

fun printCakeTop(candles: Int) {
	repeat(candles + 2) {
		print("=")
	}
	println()
}

fun printCakeBottom(candles: Int, layers: Int){
   	repeat(layers) {
        repeat(candles + 2){
          print("@")  
        }
        println()
	}
}
