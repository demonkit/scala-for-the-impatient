abstract class Item {
    def price: Double
    def description: String
}

class SimpleItem(val price: Double, val description: String) extends Item

class Bundle extends Item {
    private var items: ArrayBuffer[Item]()

    def price(): Double = items.foldLeft(0.0)(_+_.price)

    def description(): String = items.map(_.description).mkString(",")

    def addItem(i: Item) {
        item += i
    }
}
