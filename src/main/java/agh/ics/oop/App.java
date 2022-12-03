package agh.ics.oop;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;


public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        String[] arguments = {"f", "b", "r", "l", "f", "f", "r", "r", "f", "f", "f", "f", "f", "f", "f", "f","b","f","b","b","b"};
        MoveDirection[] directions = new OptionParser().parse(arguments);
        IWorldMap map = new GrassField(10);
        Vector2d[] positions = {new Vector2d(2, 2), new Vector2d(3, 4),new Vector2d(5,5)};
        IEngine engine = new SimulationEngine(directions, map, positions);
        engine.run();
        System.out.println(map);

        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);
        gridPane.getColumnConstraints().add(new ColumnConstraints(20));
        gridPane.getRowConstraints().add(new RowConstraints(20));
        for(int i=0;i<=map.boundaries.height-map.boundaries.lowerendy;i++){
            Label label=new Label(Integer.toString(map.boundaries.lowerendy+i));
            gridPane.add(label,0,map.boundaries.height-map.boundaries.lowerendy-i+1,1,1);
        }
        for (int i=0; i<=map.boundaries.width-map.boundaries.lowerendx;i++){
            System.out.println(i);
            gridPane.getColumnConstraints().add(new ColumnConstraints(20));
            Label label=new Label(Integer.toString(map.boundaries.lowerendx+i));
            gridPane.add(label,i+1,0,1,1);
            GridPane.setHalignment(label, HPos.CENTER);

            for(int j=0;j<=map.boundaries.height-map.boundaries.lowerendy;j++){
                if (map.isOccupied(new Vector2d(map.boundaries.lowerendx+i,map.boundaries.lowerendy+j))) {
                    label = new Label(map.objectAt(new Vector2d(map.boundaries.lowerendx+i, map.boundaries.lowerendy+j)).toString());
                    gridPane.add(label, i+1, map.boundaries.height-map.boundaries.lowerendy-j+1, 1, 1);
                    GridPane.setHalignment(label, HPos.CENTER);
                }
            }

        }


        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch();
    }
}
