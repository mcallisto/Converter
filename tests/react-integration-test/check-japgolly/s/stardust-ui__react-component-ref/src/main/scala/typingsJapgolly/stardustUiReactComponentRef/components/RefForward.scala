package typingsJapgolly.stardustUiReactComponentRef.components

import typingsJapgolly.stardustUiReactComponentRef.refForwardMod.default
import typingsJapgolly.stardustUiReactComponentRef.typesMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RefForward {
  @JSImport("@stardust-ui/react-component-ref/dist/es/RefForward", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: RefProps): SharedBuilder_RefProps171925374[default] = new SharedBuilder_RefProps171925374[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RefForward.type): SharedBuilder_RefProps171925374[default] = new SharedBuilder_RefProps171925374[default](js.Array(this.component, js.Dictionary.empty))()
}

