package com.demo.day10;

public sealed class MyShape permits MySquare, MyCircle, MyRectangle {

}

//public sealed class Shape 
//    permits com.example.polar.Circle,
//            com.example.quad.Rectangle,
//            com.example.quad.simple.Square { }