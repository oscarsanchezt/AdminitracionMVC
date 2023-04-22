package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class Vista {

    private JFrame frame;
    private JScrollPane scrollPane;
    private JPanel content;
    private JButton btnNewButton;
    private DefaultListModel<String> listModel;
    private JPanel panel;
    private JSeparator separator;
    private JSeparator separator_1;
    private JPanel panel_1;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;

    public Vista() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(1, 12, 120));
        frame.setBackground(new Color(26, 95, 180));
        frame.setBounds(100, 100, 745, 464);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        // PANEL DERECHA
        content = new JPanel();
        content.setBackground(new Color(53, 132, 228));
        content.setBounds(257, 0, 488, 437);
        frame.getContentPane().add(content);
        
        listModel = new DefaultListModel<String>();
        
        panel = new JPanel();
        panel.setBackground(new Color(26, 95, 180));
        panel.setBounds(66, 0, 189, 437);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        // BOTON AÑADIR USUARIO
        btnNewButton = new JButton("Añadir");
        btnNewButton.setBounds(53, 159, 78, 28);
        panel.add(btnNewButton);
        btnNewButton.setFont(new Font("Dialog", Font.BOLD, 13));
        btnNewButton.setForeground(new Color(156, 246, 255));
        btnNewButton.setBackground(new Color(53, 132, 228));
        btnNewButton.setBorderPainted(false);
        // PANEL + LISTA DE USUARIOS
        scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 240, 172, 185);
        panel.add(scrollPane);
        scrollPane.setViewportBorder(new LineBorder(new Color(1, 12, 120)));
        JList<String> list = new JList<>(listModel);
        scrollPane.setViewportView(list);
        list.setFont(new Font("Dialog", Font.BOLD, 15));
        list.setForeground(new Color(156, 246, 255));
        list.setBackground(new Color(53, 132, 228));
        
        separator = new JSeparator();
        separator.setBackground(new Color(156, 246, 255));
        separator.setBounds(12, 211, 172, 10);
        panel.add(separator);
        
        separator_1 = new JSeparator();
        separator_1.setBackground(new Color(156, 246, 255));
        separator_1.setBounds(12, 103, 172, 10);
        panel.add(separator_1);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Vista.class.getResource("/IMAGENES/icons8-cambiar-usuario-masculino-80.png")));
        lblNewLabel.setBounds(53, 12, 93, 79);
        panel.add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("Añadir Nuevo Usuario");
        lblNewLabel_1.setForeground(new Color(156, 246, 255));
        lblNewLabel_1.setBackground(new Color(156, 246, 255));
        lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
        lblNewLabel_1.setBounds(12, 113, 172, 32);
        panel.add(lblNewLabel_1);
        
        panel_1 = new JPanel();
        panel_1.setBackground(new Color(1, 12, 120));
        panel_1.setBounds(0, 0, 67, 437);
        frame.getContentPane().add(panel_1);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                page1 p1 = new page1(listModel);
                p1.setSize(488, 437);
                p1.setLocation(0, 0);
                content.removeAll();
                content.setLayout(new BorderLayout()); // establecer el diseño en BorderLayout
                content.add(p1, BorderLayout.CENTER);
                content.setPreferredSize(new Dimension(488, 500)); // aumentar la altura del panel content
                content.revalidate();
                content.repaint();
            }
        });

    }
    public void show() {
        frame.setVisible(true);
    }
}

