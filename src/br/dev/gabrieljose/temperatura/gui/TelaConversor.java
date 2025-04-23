package br.dev.gabrieljose.temperatura.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelReseultado;
	private JLabel labelMensagemErro;
	private String telaNome;
	
	public void criarTelaConversor(String telaNome) {
		this.telaNome = telaNome;
		JFrame tela = new JFrame();
		tela.setTitle(telaNome);
		tela.setSize(600,500);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		Container container = tela.getContentPane();
		
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus Celsius:");
		labelCelsius.setBounds(20, 30, 190, 20);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(20, 60, 550, 40);
		
		
		container.add(labelCelsius);
		container.add(textCelsius);
		
		
		
		tela.setVisible(true);
	}
	
	
}
