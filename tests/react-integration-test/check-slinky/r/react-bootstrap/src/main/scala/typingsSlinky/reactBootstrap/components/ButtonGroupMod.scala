package typingsSlinky.reactBootstrap.components

import typingsSlinky.reactBootstrap.buttonGroupMod.ButtonGroupProps
import typingsSlinky.reactBootstrap.buttonGroupMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroupMod {
  @JSImport("react-bootstrap/lib/ButtonGroup", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  def withProps(p: ButtonGroupProps): SharedBuilder_ButtonGroupProps_48069029[^] = new SharedBuilder_ButtonGroupProps_48069029[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ButtonGroupMod.type): SharedBuilder_ButtonGroupProps_48069029[^] = new SharedBuilder_ButtonGroupProps_48069029[^](js.Array(this.component, js.Dictionary.empty))()
}

