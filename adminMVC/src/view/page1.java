package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class page1 extends JPanel {
	private JTextField textFieldNombre;
	private DefaultListModel<String> listModel;

	public page1(DefaultListModel<String> listModel) {
		this.listModel = listModel;
		setBorder(null);
		setForeground(new Color(153, 193, 241));
		setBackground(new Color(98, 160, 234));
		setLayout(null);
		// USUARIO
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(101, 148, 248, 27);
		add(textFieldNombre);
		textFieldNombre.setBackground(new Color(153, 193, 241));
		textFieldNombre.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(201, 229, 90, 30);
		add(btnNewButton);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(53, 132, 228));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(0, 1, 56));

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textFieldNombre.getText();
				listModel.addElement(nombre); // Agregar el nombre ingresado al modelo de datos
				setVisible(false);
			}
		});
	}
}
