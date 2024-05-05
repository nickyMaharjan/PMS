/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import javax.swing.JOptionPane;
import dao.PharmacyUtils;
import java.io.File;
/**
 *
 * @author DELL
 */
public class OpenPdf {
    public static void openById(String id){
        try {
            String filePath= PharmacyUtils.billPath+id+".pdf";
            if(new File(filePath).exists()){
                Process p= Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler "+filePath);
            }else{
              JOptionPane.showMessageDialog(null, "File does not exists.");  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
