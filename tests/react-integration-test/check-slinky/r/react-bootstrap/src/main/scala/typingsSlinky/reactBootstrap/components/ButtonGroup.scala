package typingsSlinky.reactBootstrap.components

import typingsSlinky.reactBootstrap.buttonGroupMod.ButtonGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroup {
  @JSImport("react-bootstrap", "ButtonGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: ButtonGroupProps): SharedBuilder_ButtonGroupProps_48069029[typingsSlinky.reactBootstrap.mod.ButtonGroup] = new SharedBuilder_ButtonGroupProps_48069029[typingsSlinky.reactBootstrap.mod.ButtonGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ButtonGroup.type): SharedBuilder_ButtonGroupProps_48069029[typingsSlinky.reactBootstrap.mod.ButtonGroup] = new SharedBuilder_ButtonGroupProps_48069029[typingsSlinky.reactBootstrap.mod.ButtonGroup](js.Array(this.component, js.Dictionary.empty))()
}

