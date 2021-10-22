package com.mycompany.poly.app.helper;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class DataValidator {
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMasesage){
        if(field.getText().equals("")){
            sb.append(errorMasesage).append(("\n"));
            field.setBackground(Color.red);
            field.requestFocus();
        }
        else{
            field.setBackground(Color.white);
        }
    }
    public static void validateEmpty(JPasswordField field, StringBuilder sb, String errorMasesage){
            
        String password = new String(field.getPassword());
        if(password.equals("")){
            sb.append(errorMasesage).append(("\n"));
            field.setBackground(Color.red);
            field.requestFocus();
        }
        else{
            field.setBackground(Color.white);
        }
    }   
   
}
