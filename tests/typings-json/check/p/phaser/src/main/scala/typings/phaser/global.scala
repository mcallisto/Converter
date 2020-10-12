package typings.phaser

import typings.phaser.anon.LowerBound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  @JSGlobal("Phaser")
  @js.native
  class Phaser ()
    extends typings.phaser.Phaser
  
  object PIXI {
    @JSGlobal("PIXI")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def CANVAS_RENDERER: Double = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("CANVAS_RENDERER")).asInstanceOf[Double]
    @scala.inline
    def CANVAS_RENDERER_=(x: Double): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("CANVAS_RENDERER")(x.asInstanceOf[js.Any])
    @scala.inline
    def VERSION: String = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("VERSION")).asInstanceOf[String]
    @scala.inline
    def VERSION_=(x: String): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    @scala.inline
    def WEBGL_RENDERER: Double = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("WEBGL_RENDERER")).asInstanceOf[Double]
    @scala.inline
    def WEBGL_RENDERER_=(x: Double): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("WEBGL_RENDERER")(x.asInstanceOf[js.Any])
    @JSGlobal("PIXI.blendModes")
    @js.native
    object blendModes extends js.Object {
      /* 1 */ val ADD: typings.phaser.PIXI.blendModes.ADD with Double = js.native
      /* 0 */ val NORMAL: typings.phaser.PIXI.blendModes.NORMAL with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.phaser.PIXI.blendModes with Double] = js.native
    }
    
    @JSGlobal("PIXI.scaleModes")
    @js.native
    object scaleModes extends js.Object {
      /* 0 */ val DEFAULT: typings.phaser.PIXI.scaleModes.DEFAULT with Double = js.native
      /* 1 */ val LINEAR: typings.phaser.PIXI.scaleModes.LINEAR with Double = js.native
      /* 2 */ val NEAREST: typings.phaser.PIXI.scaleModes.NEAREST with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.phaser.PIXI.scaleModes with Double] = js.native
    }
    
  }
  
  /* static members */
  object Phaser {
    /**
      * An Animation instance contains a single animation and the controls to play it.
      *
      * It is created by the AnimationManager, consists of Animation.Frame objects and belongs to a single Game Object such as a Sprite.
      */
    @JSGlobal("Phaser.Animation")
    @js.native
    class Animation ()
      extends typings.phaser.Phaser.Animation
    
    @JSGlobal("Phaser")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def VERSION: String = ((^ .asInstanceOf[js.Dynamic]).selectDynamic("VERSION")).asInstanceOf[String]
    @scala.inline
    def VERSION_=(x: String): Unit = (^ .asInstanceOf[js.Dynamic]).updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  object p2 {
    @JSGlobal("p2.AABB")
    @js.native
    class AABB ()
      extends typings.phaser.p2.AABB {
      def this(options: LowerBound) = this()
    }
    
  }
  
}

