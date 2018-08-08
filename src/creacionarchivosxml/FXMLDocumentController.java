/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivosxml;

import java.awt.TextField;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author sebastian.reina_bal
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label ltitulo;
    @FXML
    private Label lnombre;
    @FXML
    private Label ldireccion;
     @FXML
     private Label lempleado;
     @FXML
     private Label lcodigoempleado;
     @FXML
     private Label ldepartamento;
     @FXML
    private TextField nombret;
      @FXML
    private TextField direcciont;
      @FXML
    private TextField edadt;
      @FXML
    private TextField codigoempleado;
      @FXML
    private TextField departamentot;
    
      
    LinkedList<Empleado> listaEmpleados;
    
    
    @FXML
    private void agregarempleado(ActionEvent event) {
       listaEmpleados.add new (listaEmpleados);
      
               
                            
               }    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
