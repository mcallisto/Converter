package typingsJapgolly.materialUi

import typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  @JSImport("material-ui/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def getMuiTheme(muiTheme: MuiTheme*): MuiTheme = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("getMuiTheme")(muiTheme.asInstanceOf[js.Any])).asInstanceOf[MuiTheme]
  @scala.inline
  def spacing: js.Any = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("spacing")).asInstanceOf[js.Any]
  @scala.inline
  def spacing_=(x: js.Any): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("spacing")(x.asInstanceOf[js.Any])
  @scala.inline
  def transitions: js.Any = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("transitions")).asInstanceOf[js.Any]
  @scala.inline
  def transitions_=(x: js.Any): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("transitions")(x.asInstanceOf[js.Any])
  @scala.inline
  def typography: js.Any = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("typography")).asInstanceOf[js.Any]
  @scala.inline
  def typography_=(x: js.Any): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("typography")(x.asInstanceOf[js.Any])
  @scala.inline
  def zIndex: js.Any = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("zIndex")).asInstanceOf[js.Any]
  @scala.inline
  def zIndex_=(x: js.Any): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("zIndex")(x.asInstanceOf[js.Any])
}

