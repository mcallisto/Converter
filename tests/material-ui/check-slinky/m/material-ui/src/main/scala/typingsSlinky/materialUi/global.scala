package typingsSlinky.materialUi

import typingsSlinky.materialUi.MaterialUI.BottomNavigation.BottomNavigationItemProps
import typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  object MaterialUI {
    @JSGlobal("__MaterialUI.SvgIcon")
    @js.native
    class SvgIcon ()
      extends Component[js.Object, js.Object]
    
    object BottomNavigation {
      @JSGlobal("__MaterialUI.BottomNavigation.BottomNavigationItem")
      @js.native
      class BottomNavigationItem ()
        extends Component[BottomNavigationItemProps, js.Object]
      
    }
    
    object Styles {
      @JSGlobal("__MaterialUI.Styles")
      @js.native
      val ^ : js.Any = js.native
      @scala.inline
      def Transitions: js.Any = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("Transitions")).asInstanceOf[js.Any]
      @scala.inline
      def Transitions_=(x: js.Any): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("Transitions")(x.asInstanceOf[js.Any])
      @scala.inline
      def Typography: js.Any = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("Typography")).asInstanceOf[js.Any]
      @scala.inline
      def Typography_=(x: js.Any): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("Typography")(x.asInstanceOf[js.Any])
      @scala.inline
      def a: js.Any = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("a")).asInstanceOf[js.Any]
      @scala.inline
      def a_=(x: js.Any): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("a")(x.asInstanceOf[js.Any])
      @scala.inline
      def getMuiTheme(muiTheme: MuiTheme*): MuiTheme = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("getMuiTheme")(muiTheme.asInstanceOf[js.Any])).asInstanceOf[MuiTheme]
      @scala.inline
      def zIndex: js.Any = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("zIndex")).asInstanceOf[js.Any]
      @scala.inline
      def zIndex_=(x: js.Any): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("zIndex")(x.asInstanceOf[js.Any])
    }
    
  }
  
}

