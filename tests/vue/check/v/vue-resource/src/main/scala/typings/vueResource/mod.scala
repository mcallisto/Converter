package typings.vueResource

import typings.vueResource.vuejs.VueStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  @JSImport("vue-resource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def apply(vue: VueStatic): Unit = ((^ .asInstanceOf[js.Dynamic]).apply(vue.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

