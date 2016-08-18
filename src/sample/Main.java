package sample;

import controllers.MainController;
import interfaces.impls.CollectionAddressBook;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import objects.Person;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../fxml/main.fxml"));

        Parent fxmlMain=fxmlLoader.load();
        MainController mainController=fxmlLoader.getController();
        mainController.setMainStage(primaryStage);

        primaryStage.setTitle("Адрессная книга");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(fxmlMain, 300, 275));
        primaryStage.show();
    }


    private void testData(){
        CollectionAddressBook addressBook=new CollectionAddressBook();
        addressBook.fillTestData();
        addressBook.print();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
