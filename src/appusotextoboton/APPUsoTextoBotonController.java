/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusotextoboton;

import componentes_blancaadrian.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author usuario
 */
public class APPUsoTextoBotonController implements Initializable {
    
    @FXML
    private Label mensaje;
    @FXML
    private CampoTextoBoton campoArriba;
    @FXML
    private CampoTextoBoton campoAbajo;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mensaje.setText("Pulsa botón y muestra texto en esta etiqueta");
        
        campoArriba.setOnAction(event -> {
            mensaje.setText("Se ha grabado: " + campoArriba.getText());
        
        });
        
        campoAbajo.setOnAction(event -> {
            mensaje.setText("Se ha grabado: " + campoAbajo.getText());
        
        });
        
    }    
    
}
