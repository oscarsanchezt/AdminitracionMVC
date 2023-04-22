package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.List;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JSeparator;

public class Vista {

    private JFrame frame;

    public Vista() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBackground(new Color(26, 95, 180));
        frame.setBounds(100, 100, 745, 464);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
//		PANEL VERTICAL CENTRAL
        JPanel panel = new JPanel();
        panel.setBackground(new Color(26, 95, 180));
        panel.setBounds(62, 0, 196, 437);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
//		BOTON AÑADIR USUARIO
        JButton btnNewButton = new JButton("Añadir");
        btnNewButton.setFont(new Font("Dialog", Font.BOLD, 13));
        btnNewButton.setForeground(new Color(156, 246, 255));
        btnNewButton.setBackground(new Color(53, 132, 228));
        btnNewButton.setBounds(52, 160, 81, 21);
        panel.add(btnNewButton);
//		PANEL + LISTA DE USUARIOS
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportBorder(null);
        scrollPane.setBounds(12, 240, 172, 185);
        panel.add(scrollPane);
        
        JList list = new JList();
        list.setFont(new Font("Dialog", Font.BOLD, 15));
        list.setModel(new AbstractListModel() {
        	String[] values = new String[] {};
        	public int getSize() {
        		return values.length;
        	}
        	public Object getElementAt(int index) {
        		return values[index];
        	}
        });
        list.setForeground(new Color(156, 246, 255));
        list.setBackground(new Color(53, 132, 228));
        list.setBorder(null);
        scrollPane.setViewportView(list);
        
        JSeparator separator = new JSeparator();
        separator.setBackground(new Color(53, 132, 228));
        separator.setBounds(12, 205, 172, 13);
        panel.add(separator);
        
        JLabel lblNewLabel = new JLabel("Añadir Nuevo ");
        lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
        lblNewLabel.setForeground(new Color(156, 246, 255));
        lblNewLabel.setBounds(43, 102, 108, 17);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Usuario");
        lblNewLabel_1.setForeground(new Color(156, 246, 255));
        lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
        lblNewLabel_1.setBounds(65, 121, 60, 17);
        panel.add(lblNewLabel_1);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBackground(new Color(53, 132, 228));
        separator_1.setBounds(12, 81, 172, 13);
        panel.add(separator_1);
        
        JLabel lblNewLabel_2 = new JLabel("USUARIOS");
        lblNewLabel_2.setForeground(new Color(156, 246, 255));
        lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 13));
        lblNewLabel_2.setBounds(64, 216, 69, 17);
        panel.add(lblNewLabel_2);
        
//      PANEL VERTICAL IZQUIERDA
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(29, 41, 135));
        panel_1.setBounds(0, 0, 62, 437);
        frame.getContentPane().add(panel_1);
//		PANEL DERECHA
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(53, 132, 228));
        panel_2.setBounds(257, 0, 488, 437);
        frame.getContentPane().add(panel_2);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
    }

    public void show() {
        frame.setVisible(true);
    }
}
