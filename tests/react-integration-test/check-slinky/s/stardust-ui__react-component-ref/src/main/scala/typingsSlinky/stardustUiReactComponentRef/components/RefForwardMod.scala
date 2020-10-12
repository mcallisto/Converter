package typingsSlinky.stardustUiReactComponentRef.components

import typingsSlinky.stardustUiReactComponentRef.refForwardMod.default
import typingsSlinky.stardustUiReactComponentRef.typesMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RefForwardMod {
  @JSImport("@stardust-ui/react-component-ref/dist/es/RefForward", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: RefProps): SharedBuilder_RefProps1237054395[default] = new SharedBuilder_RefProps1237054395[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RefForwardMod.type): SharedBuilder_RefProps1237054395[default] = new SharedBuilder_RefProps1237054395[default](js.Array(this.component, js.Dictionary.empty))()
}

