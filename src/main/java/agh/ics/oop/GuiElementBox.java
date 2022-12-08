package agh.ics.oop;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GuiElementBox {
    protected VBox vertical;
    public GuiElementBox(IMapElement element) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(element.source));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(20);
        imageView.setFitHeight(20);
        Label label = new Label((element.position).toString());
        vertical= new VBox(imageView);
        vertical.getChildren().addAll(label);
        vertical.setAlignment(Pos.CENTER);
    }

}
