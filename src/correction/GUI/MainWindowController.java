package correction.GUI;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import POJOs.traektory;
import static correction.frame.frame;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MainWindowController {
    public static ObservableList<traektory> frameList = FXCollections.observableArrayList();
    
    @FXML
    public AnchorPane mainPane;

    @FXML
    private Button butOpenFile;

    @FXML
    private Button butSaveFile;

    @FXML
    private Button butExit;

    @FXML
    private Pane drawingPane;

    @FXML
    private TableView<traektory> gCodeTable;

    @FXML
    private TableColumn<traektory, Integer> frameNum;

    @FXML
    private TableColumn<traektory, Integer> gType;

    @FXML
    private TableColumn<traektory, Integer> xStart;

    @FXML
    private TableColumn<traektory, Integer> yStart;

    @FXML
    private TableColumn<traektory, Integer> xEnd;

    @FXML
    private TableColumn<traektory, Integer> yEnd;

    @FXML
    private TableColumn<traektory, Integer> feed;

    @FXML
    private TableColumn<traektory, Integer> rad;

    @FXML
    private Button butDraw;
    
    
    @FXML
    public void initialize() {
        initData();
        frameNum.setCellValueFactory(new PropertyValueFactory<>("id"));
        xStart.setCellValueFactory(new PropertyValueFactory<>("xs"));
        gType.setCellValueFactory(new PropertyValueFactory<>("gt"));
        xEnd.setCellValueFactory(new PropertyValueFactory<>("xe"));
        yStart.setCellValueFactory(new PropertyValueFactory<>("ys"));
        yEnd.setCellValueFactory(new PropertyValueFactory<>("ye"));
        rad.setCellValueFactory(new PropertyValueFactory<>("r"));
        feed.setCellValueFactory(new PropertyValueFactory<>("feed"));
        
        gCodeTable.setItems(frameList);
        draw();
    }
//инициализация данных.
    private void initData() {
        frame("G01 X100 Y100 X200 Y500 E");
        frame("G03 X500 Y200 X00 Y600 E");
        frame("G02 X10 Y30 X50 Y100 E");
        frame("G01 X00 Y40 X30 Y500 E");
    }
    //отрисовка массива
    private void draw(){
        for(int i = 0; i < frameList.size(); i++){
            int xs = frameList.get(i).getXs();
            int xe = frameList.get(i).getXe();
            int ys = frameList.get(i).getYs();
            int ye = frameList.get(i).getYe();
            Line frameLine = new Line(xs, ys, xe, ye);
            frameLine.setStroke(Color.BLACK);
            frameLine.setVisible(true);
            drawingPane.getChildren().addAll(frameLine);
        }
    }

    

}
