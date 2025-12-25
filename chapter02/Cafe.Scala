package chapter02

class CreditCard

class Coffee {
  val price: Double = 2.50
}

class Cafe {
  def buyCoffee(cc: CreditCard): Coffee =
    new Coffee
}

@main def runCafe(): Unit =
  val cafe = new Cafe
  val cc = new CreditCard
  val coffee = cafe.buyCoffee(cc)
  println(s"Coffee price: ${coffee.price}")
