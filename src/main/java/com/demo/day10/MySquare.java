package com.demo.day10;

//closed for extension
public final class MySquare extends MyShape {

}

//open for extension
non-sealed class MyCircle extends MyShape {

}

class FilledCircle extends MyCircle {

}

//	- The class MyTriangle cannot extend the class MyShape as it is not a permitted subtype of MyShape
//class MyTriangle extends MyShape {
//
//}
// The type FilledSquare cannot subclass the final class MySquare
//class FilledSquare extends MySquare {
//
//}
sealed class MyRectangle extends MyShape permits MyFilledRectangle {

}

final class MyFilledRectangle extends MyRectangle {

}