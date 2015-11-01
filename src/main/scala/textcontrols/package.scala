import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.event._
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.Includes._

/**
 * Created by alexfranz
 */
package object TextControls extends JFXApp {
  stage = new PrimaryStage {
    title = "Text Controls"
    scene = new Scene(450,400) {
      val label = new Label("This is a Label.")
      label.layoutX = 25
      label.layoutY = 25

      val text = new TextField
      text.layoutX = 25
      text.layoutY = 55
      text.promptText = "A Field"

      val area = new TextArea
      area.layoutX = 25
      area.layoutY = 90
      area.prefHeight = 200
      area.prefWidth = 400
      area.promptText = "What does the fox say?"

      val password = new PasswordField
      password.layoutX = 25
      password.layoutY = 300
      password.promptText = "Type your password here!"

      content = label :: text :: area :: password :: Nil

      text.onAction = (e:ActionEvent) => {
        label.text = "You can see what i type in text field: %s".format(text.text.apply)
      }

      area.text.onChange {
        label.text = "You can see what i type in text area: %s".format(area.text.apply)
      }

      password.focused.onChange {
        label.text = "LOL! You can see what i type in password area: %s".format(password.text.apply)
      }
    }
  }
}
