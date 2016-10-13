package me.yuhuan.snitch

/**
  * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/13/2016.
  */
class IntIntPair(val data: Long) extends AnyVal {
  def _1: Int = (data >> 32).toInt
  def _2: Int = (data & 0xFFFFFFFFl).toInt
}
object IntIntPair {
  def apply(_1: Int, _2: Int): IntIntPair = {
    val hi = _1.toLong << 32
    val lo = _2
    new IntIntPair(hi | lo)
  }
}
