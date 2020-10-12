package typingsSlinky.stardustUiReactComponentRef

import typingsSlinky.react.mod.Component
import typingsSlinky.stardustUiReactComponentRef.anon.Children
import typingsSlinky.stardustUiReactComponentRef.anon.InnerRef
import typingsSlinky.stardustUiReactComponentRef.typesMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refFindNodeMod {
  @js.native
  trait RefFindNode
    extends Component[RefProps, js.Object, js.Any] {
    var prevNode: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Node */ js.Any) | Null = js.native
    @JSName("componentDidMount")
    def componentDidMount_MRefFindNode(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRefFindNode(prevProps: RefProps): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRefFindNode(): Unit = js.native
  }
  
  @JSImport("@stardust-ui/react-component-ref/dist/es/RefFindNode", JSImport.Default)
  @js.native
  class default () extends RefFindNode
  
  /* static members */
  object default {
    @JSImport("@stardust-ui/react-component-ref/dist/es/RefFindNode", JSImport.Default)
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

