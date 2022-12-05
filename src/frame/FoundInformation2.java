package frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
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
import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.html.ImageView;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DatePickerSettings.DateArea;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import ui.HintTextArea;
import ui.HintTextField;
import ui.RoundedButton;

public class FoundInformation2 extends JFrame {
	Db db = new Db();
	JPanel p = new JPanel();
	Color c1 = new Color(0, 129, 86); // ��� (�ʷ�)
	Color c2 = new Color(239, 177, 28); // �۾� (���)
	Font f1 = new Font("KoPub����ü Bold", Font.PLAIN, 35);
	Font f2 = new Font("KoPub����ü Medium", Font.PLAIN, 25);
	Font f3 = new Font("KoPub����ü Medium", Font.PLAIN, 20);
	Font f4 = new Font("KoPub����ü Medium", Font.PLAIN, 15);
	
	JLabel text = new JLabel("���� ����");

	// �ڷΰ��� ��ư
	ImageIcon btImage = new ImageIcon(lost.class.getResource("../image/bbtn.png"));
	JButton bback = new JButton(btImage);


	public FoundInformation2() {
		text.setFont(f1);

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
			}
		});
		
		// �⺻ ����
		JLabel lbl = new JLabel();
		lbl.setBackground(new Color(255, 255, 255));
//		ImageIcon icon = new ImageIcon(lost.class.getResource("../image/white.png"));
		ImageIcon icon = new ImageIcon(lost.class.getResource("../image/smartwatch.png"));
		lbl.setIcon(icon);
		lbl.setBounds(120, 170, 350, 350);
		
		// �⺻ ���� ���� ���߱�
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		lbl.setIcon(changeIcon);
		
		

		getContentPane().add(p);
		p.setLayout(null);
		p.setBackground(c1);
		p.add(bback);
		p.add(text);
		p.add(lbl);
		text.setFont(f1);
		text.setForeground(c2);
		text.setBounds(80, 90, 135, 45);
		
		JLabel lblNewLabel = new JLabel("�нǹ�: ����Ʈ ��ġ");
		lblNewLabel.setBounds(80, 584, 436, 30);
		lblNewLabel.setFont(f2);
		lblNewLabel.setForeground(c2);
		p.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("�н� ��¥: 2022�� 11�� 5��");
		lblNewLabel_1.setBounds(80, 644, 436, 30);
		lblNewLabel_1.setFont(f2);
		lblNewLabel_1.setForeground(c2);
		p.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("�н� ���: ���� 3��");
		lblNewLabel_2.setBounds(80, 704, 436, 30);
		lblNewLabel_2.setFont(f2);
		lblNewLabel_2.setForeground(c2);
		p.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("���� Ư¡: ���� ��Ʈ���̿���");
		lblNewLabel_3.setBounds(80, 764, 436, 30);
		lblNewLabel_3.setFont(f2);
		lblNewLabel_3.setForeground(c2);
		p.add(lblNewLabel_3);
		
		setTitle("Lost & Found");
		setSize(600, 900);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new FoundInformation2().setVisible(true);

	}
}