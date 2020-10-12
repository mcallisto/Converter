package typingsSlinky.semanticUiReact

import slinky.core.ReactComponentClass
import typingsSlinky.semanticUiReact.buttonContentMod.ButtonContentProps
import typingsSlinky.semanticUiReact.buttonGroupMod.ButtonGroupProps
import typingsSlinky.semanticUiReact.buttonOrMod.ButtonOrProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button", "default")
  @js.native
  class default ()
    extends typingsSlinky.semanticUiReact.buttonMod.default
  
  /* static members */
  object default {
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button", "default")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def Content: ReactComponentClass[ButtonContentProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("Content")).asInstanceOf[ReactComponentClass[ButtonContentProps]]
    @scala.inline
    def Content_=(x: ReactComponentClass[ButtonContentProps]): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("Content")(x.asInstanceOf[js.Any])
    @scala.inline
    def Group: ReactComponentClass[ButtonGroupProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("Group")).asInstanceOf[ReactComponentClass[ButtonGroupProps]]
    @scala.inline
    def Group_=(x: ReactComponentClass[ButtonGroupProps]): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("Group")(x.asInstanceOf[js.Any])
    @scala.inline
    def Or: ReactComponentClass[ButtonOrProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("Or")).asInstanceOf[ReactComponentClass[ButtonOrProps]]
    @scala.inline
    def Or_=(x: ReactComponentClass[ButtonOrProps]): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("Or")(x.asInstanceOf[js.Any])
  }
  
}

