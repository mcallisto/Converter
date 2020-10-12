package typingsJapgolly.stardustUiReactComponentRef

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.stardustUiReactComponentRef.anon.Children
import typingsJapgolly.stardustUiReactComponentRef.anon.InnerRef
import typingsJapgolly.stardustUiReactComponentRef.typesMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refForwardMod {
  @js.native
  trait RefForward
    extends Component[RefProps, js.Object, js.Any] {
    def handleRefOverride(node: HTMLElement): Unit = js.native
  }
  
  @JSImport("@stardust-ui/react-component-ref/dist/es/RefForward", JSImport.Default)
  @js.native
  class default () extends RefForward
  
  /* static members */
  object default {
    @JSImport("@stardust-ui/react-component-ref/dist/es/RefForward", JSImport.Default)
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

