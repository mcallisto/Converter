package typings.serveStatic

import typings.expressServeStaticCore.mod.Handler
import typings.expressServeStaticCore.mod.Response
import typings.mime.mod.TypeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  @js.native
  trait ServeStaticOptions extends js.Object {
    var setHeaders: js.UndefOr[js.Function3[/* res */ Response, /* path */ String, /* stat */ js.Any, _]] = js.native
  }
  
  object ServeStaticOptions {
    @scala.inline
    def apply(): ServeStaticOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ServeStaticOptions]
    }
    @scala.inline
    implicit class ServeStaticOptionsOps[Self <: ServeStaticOptions] (val x: Self) extends AnyVal {
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
      def setSetHeaders(value: (/* res */ Response, /* path */ String, /* stat */ js.Any) => _): Self = this.set("setHeaders", js.Any.fromFunction3(value))
      @scala.inline
      def deleteSetHeaders: Self = this.set("setHeaders", js.undefined)
    }
    
  }
  
  @JSImport("serve-static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  @scala.inline
  def apply(root: String): Handler = ((^ .asInstanceOf[js.Dynamic]).apply(root.asInstanceOf[js.Any])).asInstanceOf[Handler]
  @scala.inline
  def apply(root: String, options: ServeStaticOptions): Handler = ((^ .asInstanceOf[js.Dynamic]).apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  @scala.inline
  def serveStatic(root: String): Handler = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("serveStatic")(root.asInstanceOf[js.Any])).asInstanceOf[Handler]
  @scala.inline
  def serveStatic(root: String, options: ServeStaticOptions): Handler = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("serveStatic")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  object mime {
    @JSImport("serve-static", "mime")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def default_type: String = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("default_type")).asInstanceOf[String]
    @scala.inline
    def define(mimes: TypeMap): Unit = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("define")(mimes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def define(mimes: TypeMap, force: Boolean): Unit = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("define")(mimes.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def getExtension(mime: String): String | Null = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("getExtension")(mime.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    @scala.inline
    def getType(path: String): String | Null = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("getType")(path.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  }
  
}

