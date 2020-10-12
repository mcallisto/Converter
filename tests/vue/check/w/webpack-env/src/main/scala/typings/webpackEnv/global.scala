package typings.webpackEnv

import typings.webpackEnv.NodeJS.Process
import typings.webpackEnv.WebpackModuleApi.RequireLambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  /**
    * Equals the config option debug
    */
  @scala.inline
  def DEBUG: Boolean = js.Dynamic.global.selectDynamic("DEBUG").asInstanceOf[Boolean]
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = js.Dynamic.global.updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  @scala.inline
  def module: NodeModule = js.Dynamic.global.selectDynamic("module").asInstanceOf[NodeModule]
  @scala.inline
  def module_=(x: NodeModule): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  /**
    * Generates a require function that is not parsed by webpack. Can be used to do cool stuff with a global require function if available.
    */
  @scala.inline
  def nonWebpackRequire: js.Any = js.Dynamic.global.selectDynamic("__non_webpack_require__").asInstanceOf[js.Any]
  @scala.inline
  def nonWebpackRequire_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("__non_webpack_require__")(x.asInstanceOf[js.Any])
  @scala.inline
  def process: Process = js.Dynamic.global.selectDynamic("process").asInstanceOf[Process]
  @scala.inline
  def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  @scala.inline
  def require: NodeRequire = js.Dynamic.global.selectDynamic("require").asInstanceOf[NodeRequire]
  @scala.inline
  def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  /**
    * The resource query of the current module.
    *
    * e.g. __resourceQuery === "?test" // Inside "file.js?test"
    */
  @scala.inline
  def resourceQuery: String = js.Dynamic.global.selectDynamic("__resourceQuery").asInstanceOf[String]
  @scala.inline
  def resourceQuery_=(x: String): Unit = js.Dynamic.global.updateDynamic("__resourceQuery")(x.asInstanceOf[js.Any])
  /**
    * The internal chunk loading function
    *
    * @param chunkId The id for the chunk to load.
    * @param callback A callback function called once the chunk is loaded.
    */
  @scala.inline
  def webpackChunkLoad: js.Function2[
    /* chunkId */ js.Any, 
    /* callback */ js.Function1[/* require */ RequireLambda, Unit], 
    Unit
  ] = js.Dynamic.global.selectDynamic("__webpack_chunk_load__").asInstanceOf[js.Function2[
    /* chunkId */ js.Any, 
    /* callback */ js.Function1[/* require */ RequireLambda, Unit], 
    Unit
  ]]
  @scala.inline
  def webpackChunkLoad_=(
    x: js.Function2[
      /* chunkId */ js.Any, 
      /* callback */ js.Function1[/* require */ RequireLambda, Unit], 
      Unit
    ]
  ): Unit = js.Dynamic.global.updateDynamic("__webpack_chunk_load__")(x.asInstanceOf[js.Any])
  /**
    * Access to the hash of the compilation.
    *
    * Only available with the HotModuleReplacementPlugin or the ExtendedAPIPlugin
    */
  @scala.inline
  def webpackHash: js.Any = js.Dynamic.global.selectDynamic("__webpack_hash__").asInstanceOf[js.Any]
  @scala.inline
  def webpackHash_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("__webpack_hash__")(x.asInstanceOf[js.Any])
  /**
    * Access to the internal object of all modules.
    */
  @scala.inline
  def webpackModules: js.Array[js.Any] = js.Dynamic.global.selectDynamic("__webpack_modules__").asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def webpackModules_=(x: js.Array[js.Any]): Unit = js.Dynamic.global.updateDynamic("__webpack_modules__")(x.asInstanceOf[js.Any])
  /**
    * Equals the config options output.publicPath.
    */
  @scala.inline
  def webpackPublicPath: String = js.Dynamic.global.selectDynamic("__webpack_public_path__").asInstanceOf[String]
  @scala.inline
  def webpackPublicPath_=(x: String): Unit = js.Dynamic.global.updateDynamic("__webpack_public_path__")(x.asInstanceOf[js.Any])
  /**
    * The raw require function. This expression isn’t parsed by the Parser for dependencies.
    */
  @scala.inline
  def webpackRequire: js.Any = js.Dynamic.global.selectDynamic("__webpack_require__").asInstanceOf[js.Any]
  @scala.inline
  def webpackRequire_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("__webpack_require__")(x.asInstanceOf[js.Any])
  /**
  * Declare process variable
  */
  object NodeJS
  
}

