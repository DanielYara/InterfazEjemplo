/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

/**
 *
 * @author fabian.giraldo
 */
public class View  extends JFrame{
    //Cada vista tiene su controlador.
    private Controller controller;
    
    //Variables de la vista.
    private JTextField field ;
    private JCheckBox check1 ;
    private JCheckBox check2 ;
    private JCheckBox check3 ;
    
       
    private JRadioButton radio1;
    private JRadioButton radio2 ;
    private JRadioButton radio3 ;
    
    private  JComboBox combo1;
    private JPasswordField passwordField ;
    private JSlider slider ;
    
        
    private  JButton button;
    
    public View(Controller controller){
       this.controller = controller;
       this.controller.setView(this);
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       setSize(new Dimension(200, 200));
       setTitle("Test Componentes");
   
       JLabel label = new JLabel("Type your ZIP code: ");
       this.field = new JTextField(5);
       
       this.check1 = new JCheckBox("A");
       this.check2 = new JCheckBox("B");
       this.check3 = new JCheckBox("C");
       
       this.radio1 = new JRadioButton("A");
       this.radio2 = new JRadioButton("B");
       this.radio3 = new JRadioButton("C");
       
       
       ButtonGroup buttonGroup = new ButtonGroup();
       buttonGroup.add(radio1);
       buttonGroup.add(radio2);
       buttonGroup.add(radio3);
          
       this.combo1=new JComboBox();
       combo1.setBounds(10,10,80,20);
       combo1.addItem("rojo");
       combo1.addItem("vede");
       combo1.addItem("azul");
       combo1.addItem("amarillo");
       combo1.addItem("negro");
      
       this.passwordField = new JPasswordField(20);
       
       int minimum = -255;
       int maximum = 256;
       this.slider = new JSlider(minimum, maximum);
     
       JLabel jLabelObject = new JLabel();
      // jLabelObject.setPreferredSize(new Dimension(100,100));
       jLabelObject.setIcon(new ImageIcon("facebook.jpg"));
       jLabelObject.addMouseListener(new ControllerMouse());


        //ToolBar
       
       JToolBar toolbar = new JToolBar("Applications");

        JButton btnCalendar = new JButton(new ImageIcon("at.gif"));
        btnCalendar .setMargin(new Insets(0, 0, 0, 0));
        btnCalendar.setToolTipText("Add a new file");

        btnCalendar.setActionCommand("btnCalendar");
        btnCalendar.addActionListener(this.controller);

        JButton btnClock = new JButton(new ImageIcon("at.gif"));
        btnClock.setActionCommand("btnClock");
        btnClock.addActionListener(this.controller);

        JButton btnContacts = new JButton(new ImageIcon("at.gif"));
        btnContacts.setActionCommand("btnContacts");
        btnContacts.addActionListener(this.controller);

       
        toolbar.add(btnCalendar);
        toolbar.add(btnClock);
        toolbar.add(btnContacts);
       
        
        
       this.button = new JButton("Submit");
       // setLayout(new FlowLayout());
       
       Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
        { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
       Object columnNames[] = { "Column One", "Column Two", "Column Three" };
       JTable table = new JTable(rowData, columnNames);
       JScrollPane scrollPane = new JScrollPane(table);
       scrollPane.setPreferredSize(new Dimension(100,100));
       
       //Que pasa si uso otros Layout
       BoxLayout boxLayout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS); // top to bottom
       setLayout(boxLayout);
      
       add(toolbar);
       add(label);
       add(this.field);
       add(this.check1);
       add(this.check2);
       add(this.check3);
       add(this.radio1);
       add(this.radio2);
       add(this.radio3);
       add(this.combo1);
       add(this.passwordField);
       add(this.slider);
       add(jLabelObject);
       add(scrollPane);
       add(this.button); 
      
       button.addActionListener(controller);
  
       
       //Menu
       JMenuBar menuBar = new JMenuBar();

       // File Menu, F - Mnemonic
       JMenu fileMenu = new JMenu("File");
       fileMenu.setMnemonic(KeyEvent.VK_F);    
       // File->New, N - Mnemonic
       JMenuItem newMenuItem = new JMenuItem("New");
         
      
       KeyStroke ctrlP = KeyStroke.getKeyStroke(KeyEvent.VK_P,
        InputEvent.CTRL_MASK);
       newMenuItem.setAccelerator(ctrlP);
    
       Icon atIcon = new ImageIcon("at.gif");
       newMenuItem.setIcon(atIcon);
       newMenuItem.addActionListener(this.controller);
       
       fileMenu.add(newMenuItem);
       
       menuBar.add(fileMenu);
       setJMenuBar(menuBar);
    
      
       // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

       // Determine the new location of the window
       int w = this.getSize().width;
       int h = this.getSize().height;
       int x = (dim.width-w)/2;
       int y = (dim.height-h)/2;

        // Move the window
       this.setLocation(x, y);
        
       pack();
       setVisible(true);
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public JTextField getField() {
        return field;
    }

    public void setField(JTextField field) {
        this.field = field;
    }

    public JCheckBox getCheck1() {
        return check1;
    }

    public void setCheck1(JCheckBox check1) {
        this.check1 = check1;
    }

    public JCheckBox getCheck2() {
        return check2;
    }

    public void setCheck2(JCheckBox check2) {
        this.check2 = check2;
    }

    public JCheckBox getCheck3() {
        return check3;
    }

    public void setCheck3(JCheckBox check3) {
        this.check3 = check3;
    }

    public JRadioButton getRadio1() {
        return radio1;
    }

    public void setRadio1(JRadioButton radio1) {
        this.radio1 = radio1;
    }

    public JRadioButton getRadio2() {
        return radio2;
    }

    public void setRadio2(JRadioButton radio2) {
        this.radio2 = radio2;
    }

    public JRadioButton getRadio3() {
        return radio3;
    }

    public void setRadio3(JRadioButton radio3) {
        this.radio3 = radio3;
    }

    public JComboBox getCombo1() {
        return combo1;
    }

    public void setCombo1(JComboBox combo1) {
        this.combo1 = combo1;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JSlider getSlider() {
        return slider;
    }

    public void setSlider(JSlider slider) {
        this.slider = slider;
    }
    
    
    
}
