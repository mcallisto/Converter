package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.buttonGroupMod.ButtonGroupProps
import typingsJapgolly.reactBootstrap.buttonGroupMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroupMod {
  @JSImport("react-bootstrap/lib/ButtonGroup", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  def withProps(p: ButtonGroupProps): SharedBuilder_ButtonGroupProps952744986[^] = new SharedBuilder_ButtonGroupProps952744986[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ButtonGroupMod.type): SharedBuilder_ButtonGroupProps952744986[^] = new SharedBuilder_ButtonGroupProps952744986[^](js.Array(this.component, js.Dictionary.empty))()
}

