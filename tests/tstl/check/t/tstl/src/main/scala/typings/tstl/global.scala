package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  object std {
    @JSGlobal("std.Queue")
    @js.native
    class Queue_[T] ()
      extends typings.tstl.std.Queue_[T] {
      def this(container: typings.tstl.std.Queue_[T]) = this()
    }
    
    @JSGlobal("std")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def queue: Instantiable0[typings.tstl.std.Queue_[js.Object]] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("queue")).asInstanceOf[Instantiable0[typings.tstl.std.Queue_[js.Object]]]
    @scala.inline
    def queue_=(x: Instantiable0[typings.tstl.std.Queue_[js.Object]]): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("queue")(x.asInstanceOf[js.Any])
  }
  
}

