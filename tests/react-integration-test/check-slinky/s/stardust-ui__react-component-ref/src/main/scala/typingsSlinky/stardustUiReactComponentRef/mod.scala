package typingsSlinky.stardustUiReactComponentRef

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.stardustUiReactComponentRef.anon.Children
import typingsSlinky.stardustUiReactComponentRef.anon.InnerRef
import typingsSlinky.stardustUiReactComponentRef.refFindNodeMod.default
import typingsSlinky.stardustUiReactComponentRef.typesMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  @JSImport("@stardust-ui/react-component-ref", "RefFindNode")
  @js.native
  class RefFindNode () extends default
  
  @JSImport("@stardust-ui/react-component-ref", "RefForward")
  @js.native
  class RefForward ()
    extends typingsSlinky.stardustUiReactComponentRef.refForwardMod.default
  
  @JSImport("@stardust-ui/react-component-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def Ref: ReactComponentClass[RefProps] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("Ref")).asInstanceOf[ReactComponentClass[RefProps]]
  /**
    * The function that correctly handles passing refs.
    *
    * @param ref An ref object or function
    * @param node A node that should be passed by ref
    */
  @scala.inline
  def handleRef[N](ref: Ref[N], node: N): Unit = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("handleRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /** Checks that the passed object is a valid React ref object. */
  @scala.inline
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("isRefObject")(ref.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.RefObject<any> */ Boolean]
  @scala.inline
  def refPropType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Requireable<React.Ref<any>> */ js.Any = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("refPropType")).asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Requireable<React.Ref<any>> */ js.Any]
  /** Creates a React ref object from existing DOM node. */
  @scala.inline
  def toRefObject[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any */](node: T): ReactRef[T] = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("toRefObject")(node.asInstanceOf[js.Any])).asInstanceOf[ReactRef[T]]
  /* static members */
  object RefFindNode {
    @JSImport("@stardust-ui/react-component-ref", "RefFindNode")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def displayName: String = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("displayName")).asInstanceOf[String]
    @scala.inline
    def displayName_=(x: String): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("displayName")(x.asInstanceOf[js.Any])
    @scala.inline
    def propTypes: Children | InnerRef = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("propTypes")).asInstanceOf[Children | InnerRef]
    @scala.inline
    def propTypes_=(x: Children | InnerRef): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* static members */
  object RefForward {
    @JSImport("@stardust-ui/react-component-ref", "RefForward")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def displayName: String = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("displayName")).asInstanceOf[String]
    @scala.inline
    def displayName_=(x: String): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("displayName")(x.asInstanceOf[js.Any])
    @scala.inline
    def propTypes: Children | InnerRef = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("propTypes")).asInstanceOf[Children | InnerRef]
    @scala.inline
    def propTypes_=(x: Children | InnerRef): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
}

