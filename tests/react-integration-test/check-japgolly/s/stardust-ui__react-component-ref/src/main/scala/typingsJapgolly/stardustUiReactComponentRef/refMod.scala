package typingsJapgolly.stardustUiReactComponentRef

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.stardustUiReactComponentRef.typesMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refMod {
  @JSImport("@stardust-ui/react-component-ref/dist/es/Ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def default: FunctionComponent[RefProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("default")).asInstanceOf[FunctionComponent[RefProps]]
}

