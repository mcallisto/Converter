package typingsJapgolly.reactTransitionGroup.transitionGroupMod

import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentTransitionGroupProps[T /* <: ReactType[_] */] extends js.Object {
  var component: T = js.native
}

object ComponentTransitionGroupProps {
  @scala.inline
  def apply[/* <: typingsJapgolly.react.mod.ReactType[_] */ T](component: T): ComponentTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentTransitionGroupProps[T]]
  }
  @scala.inline
  implicit class ComponentTransitionGroupPropsOps[Self <: ComponentTransitionGroupProps[_], /* <: typingsJapgolly.react.mod.ReactType[_] */ T] (val x: Self with ComponentTransitionGroupProps[T]) extends AnyVal {
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
    def setComponent(value: T): Self = this.set("component", value.asInstanceOf[js.Any])
  }
  
}

