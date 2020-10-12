package typingsJapgolly.materialUi.components

import typingsJapgolly.materialUi.MaterialUI.BottomNavigation.BottomNavigationItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BottomNavigationItem {
  @JSImport("material-ui/BottomNavigation/BottomNavigationItem", "BottomNavigationItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: BottomNavigationItemProps): SharedBuilder_BottomNavigationItemProps226372499[typingsJapgolly.materialUi.bottomNavigationItemMod.BottomNavigationItem] = new SharedBuilder_BottomNavigationItemProps226372499[typingsJapgolly.materialUi.bottomNavigationItemMod.BottomNavigationItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: Double): SharedBuilder_BottomNavigationItemProps226372499[typingsJapgolly.materialUi.bottomNavigationItemMod.BottomNavigationItem] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_BottomNavigationItemProps226372499[typingsJapgolly.materialUi.bottomNavigationItemMod.BottomNavigationItem](js.Array(this.component, __props.asInstanceOf[BottomNavigationItemProps]))
  }
}

