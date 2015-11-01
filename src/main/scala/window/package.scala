import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.event._
import scalafx.scene.Scene
import scalafx.scene.control._
// add following package and event handler will be work nicer
import scalafx.Includes._

/**
 * Created by alexfranz
 */
package object ScalaFxWindow extends JFXApp{

  stage = new PrimaryStage {
    title = "ScalaFX GUI Application"
    scene = new Scene(450,350) {
      val button = new Button("Remove me!")
      button.layoutX = 100
      button.layoutY = 50

      val comboBox = new ComboBox[String](List("Home","About","Contact"))
      comboBox.layoutX = 200
      comboBox.layoutY = 50

      val listView = new ListView[String](List("Item 1", "Item 2", "Item 3", "Item 4"))
      listView.layoutX = 100
      listView.layoutY = 100
      listView.prefHeight = 150

      // this is how to add all those things to scene
      content = List(button,comboBox,listView)

      // event handler
      button.onAction = (e:ActionEvent) => {
        val selected = listView.selectionModel.apply.getSelectedItems
        selected.foreach(e => println("%s was removed!".format(e)))
        listView.items = listView.items.apply.diff(selected)
      }

      comboBox.onAction = (e:ActionEvent) => {
        val selected = comboBox.selectionModel.apply.getSelectedItem
        println("%s was added!".format(selected))
        listView.items.apply += selected
      }
    }
  }
}
