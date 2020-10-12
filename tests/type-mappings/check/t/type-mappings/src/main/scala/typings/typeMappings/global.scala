package typings.typeMappings

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  @scala.inline
  def foo(): Person = js.Dynamic.global.applyDynamic("foo")().asInstanceOf[Person]
  @scala.inline
  def newPerson: Instantiable0[Person] = js.Dynamic.global.selectDynamic("newPerson").asInstanceOf[Instantiable0[Person]]
  @scala.inline
  def proxy: ProxiedPerson = js.Dynamic.global.selectDynamic("proxy").asInstanceOf[ProxiedPerson]
}

