package br.com.curso.mb;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class Item {
        public SimpleLongProperty id = new SimpleLongProperty();
        public SimpleStringProperty name = new SimpleStringProperty();
        public SimpleIntegerProperty qty = new SimpleIntegerProperty();
        public SimpleStringProperty price = new SimpleStringProperty();
         
        public Long getId() {
            return id.get();
        }
 
        public String getName() {
            return name.get();
        }
 
        public String getPrice() {
            return price.get();
        }
 
        public Integer getQty() {
            return qty.get();
        }
    }