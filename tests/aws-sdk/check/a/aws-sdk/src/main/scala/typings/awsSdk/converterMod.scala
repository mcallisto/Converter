package typings.awsSdk

import typings.awsSdk.dynamodbMod.AttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converterMod {
  @JSImport("aws-sdk/lib/dynamodb/converter", "Converter")
  @js.native
  class Converter () extends js.Object
  
  /* static members */
  object Converter {
    @JSImport("aws-sdk/lib/dynamodb/converter", "Converter")
    @js.native
    val ^ : js.Any = js.native
    @scala.inline
    def input(data: js.Any): AttributeValue = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("input")(data.asInstanceOf[js.Any])).asInstanceOf[AttributeValue]
    @scala.inline
    def input(data: js.Any, options: ConverterOptions): AttributeValue = ((^ .asInstanceOf[js.Dynamic]).applyDynamic("input")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeValue]
    type ConverterOptions = typings.awsSdk.documentClientMod.DocumentClient.ConverterOptions
  }
  
}

