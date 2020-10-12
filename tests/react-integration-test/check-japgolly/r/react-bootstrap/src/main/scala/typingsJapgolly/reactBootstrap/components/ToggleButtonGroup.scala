package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactBootstrap.toggleButtonGroupMod.ToggleButtonGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object ToggleButtonGroup {
  @JSImport("react-bootstrap/lib", "ToggleButtonGroup")
  @js.native
  object component extends js.Object
  
  def apply(p: ToggleButtonGroupProps): Default[typingsJapgolly.reactBootstrap.libMod.ToggleButtonGroup] = new Default[typingsJapgolly.reactBootstrap.libMod.ToggleButtonGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ToggleButtonGroup.type): Default[typingsJapgolly.reactBootstrap.libMod.ToggleButtonGroup] = new Default[typingsJapgolly.reactBootstrap.libMod.ToggleButtonGroup](js.Array(this.component, js.Dictionary.empty))()
}

