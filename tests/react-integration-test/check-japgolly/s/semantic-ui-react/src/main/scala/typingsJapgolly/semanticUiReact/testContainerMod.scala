package typingsJapgolly.semanticUiReact

import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.testContainerTestContainerMod.TestContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testContainerMod {
  @JSImport("semantic-ui-react/dist/commonjs/elements/TestContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def default: StatelessComponent[TestContainerProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("default")).asInstanceOf[StatelessComponent[TestContainerProps]]
}

