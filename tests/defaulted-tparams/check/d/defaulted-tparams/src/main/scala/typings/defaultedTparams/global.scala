package typings.defaultedTparams

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  @JSGlobal("Queue")
  @js.native
  class Queue[S, T] ()
    extends typings.defaultedTparams.Queue[S, T]
  
  /* static members */
  object Queue {
    @JSGlobal("Queue")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def from[T](iterable: Iterable[T]): typings.defaultedTparams.Queue[T, T] = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("from")(iterable.asInstanceOf[js.Any])).asInstanceOf[typings.defaultedTparams.Queue[T, T]]
    @scala.inline
    def from[T](iterable: Iterable[T], length: Double): typings.defaultedTparams.Queue[T, T] = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("from")(iterable.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.defaultedTparams.Queue[T, T]]
  }
  
}

