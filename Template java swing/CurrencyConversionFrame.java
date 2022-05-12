import java.awt.Font;
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
        // insert panel to frame
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(300, 300);
        // set background color to lightblue
        setBackground(new java.awt.Color(0, 191, 255));
        // set font to poppins
        setFont(new Font("Poppins", Font.PLAIN, 20));
        // set

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Currency Converter");

        // TO DO: Membuat Panel sesuai kebutuhan


        labelTitle = new JLabel();
        labelTitle.setText("Welcome to Currency Converter");
        // make the text bigger and center horizontally but not vertically
        labelTitle.setFont(labelTitle.getFont().deriveFont(20.0f));
        labelTitle.setHorizontalAlignment(JLabel.CENTER);



        // TO DO: Membuat dropdown menu


        labelFrom = new JLabel("From");
        labelFrom.setText("From");
        // make the text bigger and center horizontally but not vertically
        labelFrom.setFont(labelFrom.getFont().deriveFont(12.0f));

        // create a dropdown menu
        JComboBox<String> from = new JComboBox<String>(currency);
        // design the dropdown menu
        from.setFont(from.getFont().deriveFont(12.0f));
        from.setPreferredSize(new java.awt.Dimension(100, 30));

        // create a text box
        JTextField fromAmount = new JTextField(10);
        // add a padding to the text box
        fromAmount.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        // set the default value
        from.setSelectedItem("Rupiah");
        fromAmount.setText("");

        labelTo = new JLabel("To");
        // make the text bigger and center horizontally but not vertically
        labelTo.setFont(labelTo.getFont().deriveFont(12.0f));
        // create a dropdown menu
        JComboBox<String> to = new JComboBox<String>(currency);
        // design the dropdown menu
        from.setFont(from.getFont().deriveFont(12.0f));
        from.setPreferredSize(new java.awt.Dimension(100, 30));
        // create a text box
        JTextField toAmount = new JTextField(10);
        toAmount.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        // set the default value
        to.setSelectedItem("US Dollar");
        toAmount.setText("");
        // set above to label form
        labelFrom.setLabelFor(from);


        // TO DO: Membuat textfield

        convertButton = new JButton("Convert");
        exitButton = new JButton("Exit");
        // make the button appear in the center of the frame
        convertButton.setBounds(100, 100, 100, 30);
        exitButton.setBounds(100, 150, 100, 30);
        // set text
        convertButton.setText("Convert");
        exitButton.setText("Exit");
        // make both button appear in the same line
        convertButton.setAlignmentX(JButton.CENTER_ALIGNMENT);



        // TO DO: Masukkan widget ke panel yang tepat
        // create a panel for each widget
        JPanel panelTitle = new JPanel();
        JPanel panelFrom = new JPanel();
        JPanel panelTo = new JPanel();
        JPanel panelButton = new JPanel();
        // add widget to panel
        panelTitle.add(labelTitle);
        panelFrom.add(labelFrom);
        panelFrom.add(from);
        panelFrom.add(fromAmount);
        panelTo.add(labelTo);
        panelTo.add(to);
        panelTo.add(toAmount);
        panelButton.add(convertButton);
        panelButton.add(exitButton);
        // add panel to frame
        add(panelTitle);
        add(panelFrom);
        add(panelTo);
        add(panelButton);


        // TO DO: Masukkan panel ke dalam frame

        setVisible(true);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // run method ConvertCurrency with parameter fromAmount.getText() and
                // get selected item from dropdown menu from

                // set the value of toAmount to the result of ConvertCurrency
                toAmount.setText(String.valueOf(ConvertCurrency(fromAmount.getText(),
                        from.getSelectedItem().toString(), to.getSelectedItem().toString())));
            };
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // close the frame
                dispose();
            }
        });
    }

    // Method converter
    public String ConvertCurrency(String originalValue, String tipeCurrencyFrom,
            String tipeCurrencyTo) {
        double value = Double.valueOf(originalValue);
        double fromValue = value * kurs.get(tipeCurrencyFrom);
        double convertedValue = fromValue / kurs.get(tipeCurrencyTo);
        return String.format("%.2f", convertedValue);
    }

    public static void main(String[] args) {
        new CurrencyConversionFrame();
    }

}
