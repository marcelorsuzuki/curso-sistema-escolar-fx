package br.com.curso.mb;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController implements Initializable {
     
    
 
    // The table and columns
    @FXML
    TableView<Item> itemTbl;
 
    @FXML
    TableColumn<Item,Long> itemIdCol;
    @FXML
    TableColumn<Item,String> itemNameCol;
    @FXML
    TableColumn<Item,Integer> itemQtyCol;
    @FXML
    TableColumn<Item,String> itemPriceCol;
 
    // The table's data
    ObservableList<Item> data;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set up the table data
        itemIdCol.setCellValueFactory(new PropertyValueFactory<Item,Long>("id"));
        itemNameCol.setCellValueFactory(new PropertyValueFactory<Item,String>("name"));
        itemQtyCol.setCellValueFactory(new PropertyValueFactory<Item,Integer>("qty"));
        itemPriceCol.setCellValueFactory(new PropertyValueFactory<Item,String>("price"));
 
        data = FXCollections.observableArrayList();
        itemTbl.setItems(data);
    }    
 
    static long nextId = 1;
     
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Item item = new Item();
        item.id.setValue(nextId++);
        item.name.setValue("Item Number " + item.id.getValue());
        item.qty.setValue(10);
        Float price = new Float(5.00 + (float)item.id.getValue());
        item.price.setValue( price.toString() );
        data.add(item);
    }
}