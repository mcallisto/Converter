package typingsJapgolly.semanticUiReact

import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.containerContainerMod.ContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def default: StatelessComponent[ContainerProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("default")).asInstanceOf[StatelessComponent[ContainerProps]]
}

