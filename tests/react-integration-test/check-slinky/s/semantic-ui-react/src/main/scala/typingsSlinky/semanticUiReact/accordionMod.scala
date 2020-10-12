package typingsSlinky.semanticUiReact

import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.accordionAccordionMod.AccordionComponent
import typingsSlinky.semanticUiReact.accordionAccordionMod.AccordionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion", "default")
  @js.native
  class default protected ()
    extends Component[AccordionProps, js.Object, js.Any] {
    def this(props: AccordionProps) = this()
    def this(props: AccordionProps, context: js.Any) = this()
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def default: AccordionComponent = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("default")).asInstanceOf[AccordionComponent]
}

