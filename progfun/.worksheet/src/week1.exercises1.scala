package week1

object exercises1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(161); 

  def pascal(c: Int, r: Int): Int =
    if (c == 0) 1
    else if (c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1);System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(16); val res$0 = 

  pascal(4, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(371); 

  def balance(chars: List[Char]): Boolean = {
  
    def check(chars: List[Char], bal: Int): Boolean = {
      if (chars.isEmpty) bal == 0
      else if (chars.head == '(')
        check(chars.tail, bal + 1)
      else if (chars.head == ')')
        check(chars.tail, bal - 1)
      else
        check(chars.tail, bal)
    }
    //print("hello")
    check(chars, 0)
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(31); val res$1 = 

"this is a test()))((".toList;System.out.println("""res1: List[Char] = """ + $show(res$1));$skip(39); val res$2 = 
balance("this is a test()))((".toList);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(343); 

def countChange(money: Int, coins: List[Int]): Int = {

def rec1(money: Int, coins: List[Int]): Int = {
	if (coins.isEmpty) 0
	else {
		rec1(money, coins.tail) +
		rec2(money - coins.head, coins)
	}
}

def rec2(money: Int, coins: List[Int]): Int = {
	if (money == 0) 1
	else if (money < 0) 0
	else rec1(money, coins)
}

rec1(money, coins)

};System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(29); val res$3 = 

countChange(10, List(1, 2));System.out.println("""res3: Int = """ + $show(res$3))}

}
