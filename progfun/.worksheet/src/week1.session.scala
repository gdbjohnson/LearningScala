package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(36); val res$0 = 
 1+2;System.out.println("""res0: Int(3) = """ + $show(res$0));$skip(42); 
 def abs(x: Double) = if (x< 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(324); 
 
  def sqrt(x: Double) {
	def sqrtIter(guess: Double, x: Double) : Double =
	if (isGoodEnough(guess, x)) guess
	else sqrtIter(improve(guess, x), x)
	
 def isGoodEnough(guess: Double, x: Double) =
 abs(guess * guess - x) / x < 0.001
 
 def improve(guess: Double, x: Double) =
 (guess + x / guess) / 2
 
 
 sqrtIter(1, x)
 };System.out.println("""sqrt: (x: Double)Unit""");$skip(11); 
 
 sqrt(2);$skip(11); 
 
 sqrt(3);$skip(9); 
 sqrt(4);$skip(14); 
 
 sqrt(1e-6);$skip(160); 
 
 
 
 
 def fact(x: Integer): Integer = {
 
 def factInt(x: Integer, y: Integer): Integer =
 	if (x == 1) y
 	else factInt(x-1, y*x)
 	
 	factInt(x, 1)
 	
 	};System.out.println("""fact: (x: Integer)Integer""");$skip(15); val res$1 = 
 
 
 
 fact(2);System.out.println("""res1: Integer = """ + $show(res$1));$skip(9); val res$2 = 
 fact(3);System.out.println("""res2: Integer = """ + $show(res$2));$skip(9); val res$3 = 
 fact(4);System.out.println("""res3: Integer = """ + $show(res$3))}
 
}
