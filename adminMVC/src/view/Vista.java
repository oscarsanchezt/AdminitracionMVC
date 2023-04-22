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

public class Vista {

    private JFrame frame;
    private JScrollPane scrollPane;
    private JPanel content;
    private JButton btnNewButton;
    private DefaultListModel<String> listModel;

    public Vista() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBackground(new Color(26, 95, 180));
        frame.setBounds(100, 100, 745, 464);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        // PANEL DERECHA
        content = new JPanel();
        content.setBackground(new Color(53, 132, 228));
        content.setBounds(257, 0, 488, 437);
        frame.getContentPane().add(content);
        // BOTON AÑADIR USUARIO
        btnNewButton = new JButton("Añadir");
        btnNewButton.setBounds(82, 134, 81, 21);
        frame.getContentPane().add(btnNewButton);
        btnNewButton.setFont(new Font("Dialog", Font.BOLD, 13));
        btnNewButton.setForeground(new Color(156, 246, 255));
        btnNewButton.setBackground(new Color(53, 132, 228));
        btnNewButton.setBorderPainted(false);
        // PANEL + LISTA DE USUARIOS
        scrollPane = new JScrollPane();
        scrollPane.setBounds(44, 187, 172, 185);
        frame.getContentPane().add(scrollPane);
        scrollPane.setViewportBorder(null);
        
        listModel = new DefaultListModel<String>();
        JList<String> list = new JList<>(listModel);
        list.setFont(new Font("Dialog", Font.BOLD, 15));
        list.setForeground(new Color(156, 246, 255));
        list.setBackground(new Color(53, 132, 228));
        list.setBorder(null);
        scrollPane.setViewportView(list);
        
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

