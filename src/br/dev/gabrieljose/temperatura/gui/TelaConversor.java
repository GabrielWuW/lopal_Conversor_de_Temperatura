package br.dev.gabrieljose.temperatura.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.StyledEditorKit.FontSizeAction;

import br.dev.gabrieljose.temperatura.model.Temperatura;

public class TelaConversor {
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	private String telaNome;
	private Font fonte;
	
	public void criarTelaConversor(String telaNome) {
		this.telaNome = telaNome;
		JFrame tela = new JFrame();
		tela.setTitle(telaNome);
		tela.setSize(600,500);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		fonte = new Font("Comic sans ms", Font.PLAIN, 18);
		
		Temperatura temperatura = new Temperatura();
		
		
		
		Container container = tela.getContentPane();
		
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus Celsius:");
		labelCelsius.setFont(new Font("Comic sans ms", Font.PLAIN, 20)); 
		labelCelsius.setBounds(168, 30, 300, 30);
		
		textCelsius = new JTextField();
		textCelsius.setFont(fonte); 
		textCelsius.setBounds(20, 60, 550, 50);

		
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setFont(fonte);
		buttonFahreinheit.setText("Fahrenheit");
		buttonFahreinheit.setBounds(20, 150, 250, 50);
		
		labelResultado = new JLabel();
		labelResultado.setFont(new Font("Comic sans ms", Font.PLAIN, 25)); 
		labelResultado.setText("");
		labelResultado.setBounds(0, 230, 600, 50);
		labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(labelResultado);
		
		buttonFahreinheit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int celcius = Integer.parseInt(textCelsius.getText());
					temperatura.setCelsius(celcius);
					
					if(celcius == 5499) {
						labelResultado.setText("O poder do sol na palma da minha mão...");
						labelMensagemErro.setVisible(false);
						container.repaint();
					} else {
						labelResultado.setText(temperatura.converterParaFahreinhet() + " FAHREINHEIT");
						labelMensagemErro.setVisible(false);
						container.repaint();
					}
					
				} catch (NumberFormatException ex) {
					labelMensagemErro.setVisible(true);
					labelResultado.setText("");
					container.repaint();
				}
				
			}
		});
		
		
		
		buttonKelvin = new JButton();
		buttonKelvin.setFont(fonte);
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(320, 150, 250, 50);
		
		buttonKelvin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int celcius = Integer.parseInt(textCelsius.getText());
					temperatura.setCelsius(celcius);
					
					if(celcius == 5499) {
						labelResultado.setText("O poder do sol na palma da minha mão...");
						labelMensagemErro.setVisible(false);
						container.repaint();
					} else {
						labelResultado.setText(temperatura.converterParaKelvin() + " KELVIN");
						labelMensagemErro.setVisible(false);
						container.repaint();
					}
					
				} catch (NumberFormatException ex) {
					labelMensagemErro.setVisible(true);
					labelResultado.setText("");
					container.repaint();
				}
			}
		});
		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setFont(fonte);
		labelMensagemErro.setText("<html><div style='text-align: center;'>Insira um número válido<br>por favor...</div></html>");
		labelMensagemErro.setBounds(0, 230, 600, 50);
		labelMensagemErro.setHorizontalAlignment(SwingConstants.CENTER);
		labelMensagemErro.setForeground(Color.RED);
		labelMensagemErro.setVisible(false);
		
		
		container.add(labelCelsius);
		container.add(textCelsius);
		container.add(buttonKelvin);
		container.add(buttonFahreinheit);
		container.add(labelMensagemErro);
		
		
		tela.setVisible(true);
	}	
}