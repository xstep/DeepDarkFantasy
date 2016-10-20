package com.thoughtworks.DDF.Lang

import com.thoughtworks.DDF.Arrow.SimpleArrow
import com.thoughtworks.DDF.Bool.SimpleBool
import com.thoughtworks.DDF.Double.SimpleDouble
import com.thoughtworks.DDF.List.SimpleList
import com.thoughtworks.DDF.NoInfo
import com.thoughtworks.DDF.Option.SimpleOption
import com.thoughtworks.DDF.Sum.SimpleSum
import com.thoughtworks.DDF.Unit.SimpleUnit

trait SimpleLangL[Repr[_]] extends
  LangLInfo[NoInfo, Repr] with
  SimpleArrow[Repr] with
  SimpleOption[Repr] with
  SimpleDouble[Repr] with
  SimpleList[Repr] with
  SimpleSum[Repr] with
  SimpleBool[Repr] with
  SimpleUnit[Repr]

object SimpleLangL {
  implicit def apply[Repr[_]] = new SimpleLangL[Repr] {}
}