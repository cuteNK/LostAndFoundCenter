package frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.html.ImageView;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import ui.HintTextArea;
import ui.HintTextField;
import ui.RoundedButton;

public class Registration extends JFrame {
	JPanel p = new JPanel();
	JLabel l = new JLabel("����ϱ�");
	
	ButtonGroup group = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("����");
	JRadioButton rb2 = new JRadioButton("�н�");
	
	JLabel jl1 = new JLabel("���� ��¥");
	JLabel jl2 = new JLabel("���湰");
	JLabel jl3 = new JLabel("���� ���");
	JLabel jl4 = new JLabel("��Ÿ (������ Ư¡ ��)");
	
	// ��¥ ����
	UtilDateModel model = new UtilDateModel();
	JDatePanelImpl datePanel = new JDatePanelImpl(model);
	JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
	HintTextField tf1 = new HintTextField("��) ������, ������ ī�� ");
	HintTextField tf2 = new HintTextField("��) ����3��, ü����");
	HintTextArea tf3 = new HintTextArea("��) ������ ��ƼĿ�� �پ� �־��.");;	// TODO ���ڼ� ���� �ɱ�
	
	// ���� ÷�� ��ư
	RoundedButton btnNewButton = new RoundedButton("����÷��");
	
	// �ڷΰ��� ��ư
	ImageIcon btImage = new ImageIcon(lost.class.getResource("../image/bbtn.png"));
	JButton bback = new JButton(btImage);
	
	Color c1 = new Color(0, 129, 86); // ��� (�ʷ�)
	Color c2 = new Color(239, 177, 28); // �۾� (���)
	Font f1 = new Font("KoPub����ü Bold", Font.PLAIN, 35);
	Font f2 = new Font("KoPub����ü Medium", Font.PLAIN, 25);
	Font f3 = new Font("KoPub����ü Medium", Font.PLAIN, 20);
	Font f4 = new Font("KoPub����ü Medium", Font.PLAIN, 15);

	public Registration() {
		// TODO ��Ÿ JLabel ���� ����
		// TODO ���� ��ư ���ڰ�
		// TODO ��¥ ���� ����
		// TODO ��� ����
		// TODO �α��� ����
		// TODO ���� ����
		
		tf3.setLineWrap(true);

		p.setLayout(null);
		l.setFont(f1);
		l.setForeground(c2);
		l.setBounds(75, 105, 135, 45);

		// ����, �н� ��ư
		rb1.setSelected(true);
		rb1.setBounds(75, 195, 70, 30);
		rb1.setBorderPainted(false);
		rb1.setFont(f2);
		rb1.setFocusable(false);
		rb1.setOpaque(false);
		
		rb2.setBounds(75, 250, 70, 30);
		rb2.setFont(f2);
		rb2.setBorderPainted(false);
		rb2.setFocusable(false);
		rb2.setOpaque(false);
		
		// Label
		jl1.setBounds(75, 310, 450, 45);
		jl1.setFont(f2);
		jl1.setForeground(c2);
		
		jl2.setFont(f2);
		jl2.setBounds(75, 395, 450, 45);
		jl2.setForeground(c2);
		
		jl3.setFont(f2);
		jl3.setBounds(75, 495, 450, 45);
		jl3.setForeground(c2);
		
		jl4.setBounds(75, 595, 450, 45);
		jl4.setFont(f2);
		jl4.setForeground(c2);

		rb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jl1.setText("���� ��¥");
				jl2.setText("���湰");
				jl3.setText("���� ���");

			}
		});
		rb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jl1.setText("�н� ��¥");
				jl2.setText("�нǹ�");
				jl3.setText("�н� ���");

			}
		});

		// �ڷΰ��� ��ư
		bback.setBorderPainted(false);
	    bback.setFocusPainted(false);
	    bback.setBackground(c1);
	    bback.setIcon(btImage);
	    bback.setLayout(null);
	    bback.setBounds(35, 40, 15, 25);
		bback.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
		        new main().setVisible(true);
				
			}
		});

		// ��¥ ����
		tf1.setBounds(75, 440, 450, 40);
		tf1.setFont(f3);
		tf2.setToolTipText("");
		
		tf2.setBounds(75, 540, 450, 40);
		tf2.setFont(f3);
		
		tf3.setBounds(75, 640, 450, 100);
		tf3.setFont(f3);
	
		datePicker.setBounds(75, 355, 450, 25);
		datePicker.setFont(f3);
		

		// ���ڼ� ����
		tf1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src = (JTextField) ke.getSource();
				if (src.getText().length() >= 6)
					ke.consume();
			}
		});

		getContentPane().add(p);
		p.setBackground(c1);
		p.add(l);
		
		p.add(bback);
		group.add(rb1);
		group.add(rb2);
		p.add(rb1);
		p.add(rb2);

		p.add(jl1);
		p.add(jl2);
		p.add(jl3);
		p.add(jl4);
		p.add(tf1);
		p.add(tf2);
		p.add(datePicker);
		p.add(tf3);

		// ���� ÷�� ��ư
		btnNewButton.setBounds(320, 775, 95, 30);
		btnNewButton.setFont(f4);
		
		JLabel lbl = new JLabel();
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// ���� ���� ���� ��������
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename = f.getAbsolutePath();
				Image getAbsolutePath = null;
				ImageIcon icon = new ImageIcon(filename);

				// ���� ���� ���߱�
				Image img = icon.getImage();
				Image changeImg = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon changeIcon = new ImageIcon(changeImg);
				lbl.setIcon(changeIcon);
				
			}
		});
		
		lbl.setBounds(320, 105, 200, 200);
		
		p.add(lbl);
		p.add(btnNewButton);

		// ����ϱ� ��ư
		RoundedButton btnNewButton_1 = new RoundedButton("����ϱ�");
		btnNewButton_1.setBounds(430, 775, 95, 30);
		btnNewButton_1.setFont(f4);
		btnNewButton.paintComponents(getGraphics());
		p.add(btnNewButton_1);

		setTitle("lost & found");
		setSize(600, 900);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Registration().setVisible(true);

	}

}
