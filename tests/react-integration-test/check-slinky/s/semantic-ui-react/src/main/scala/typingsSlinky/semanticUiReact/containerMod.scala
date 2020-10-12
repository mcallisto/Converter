package typingsSlinky.semanticUiReact

import slinky.core.ReactComponentClass
import typingsSlinky.semanticUiReact.containerContainerMod.ContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def default: ReactComponentClass[ContainerProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("default")).asInstanceOf[ReactComponentClass[ContainerProps]]
}

