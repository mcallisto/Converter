package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.buttonGroupMod.ButtonGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroup {
  @JSImport("react-bootstrap/lib", "ButtonGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: ButtonGroupProps): SharedBuilder_ButtonGroupProps952744986[typingsJapgolly.reactBootstrap.libMod.ButtonGroup] = new SharedBuilder_ButtonGroupProps952744986[typingsJapgolly.reactBootstrap.libMod.ButtonGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ButtonGroup.type): SharedBuilder_ButtonGroupProps952744986[typingsJapgolly.reactBootstrap.libMod.ButtonGroup] = new SharedBuilder_ButtonGroupProps952744986[typingsJapgolly.reactBootstrap.libMod.ButtonGroup](js.Array(this.component, js.Dictionary.empty))()
}

