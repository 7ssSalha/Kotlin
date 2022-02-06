package concepts.functions

import kotlin.math.abs

data class Point(var x: Int, var y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

operator fun Point.unaryPlus() = Point(abs(x), abs(y))

operator fun Point.not() = Point(-1*x,-1*y)

operator fun Point.inc():Point = Point(x + 1,y + 1)

operator fun Point.dec():Point = Point(x - 1,y - 1)

operator fun Point.plus(point: Point) = Point(this.x  + point.x  ,this.y + point.y )

operator fun Point.minus(point: Point) = Point(this.x -  point.x ,this.y - point.y )

operator fun Point.times(multiply:Int) = Point(this.x * multiply , this.y * multiply)

//operator fun Point.equals(point: Point) = this.x == point.x && this.y == point.y

fun main() {
    var point  = Point(10, 20)
    val pointA = Point(5,-4)
    val pointB = Point(-3,2)
    println(point) //x=10 y=20
    point = -point
    println(point) //x=-10 y=-20
    point = +point
    println(point) //x=10 y=20
    point = ++point
    println(point) //x=11 y=21
    point = --point
    println(point) //x=10 y=20
    point = !point
    println(point) //x=-10 y=-20
    println(point + pointA)  //x=-5   y=-24
    println(point + pointB)  //x=-13  y=-18
    println(pointA + pointB) //x=2    y=-2
    println(pointA - pointB) //x=8    y=-6
    println(pointA * 5)      //x=25   y=-20
    point += pointB
    println(point)  //x=-13   y=-
    val pointC = Point(7,10)
    val pointD = Point(7,10)
    println(pointC == pointD)
    println(pointC === pointD)
    println(pointC.equals(pointD))//can be replaced with ==
}