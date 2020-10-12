package typingsJapgolly.stardustUiReactComponentEventListener.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.stardustUiReactComponentEventListener.typesMod.EventListenerOptions
import typingsJapgolly.stardustUiReactComponentEventListener.typesMod.EventTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventListener {
  @JSGlobal("mod.EventListener")
  @js.native
  object component extends js.Object
  
  def withProps[T /* <: EventTypes */](p: EventListenerOptions[T]): SharedBuilder_EventListenerOptions697493185[T] = new SharedBuilder_EventListenerOptions697493185[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T /* <: EventTypes */](
    listener: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any[T] */ /* e */ js.Any => Callback,
    targetRef: RefHandle[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any
    ],
    `type`: T
  ): SharedBuilder_EventListenerOptions697493185[T] = {
    val __props = js.Dynamic.literal(listener = js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentEventMap * / any[T] */ /* e */ js.Any) => listener(t0).runNow()), targetRef = targetRef.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new SharedBuilder_EventListenerOptions697493185[T](js.Array(this.component, __props.asInstanceOf[EventListenerOptions[T]]))
  }
}

