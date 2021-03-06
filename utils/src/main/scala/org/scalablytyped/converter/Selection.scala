package org.scalablytyped.converter

sealed trait Selection[T] {
  def &&(other: Selection[T]): Selection[T] =
    Selection.And(this, other)

  def ||(other: Selection[T]): Selection[T] =
    Selection.Or(this, other)

  def map[U](f: T => U): Selection[U] =
    this match {
      case Selection.NoneExcept(values @ _*) => Selection.NoneExcept(values.map(f): _*)
      case Selection.AllExcept(values @ _*)  => Selection.AllExcept(values.map(f): _*)
      case Selection.And(_1, _2)             => Selection.And(_1.map(f), _2.map(f))
      case Selection.Or(_1, _2)              => Selection.Or(_1.map(f), _2.map(f))
    }

  def apply(value: T): Boolean =
    this match {
      case Selection.NoneExcept(values @ _*) => values.contains(value)
      case Selection.AllExcept(values @ _*)  => !values.contains(value)
      case Selection.And(_1, _2)             => _1(value) && _2(value)
      case Selection.Or(_1, _2)              => _1(value) || _2(value)
    }
}

object Selection {
  def All[T]:  Selection[T] = AllExcept()
  def None[T]: Selection[T] = NoneExcept()

  final case class AllExcept[T](values:  T*) extends Selection[T]
  final case class NoneExcept[T](values: T*) extends Selection[T]

  final case class And[T](_1: Selection[T], _2: Selection[T]) extends Selection[T]
  final case class Or[T](_1:  Selection[T], _2: Selection[T]) extends Selection[T]
}
