package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  @scala.inline
  def Error: typings.std.Error = js.Dynamic.global.selectDynamic("Error").asInstanceOf[typings.std.Error]
  @scala.inline
  def Function: js.Function = js.Dynamic.global.selectDynamic("Function").asInstanceOf[js.Function]
  @scala.inline
  def Promise: js.Promise[js.Any] = js.Dynamic.global.selectDynamic("Promise").asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def RegExp: typings.std.RegExp = js.Dynamic.global.selectDynamic("RegExp").asInstanceOf[typings.std.RegExp]
}

