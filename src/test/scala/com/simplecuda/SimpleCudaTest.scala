package com.simplecuda

import collection.mutable.Stack
import org.scalatest._
import org.nd4j.linalg.factory.Nd4j

class SimpleCudaTest extends FlatSpec with Matchers {

  "SimpleCuda" should "make an INDArray" in {
  	val nd = Nd4j.create(Array[Float](1,2,3,4),Array[Int](2,2))
  	println(nd)
  }

}