package typingsJapgolly.stardustUiReactComponentRef

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  @js.native
  trait RefProps extends js.Object {
    var children: Element = js.native
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param {HTMLElement} node - Referred node.
      */
    var innerRef: Ref = js.native
  }
  
  object RefProps {
    @scala.inline
    def apply(children: VdomElement): RefProps = {
        val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
        __obj.asInstanceOf[RefProps]
    }
    @scala.inline
    implicit class RefPropsOps[Self <: RefProps] (val x: Self) extends AnyVal {
      @scala.inline
      def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
      @scala.inline
      def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
      @scala.inline
      def set(key: String, value: js.Any): Self = {
            x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
            x
      }
      @scala.inline
      def setChildren(value: VdomElement): Self = this.set("children", value.rawElement.asInstanceOf[js.Any])
      @scala.inline
      def setInnerRef(value: Ref): Self = this.set("innerRef", value.asInstanceOf[js.Any])
      @scala.inline
      def setInnerRefNull: Self = this.set("innerRef", null)
    }
    
  }
  
  @JSImport("@stardust-ui/react-component-ref/dist/es/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def refPropType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Requireable<React.Ref<any>> */ js.Any = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("refPropType")).asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Requireable<React.Ref<any>> */ js.Any]
}

