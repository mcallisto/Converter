package typingsJapgolly.semanticUiReact.testContainerTestContainerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictTestContainerProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[Node] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** TestContainer has no maximum width. */
  var fluid: js.UndefOr[Boolean] = js.native
  /**Should be CallbackTo[Number]*/
  var optFn0Number: js.UndefOr[js.Function0[Double]] = js.native
  /**Should be Callback*/
  var optFn0Void: js.UndefOr[js.Function0[Unit]] = js.native
  /**Should be (x:Number) => CallbackTo[Number]*/
  var optFn1Number: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  /**Should be (x:Number) => Callback*/
  var optFn1Void: js.UndefOr[js.Function1[/* x */ Double, Unit]] = js.native
  /** Reduce maximum width to more naturally accommodate text. */
  var text: js.UndefOr[Boolean] = js.native
  /** Describes how the text inside this component should be aligned. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
  /**Should be CallbackTo[Number]*/
  def requiredFn0Number(): Double = js.native
  /**Should be Callback*/
  def requiredFn0Void(): Unit = js.native
  /**Should be (x:Number) => CallbackTo[Number]*/
  def requiredFn1Number(x: Double): Double = js.native
  /**Should be (x:Number) => Callback*/
  def requiredFn1Void(x: Double): Unit = js.native
}

object StrictTestContainerProps {
  @scala.inline
  def apply(
    requiredFn0Number: CallbackTo[Double],
    requiredFn0Void: Callback,
    requiredFn1Number: Double => Double,
    requiredFn1Void: Double => Callback
  ): StrictTestContainerProps = {
    val __obj = js.Dynamic.literal(requiredFn0Number = requiredFn0Number.toJsFn, requiredFn0Void = requiredFn0Void.toJsFn, requiredFn1Number = js.Any.fromFunction1(requiredFn1Number), requiredFn1Void = js.Any.fromFunction1((t0: Double) => requiredFn1Void(t0).runNow()))
    __obj.asInstanceOf[StrictTestContainerProps]
  }
  @scala.inline
  implicit class StrictTestContainerPropsOps[Self <: StrictTestContainerProps] (val x: Self) extends AnyVal {
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
    def setRequiredFn0Number(value: CallbackTo[Double]): Self = this.set("requiredFn0Number", value.toJsFn)
    @scala.inline
    def setRequiredFn0Void(value: Callback): Self = this.set("requiredFn0Void", value.toJsFn)
    @scala.inline
    def setRequiredFn1Number(value: Double => Double): Self = this.set("requiredFn1Number", js.Any.fromFunction1(value))
    @scala.inline
    def setRequiredFn1Void(value: Double => Callback): Self = this.set("requiredFn1Void", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = this.set("children", value.rawElement.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: VdomNode): Self = this.set("children", value.rawNode.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentVdomElement(value: VdomElement): Self = this.set("content", value.rawElement.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setOptFn0Number(value: CallbackTo[Double]): Self = this.set("optFn0Number", value.toJsFn)
    @scala.inline
    def deleteOptFn0Number: Self = this.set("optFn0Number", js.undefined)
    @scala.inline
    def setOptFn0Void(value: Callback): Self = this.set("optFn0Void", value.toJsFn)
    @scala.inline
    def deleteOptFn0Void: Self = this.set("optFn0Void", js.undefined)
    @scala.inline
    def setOptFn1Number(value: /* x */ Double => Double): Self = this.set("optFn1Number", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOptFn1Number: Self = this.set("optFn1Number", js.undefined)
    @scala.inline
    def setOptFn1Void(value: /* x */ Double => Callback): Self = this.set("optFn1Void", js.Any.fromFunction1((t0: /* x */ Double) => value(t0).runNow()))
    @scala.inline
    def deleteOptFn1Void: Self = this.set("optFn1Void", js.undefined)
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
  }
  
}

