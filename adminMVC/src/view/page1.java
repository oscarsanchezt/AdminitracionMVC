package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class page1 extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private DefaultListModel<String> listModel;
	private JTextField textField;
	private JPasswordField passwordField;

	public page1(DefaultListModel<String> listModel) {
		this.listModel = listModel;
		setBorder(null);
		setForeground(new Color(153, 193, 241));
		setBackground(new Color(98, 160, 234));
		setLayout(null);
		// USUARIO
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(164, 177, 248, 27);
		add(textFieldNombre);
		textFieldNombre.setBackground(new Color(153, 193, 241));
		textFieldNombre.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(26, 95, 180));
		panel.setBounds(0, 385, 488, 53);
		add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setSelectedIcon(new ImageIcon(page1.class.getResource("/IMAGENES/save.png")));
		btnNewButton.setBounds(383, 12, 93, 30);
		panel.add(btnNewButton);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(53, 132, 228));
		btnNewButton.setForeground(new Color(0, 1, 56));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(new Color(0, 1, 56));
		btnCancelar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCancelar.setBackground(new Color(53, 132, 228));
		btnCancelar.setBounds(288, 12, 93, 30);
		btnCancelar.setBorderPainted(false);
		panel.add(btnCancelar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(new Color(153, 193, 241));
		textField.setBounds(164, 283, 248, 27);
		add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBackground(new Color(153, 193, 241));
		passwordField.setBounds(164, 230, 248, 27);
		add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(153, 193, 241));
		separator.setBounds(12, 152, 445, 13);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(153, 193, 241));
		separator_1.setBounds(12, 349, 445, 13);
		add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(page1.class.getResource("/IMAGENES/nuevouser.png")));
		lblNewLabel_1.setBounds(209, 9, 91, 92);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("REGISTRO DE NUEVO USUARIO");
		lblNewLabel_2.setForeground(new Color(156, 246, 255));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBackground(new Color(156, 246, 255));
		lblNewLabel_2.setBounds(111, 113, 332, 27);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(page1.class.getResource("/IMAGENES/user.png")));
		lblNewLabel.setBackground(new Color(153, 193, 241));
		lblNewLabel.setBounds(111, 174, 47, 40);
		add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(page1.class.getResource("/IMAGENES/pass.png")));
		lblNewLabel_3.setBounds(111, 226, 47, 40);
		add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(page1.class.getResource("/IMAGENES/telefono.png")));
		label.setBounds(111, 280, 47, 40);
		add(label);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textFieldNombre.getText();
				String telefono = textField.getText();
				listModel.addElement(nombre); // Agregar el nombre ingresado al modelo de datos
				setVisible(false);
			}
		});
	}
}
