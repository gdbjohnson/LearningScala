package week1

object session {
 1+2                                              //> res0: Int(3) = 3
 def abs(x: Double) = if (x< 0) -x else x         //> abs: (x: Double)Double
 
  def sqrt(x: Double) {
	def sqrtIter(guess: Double, x: Double) : Double =
	if (isGoodEnough(guess, x)) guess
	else sqrtIter(improve(guess, x), x)
	
 def isGoodEnough(guess: Double, x: Double) =
 abs(guess * guess - x) / x < 0.001
 
 def improve(guess: Double, x: Double) =
 (guess + x / guess) / 2
 
 
 sqrtIter(1, x)
 }                                                //> sqrt: (x: Double)Unit
 
 sqrt(2)
 
 sqrt(3)
 sqrt(4)
 
 sqrt(1e-6)
 
 
 
 
 def fact(x: Integer): Integer = {
 
 def factInt(x: Integer, y: Integer): Integer =
 	if (x == 1) y
 	else factInt(x-1, y*x)
 	
 	factInt(x, 1)
 	
 	}                                         //> fact: (x: Integer)Integer
 
 
 
 fact(2)                                          //> res1: Integer = 2
 fact(3)                                          //> res2: Integer = 6
 fact(4)                                          //> res3: Integer = 24
 
}