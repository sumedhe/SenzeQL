package com.score.senzswitch.components

import com.score.senzswitch.protocols.Senz

trait CryptoComp {

  val crypto: Crypto

  trait Crypto {

    def initKeys()

    def sing(payload: String): String

    def verify(payload: String, senz: Senz): Boolean

    def encrypt()

    def decrypt()
  }

}
