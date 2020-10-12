package typings.node

import typings.node.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  @scala.inline
  def process: Process = js.Dynamic.global.selectDynamic("process").asInstanceOf[Process]
  @scala.inline
  def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  object NodeJS {
    @JSGlobal("NodeJS.EventEmitter")
    @js.native
    class EventEmitter ()
      extends typings.node.NodeJS.EventEmitter
    
  }
  
  object Symbol {
    @JSGlobal("Symbol")
    @js.native
    val ^ : SymbolConstructor = js.native
  }
  
}

