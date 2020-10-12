package typingsSlinky.stardustUiReactComponentRef

import slinky.core.ReactComponentClass
import typingsSlinky.stardustUiReactComponentRef.typesMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refMod {
  @JSImport("@stardust-ui/react-component-ref/dist/es/Ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def default: ReactComponentClass[RefProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("default")).asInstanceOf[ReactComponentClass[RefProps]]
}

