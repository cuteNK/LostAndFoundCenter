package frame;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import ui.RoundedButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.SQLException;
import java.awt.Component;

public class ListFrame2 extends JFrame implements MouseListener {
	// UI
	Color c1 = new Color(0, 129, 86); // ��� (�ʷ�)
	Color c2 = new Color(239, 177, 28); // �۾� (���)
	Font f3 = new Font("KoPub����ü Medium", Font.PLAIN, 20);
	Font f4 = new Font("KoPub����ü Medium", Font.PLAIN, 15);

	// �ڷΰ��� ��ư
	ImageIcon btImage = new ImageIcon(lost.class.getResource("../image/bbtn.png"));
	JButton bback = new JButton(btImage);

	RoundedButton btn = new RoundedButton("����ϱ�");

	private JTextField search;
	private JPanel tablePanel = new JPanel();
	private Object[][] ob = { { "�Һ�", "�޽Ľ�", "2022�� 11�� 7��" }, { "����", "����", "2022�� 11�� 4��" },
			{ "���� �̾���", "����", "2022�� 11�� 7��" }, { "����Ʈ ��ġ", "���� 3��", "2022�� 11�� 5��" },
			{ "USB", "���� 2��", "2022�� 11�� 1��" }, { "���", "���� 2��", "2022�� 11�� 13��" } };
	private String[] headers = { "���� �̸�", "���", "��¥" };
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel(headers, 0);
	JScrollPane scrollPane;

	// ���̺� �ȿ� �ִ� �ؽ�Ʈ ��� ����
	public void tableCellCenter(JTable t) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);

		TableColumnModel tcm = t.getColumnModel();

		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr);
		}
	}

	public ListFrame2() {
		model = new DefaultTableModel(ob, headers); // ������ ����[][], �÷���
		table = new JTable(model);
		// ���̺�
		table.setBounds(0, 10, 798, 100);
		table.setRowHeight(50);
		table.setFont(f4);
		tableCellCenter(table);
		table.setPreferredScrollableViewportSize(new Dimension(800, 500));

		tablePanel.add(table);
		tablePanel.setBackground(c1);

		tablePanel.setLayout(null);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(100, 100, 800, 372);
		tablePanel.add(scrollPane);

		// �˻� ���
		search = new JTextField();
		search.setBounds(100, 28, 800, 52);
		search.setColumns(10);
		search.setFont(f3);
		search.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String val = search.getText();
				TableRowSorter<TableModel> trs = new TableRowSorter<TableModel>(table.getModel());
				table.setRowSorter(trs);
				trs.setRowFilter(RowFilter.regexFilter(val));
			}
		});

		tablePanel.add(search);
		getContentPane().add(tablePanel);

		TableColumnModel columnModels = table.getColumnModel();
		columnModels.getColumn(0).setPreferredWidth(150);
		columnModels.getColumn(1).setPreferredWidth(200);
		columnModels.getColumn(2).setPreferredWidth(250);

		table.addMouseListener(this);
		table.getTableHeader().setReorderingAllowed(false); // �̵� X
		table.getTableHeader().setResizingAllowed(false); // ũ�� ���� X
		table.setEnabled(false);

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
		tablePanel.add(bback);

		// ����ϱ� ��ư
		btn.setText("����ϱ�");
		btn.setFont(f3);
		btn.setBounds(700, 490, 190, 40);
		btn.addActionListener(e -> {
			dispose();
			new Registration().setVisible(true);
		});
		tablePanel.add(btn);

		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ListFrame2().setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == 1) {
		} // Ŭ��

		// ���� Ŭ��
		if (e.getClickCount() == 2) {
//			int row = table.getSelectedRow(); // ��
//			int col = table.getSelectedColumn(); // ��
//			for (int i = 0; i < table.getColumnCount(); i++) {
//				System.out.print("Ŭ����");
//			}
//			System.out.println();
			new Information2().setVisible(true);
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
