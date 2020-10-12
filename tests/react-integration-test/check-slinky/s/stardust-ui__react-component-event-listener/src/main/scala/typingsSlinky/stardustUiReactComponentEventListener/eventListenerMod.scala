package typingsSlinky.stardustUiReactComponentEventListener

import typingsSlinky.stardustUiReactComponentEventListener.anon.Capture
import typingsSlinky.stardustUiReactComponentEventListener.anon.Listener
import typingsSlinky.stardustUiReactComponentEventListener.typesMod.EventListenerOptions
import typingsSlinky.stardustUiReactComponentEventListener.typesMod.EventTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventListenerMod {
  object default {
    @JSImport("@stardust-ui/react-component-event-listener/dist/es/EventListener", JSImport.Default)
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
      @JSImport("@stardust-ui/react-component-event-listener/dist/es/EventListener", "defaultProps")
      @js.native
      val ^ : js.Any = js.native
      @scala.inline
      def capture: Boolean = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("capture")).asInstanceOf[Boolean]
      @scala.inline
      def capture_=(x: Boolean): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("capture")(x.asInstanceOf[js.Any])
    }
    
  }
  
}

