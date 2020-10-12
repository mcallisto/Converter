package typings.vue

import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  @JSImport("vue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def default: VueConstructor[Vue] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("default")).asInstanceOf[VueConstructor[Vue]]
}

