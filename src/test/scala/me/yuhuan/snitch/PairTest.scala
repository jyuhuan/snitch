package me.yuhuan.snitch

import org.scalatest._

/**
  * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/13/2016.
  */
class PairTest extends FunSuite {

  test("IntIntPair Test") {
    val _1 = -3
    val _2 = 4
    val p = IntIntPair(_1, _2)
    val p_1 = p._1
    val p_2 = p._2
    assert(_1 == p_1)
    assert(_2 == p_2)
  }

}
