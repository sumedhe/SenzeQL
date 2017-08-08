package com.score.senzswitch.utils

class ArbTree[A] {

  case class Node(data: A, children: Seq[Node])

  val root: Node = null

  def preOrder(visit: A => Unit) = {
    def recur(n: Node): Unit = {
      visit(n.data)
      for (c <- n.children) recur(c)
    }

    recur(root)
  }
}
