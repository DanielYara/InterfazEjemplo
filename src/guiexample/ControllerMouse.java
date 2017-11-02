/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Isabel-Fabian
 */
public class ControllerMouse extends MouseAdapter {
    @Override
            public void mouseClicked(MouseEvent e) 
            {
              Point me = e.getPoint();
              
                
              System.out.println("Click sobre la imagen" + me.x + "- " + me.y);       
            }
}
