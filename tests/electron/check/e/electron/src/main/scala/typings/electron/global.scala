package typings.electron

import typings.electron.Electron.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  object Electron {
    @JSGlobal("Electron.EventEmitter")
    @js.native
    class EventEmitter ()
      extends typings.electron.Electron.EventEmitter
    
    @JSGlobal("Electron")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def app: App = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("app")).asInstanceOf[App]
  }
  
}

