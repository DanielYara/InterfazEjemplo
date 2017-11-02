/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que simula una clase Controlador
 * @author fabian.giraldo
 */
public class Controller implements ActionListener{
    private View view;
    private Model model;
    
    public Controller (){
       //El controlador conoce su modelo 
      this.model = new Model();
    }    
    
    public void setView(View view ){
      this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if(e.getActionCommand().equals("New")){
            System.out.println("Menu");
        }else{
             System.out.println("Capturando la informacion");
             String text = this.view.getField().getText();
             boolean check1 = this.view.getCheck1().isSelected();
             boolean check2 = this.view.getCheck1().isSelected();
             boolean check3= this.view.getCheck1().isSelected();

             boolean radio1 = this.view.getRadio1().isSelected();
             boolean radio2 = this.view.getRadio2().isSelected();
             boolean radio3= this.view.getRadio3().isSelected();

             int itemCombo = this.view.getCombo1().getSelectedIndex();
             String itemComboText =  (String) this.view.getCombo1().getSelectedItem();

             int value = this.view.getSlider().getValue();

             this.model.setText(text);
             //..Aca se capturan los demas.
             //Dependiendo lo que se quiera hacer se puede redireccionar a un servicio o a otra vista.

             //Esta impresion se hace solo por demostracion pero de mostrar la informacion solo se encargan las vistas. OJO
             //pronto esto debe desaparecer.
             System.out.println(text);
             System.out.println(itemComboText);
             System.out.println(value);
             //..

        }
        
        
    }
    
}
