package typingsJapgolly.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any = js.native
}

object Anon0 {
  @scala.inline
  def apply(
    defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
  ): Anon0 = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
  @scala.inline
  implicit class Anon0Ops[Self <: Anon0] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultProps(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

