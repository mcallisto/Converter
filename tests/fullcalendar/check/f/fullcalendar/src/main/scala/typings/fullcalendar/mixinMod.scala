package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixinMod {
  @JSImport("fullcalendar/Mixin", "Default")
  @js.native
  class Default_ () extends js.Object
  
  @JSImport("fullcalendar/Mixin", JSImport.Default)
  @js.native
  class default () extends Default_
  
  /* static members */
  object Default_ {
    @JSImport("fullcalendar/Mixin", "Default")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def mixInto(destClass: js.Any): Unit = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("mixInto")(destClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mixOver(destClass: js.Any): Unit = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("mixOver")(destClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* static members */
  object default {
    @JSImport("fullcalendar/Mixin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def mixInto(destClass: js.Any): Unit = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("mixInto")(destClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def mixOver(destClass: js.Any): Unit = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("mixOver")(destClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
}

