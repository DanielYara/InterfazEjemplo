/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

/**
 * Clase que simula una clase del modelo.
 * @author fabian.giraldo
 */
public class Model {
    
    private String text;
    private String[] cOptions;
    private int rOption;
    private String cBox;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getcOptions() {
        return cOptions;
    }

    public void setcOptions(String[] cOptions) {
        this.cOptions = cOptions;
    }

    public int getrOption() {
        return rOption;
    }

    public void setrOption(int rOption) {
        this.rOption = rOption;
    }

    public String getcBox() {
        return cBox;
    }

    public void setcBox(String cBox) {
        this.cBox = cBox;
    }
    
    
}
