import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.Button

/**
 * Created by alexfranz on 01.11.15.
 */
package object ScalaFxWindow extends JFXApp{
  stage = new PrimaryStage {
    title = "ScalaFX GUI Application"
    scene = new Scene(450,350) {
      val btn = new Button("Click me!")
      // this is how to add button to scene
      content = btn
    }
  }
}
