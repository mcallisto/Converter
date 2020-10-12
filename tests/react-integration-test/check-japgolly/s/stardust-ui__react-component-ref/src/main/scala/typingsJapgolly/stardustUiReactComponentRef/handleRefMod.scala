package typingsJapgolly.stardustUiReactComponentRef

import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handleRefMod {
  @JSImport("@stardust-ui/react-component-ref/dist/es/handleRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  /**
    * The function that correctly handles passing refs.
    *
    * @param ref An ref object or function
    * @param node A node that should be passed by ref
    */
  @scala.inline
  def default[N](ref: Ref, node: N): Unit = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("default")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

