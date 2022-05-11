import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

public class CurrencyConversionFrame extends JFrame {
    JLabel labelTitle, labelFrom, labelTo;
    JButton convertButton, exitButton;
    String[] currency = {"Rupiah", "Euro", "US Dollar"};
    HashMap<String, Integer> kurs = new HashMap<String, Integer>();

    public CurrencyConversionFrame() {
        kurs.put("Rupiah", 1);
        kurs.put("Euro", 15000);
        kurs.put("US Dollar", 14000);

        // TO DO: Menentukan layout dan size yang ingin digunakan 
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setTitle("Currency Converter");

        // TO DO: Membuat Panel sesuai kebutuhan

        
        labelTitle = new JLabel();
        labelTitle.setText("Welcome to Currency Converter");

        // TO DO: Membuat dropdown menu


        labelFrom = new JLabel("From");
        labelTo = new JLabel("To");
                
        // TO DO: Membuat textfield 


        convertButton = new JButton("Convert");
        exitButton = new JButton("Exit");
        


        // TO DO: Masukkan widget ke panel yang tepat


        add(labelTitle);
        // TO DO: Masukkan panel ke dalam frame


        setVisible(true);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // TO DO: implementasikan pemanggilan method ConvertCurrency
        
                
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // TO DO: hentikan eksekusi program

            }
        });
    }
    
    // Method converter
    public String ConvertCurrency(String originalValue, String tipeCurrencyFrom, String tipeCurrencyTo) {
        double value = Double.valueOf(originalValue);
        double fromValue = value * kurs.get(tipeCurrencyFrom);
        double convertedValue = fromValue / kurs.get(tipeCurrencyTo);
        return String.format("%.2f", convertedValue);
    }
    
}
