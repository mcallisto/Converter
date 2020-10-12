package typingsSlinky.stardustUiReactComponentEventListener

import slinky.core.facade.ReactRef
import typingsSlinky.stardustUiReactComponentEventListener.anon.Capture
import typingsSlinky.stardustUiReactComponentEventListener.anon.Listener
import typingsSlinky.stardustUiReactComponentEventListener.typesMod.EventListenerOptions
import typingsSlinky.stardustUiReactComponentEventListener.typesMod.EventTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  @JSImport("@stardust-ui/react-component-event-listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def documentRef: ReactRef[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
  ] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("documentRef")).asInstanceOf[ReactRef[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
  ]]
  @scala.inline
  def useEventListener[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any */](options: EventListenerOptions[T]): Unit = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("useEventListener")(options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def windowRef: ReactRef[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
  ] = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("windowRef")).asInstanceOf[ReactRef[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
  ]]
  object EventListener {
    @JSImport("@stardust-ui/react-component-event-listener", "EventListener")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def apply[T /* <: EventTypes */](props: EventListenerOptions[T]): js.Any = ((^ .asInstanceOf[js.Dynamic]).apply(props.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def displayName: String = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("displayName")).asInstanceOf[String]
    @scala.inline
    def displayName_=(x: String): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("displayName")(x.asInstanceOf[js.Any])
    @scala.inline
    def propTypes: Capture | Listener = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("propTypes")).asInstanceOf[Capture | Listener]
    @scala.inline
    def propTypes_=(x: Capture | Listener): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    object defaultProps {
      @JSImport("@stardust-ui/react-component-event-listener", "EventListener.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      @scala.inline
      def capture: Boolean = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("capture")).asInstanceOf[Boolean]
      @scala.inline
      def capture_=(x: Boolean): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("capture")(x.asInstanceOf[js.Any])
    }
    
  }
  
}

