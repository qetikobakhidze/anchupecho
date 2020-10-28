fun main () {

    val per= Point(x = 5F, y = 4F)

    println(per.getArea())

}


interface IFigure {
    fun getArea(): Float
}


class Point ( x: Float, y: Float ):IFigure {
    private var xCoordinate: Float = x
    private var yCoordinate: Float = y



    override fun toString(): String {
        return "$xCoordinate, $yCoordinate"
    }

    override fun getArea(): Float {
        return xCoordinate * yCoordinate / 2
    }


    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (xCoordinate > yCoordinate) {
                return true
            }
        }
        return false
    }
}













