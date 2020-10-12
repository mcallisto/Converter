package typings.firebaseAdmin

import typings.googleCloudFirestore.FirebaseFirestore.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  object firestore {
    @JSImport("firebase-admin", "firestore.Firestore")
    @js.native
    /**
      * @param settings Configuration object. See [Firestore Documentation]
      * {@link https://firebase.google.com/docs/firestore/}
      */
    class Firestore ()
      extends typings.googleCloudFirestore.FirebaseFirestore.Firestore {
      def this(settings: Settings) = this()
    }
    
    @JSImport("firebase-admin", "firestore")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def apply(): Firestore = ((^ .asInstanceOf[js.Dynamic]).apply()).asInstanceOf[Firestore]
    @scala.inline
    def apply(str: String): Firestore = ((^ .asInstanceOf[js.Dynamic]).apply(str.asInstanceOf[js.Any])).asInstanceOf[Firestore]
  }
  
}

