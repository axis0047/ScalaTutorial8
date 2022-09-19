object Question1 {
    def main (args: Array[String]):Unit = {

        val o = new Point(0,0)
        val p1 = new Point(3,4)
        val p2 = new Point(5,7)

        val p3 = p2 + p1
        println(p3)

        println(o.move(1,1))
        
        println(o.distance(p1))

        println(p2.invert)
       
    }
}

case class Point(x:Int,y:Int){

    def +(p:Point) = Point(this.x + p.x, this.y - p.y)

    def move(dx:Int,dy:Int) = Point(this.x + dx, this.y + dy)

    def distance(p:Point) = math.sqrt(math.pow(p.x - this.x, 2) + math.pow(p.y - this.y, 2))

    def invert() = Point(this.y, this.x)

    override def toString() = "(" + x + "," + y + ")"
}
