package frame;

import java.awt.*;
import javax.swing.*;

import ui.RoundedButton;

import java.awt.event.*;

public class main extends JFrame {
	JPanel p = new JPanel();
	JLabel l = new JLabel("�ֱ� ��ϵ� ���湰");
	JLabel t = new JLabel("");

	Color c1 = new Color(0, 129, 86); // ���(�ʷ�)
	Color c2 = new Color(239, 177, 28); // �۾�(���)
	Font f2 = new Font("KoPub����ü Medium", Font.PLAIN, 25);
	Font f3 = new Font("KoPub����ü Medium", Font.PLAIN, 20);

	RoundedButton bl = new RoundedButton("LOST");
	RoundedButton bf = new RoundedButton("FOUND");
	RoundedButton btn = new RoundedButton("����ϱ�");

	ImageIcon title = new ImageIcon(lost.class.getResource("../image/title.png"));

	public main() {
		p.setLayout(null);
		l.setFont(f2);
		l.setForeground(c2);
		l.setBounds(67, 602, 200, 35);
		p.add(l);
		t.setBounds(110, 130, 380, 58);
		t.setIcon(title);
		p.add(t);
		bl.setText("LOST");
		bl.setFont(f3);

		bl.setLayout(null);
		bl.setBounds(140, 282, 150, 150); // ��ġ, ũ��
		bl.addActionListener(e -> {
			dispose();
			new ListFrame().setVisible(true);
		});
		p.add(bl);

		bf.setText("FOUND");
		bf.setFont(f3);

		bf.setLayout(null);
		bf.setBounds(310, 282, 150, 150);
		bf.addActionListener(e -> {
			dispose();
			new ListFrame2().setVisible(true);
		});
		p.add(bf);

		getContentPane().add(p);
		p.setBackground(c1);
		btn.addActionListener(e -> {
			dispose();
			new Registration().setVisible(true);
		});

		btn.setText("����ϱ�");
		btn.setFont(f3);
		btn.setBounds(140, 471, 320, 58);
		p.add(btn);
		
		JLabel lblNewLabel = new JLabel();
		JLabel lblNewLabel_1 = new JLabel();
		JLabel lblNewLabel_2 = new JLabel();
		
		lblNewLabel.setBounds(64, 647, 150, 150);
		p.add(lblNewLabel);
		// ���� 1
		lblNewLabel.setBackground(new Color(255, 255, 255));
		ImageIcon icon = new ImageIcon(lost.class.getResource("../image/tumbler.jpg"));
		lblNewLabel.setIcon(icon);
		// ����1 ���� ���߱�
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		lblNewLabel.setIcon(changeIcon);
		
		lblNewLabel_1.setBounds(226, 647, 150, 150);
		p.add(lblNewLabel_1);
		// ���� 2
		ImageIcon icon2 = new ImageIcon(lost.class.getResource("../image/wlrkq.png"));
		lblNewLabel_1.setIcon(icon2);
		// ����2 ���� ���߱�
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon changeIcon2 = new ImageIcon(changeImg2);
		lblNewLabel_1.setIcon(changeIcon2);
		
		
		lblNewLabel_2.setBounds(385, 647, 150, 150);
		p.add(lblNewLabel_2);
		// ���� 2
		ImageIcon icon3 = new ImageIcon(lost.class.getResource("../image/earphones.png"));
		lblNewLabel_2.setIcon(icon3);
		// ����2 ���� ���߱�
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon changeIcon3 = new ImageIcon(changeImg3);
		lblNewLabel_2.setIcon(changeIcon3);
		

		setTitle("lost & found");// Ÿ��Ʋ
		setSize(600, 900);// �������� ũ��
		setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		setLocationRelativeTo(null);// â�� ��� ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame�� ���������� ����ǰ�
	}

	public static void main(String[] args) {
		new main().setVisible(true);
	}
}