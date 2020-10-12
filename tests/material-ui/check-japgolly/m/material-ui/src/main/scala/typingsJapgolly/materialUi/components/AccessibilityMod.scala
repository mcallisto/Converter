package typingsJapgolly.materialUi.components

import typingsJapgolly.materialUi.accessibilityMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccessibilityMod {
  @JSImport("material-ui/svg-icons/action/accessibility", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): SharedBuilder_Object_159303587[default] = new SharedBuilder_Object_159303587[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AccessibilityMod.type): SharedBuilder_Object_159303587[default] = new SharedBuilder_Object_159303587[default](js.Array(this.component, js.Dictionary.empty))()
}

