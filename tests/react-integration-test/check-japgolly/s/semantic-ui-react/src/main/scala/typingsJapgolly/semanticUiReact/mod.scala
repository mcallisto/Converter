package typingsJapgolly.semanticUiReact

import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.buttonContentMod.ButtonContentProps
import typingsJapgolly.semanticUiReact.buttonGroupMod.ButtonGroupProps
import typingsJapgolly.semanticUiReact.buttonOrMod.ButtonOrProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button", "default")
  @js.native
  class default ()
    extends typingsJapgolly.semanticUiReact.buttonMod.default
  
  /* static members */
  object default {
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button", "default")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def Content: StatelessComponent[ButtonContentProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("Content")).asInstanceOf[StatelessComponent[ButtonContentProps]]
    @scala.inline
    def Content_=(x: StatelessComponent[ButtonContentProps]): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("Content")(x.asInstanceOf[js.Any])
    @scala.inline
    def Group: StatelessComponent[ButtonGroupProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("Group")).asInstanceOf[StatelessComponent[ButtonGroupProps]]
    @scala.inline
    def Group_=(x: StatelessComponent[ButtonGroupProps]): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("Group")(x.asInstanceOf[js.Any])
    @scala.inline
    def Or: StatelessComponent[ButtonOrProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("Or")).asInstanceOf[StatelessComponent[ButtonOrProps]]
    @scala.inline
    def Or_=(x: StatelessComponent[ButtonOrProps]): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("Or")(x.asInstanceOf[js.Any])
  }
  
}

