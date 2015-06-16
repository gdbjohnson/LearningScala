package week1

object exercises1 {

  def pascal(c: Int, r: Int): Int =
    if (c == 0) 1
    else if (c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)  //> pascal: (c: Int, r: Int)Int

  pascal(4, 4)                                    //> res0: Int = 1

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
  }                                               //> balance: (chars: List[Char])Boolean

"this is a test()))((".toList                     //> res1: List[Char] = List(t, h, i, s,  , i, s,  , a,  , t, e, s, t, (, ), ), )
                                                  //| , (, ()
balance("this is a test()))((".toList)            //> res2: Boolean = true

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

}                                                 //> countChange: (money: Int, coins: List[Int])Int

countChange(10, List(1, 2))                       //> res3: Int = 6

}