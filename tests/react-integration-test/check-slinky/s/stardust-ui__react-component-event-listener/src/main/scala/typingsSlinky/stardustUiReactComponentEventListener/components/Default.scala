package typingsSlinky.stardustUiReactComponentEventListener.components

import slinky.core.facade.ReactRef
import typingsSlinky.stardustUiReactComponentEventListener.typesMod.EventListenerOptions
import typingsSlinky.stardustUiReactComponentEventListener.typesMod.EventTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Default {
  @JSGlobal("eventListenerMod.default")
  @js.native
  object component extends js.Object
  
  def withProps[T /* <: EventTypes */](p: EventListenerOptions[T]): SharedBuilder_EventListenerOptions_1485545394[T] = new SharedBuilder_EventListenerOptions_1485545394[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T /* <: EventTypes */](
    listener: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any[T] */ /* e */ js.Any => Unit,
    targetRef: ReactRef[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
    ],
    `type`: T
  ): SharedBuilder_EventListenerOptions_1485545394[T] = {
    val __props = js.Dynamic.literal(listener = js.Any.fromFunction1(listener), targetRef = targetRef.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new SharedBuilder_EventListenerOptions_1485545394[T](js.Array(this.component, __props.asInstanceOf[EventListenerOptions[T]]))
  }
}

