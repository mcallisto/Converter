package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.accordionAccordionMod.AccordionProps
import typingsSlinky.semanticUiReact.accordionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccordionMod {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion", "default")
  @js.native
  object component extends js.Object
  
  def withProps(p: AccordionProps): SharedBuilder_AccordionProps1547747125[default] = new SharedBuilder_AccordionProps1547747125[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AccordionMod.type): SharedBuilder_AccordionProps1547747125[default] = new SharedBuilder_AccordionProps1547747125[default](js.Array(this.component, js.Dictionary.empty))()
}

