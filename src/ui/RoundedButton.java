package ui;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class RoundedButton extends JButton {
	Color c1 = new Color(0, 129, 86);	// �ʷ�
	Color c2 = new Color(239, 177, 28); // ���
	
	public RoundedButton() {
        super();
        decorate();
    }

    public RoundedButton(String text) {
        super(text);
        decorate();
    }

    public RoundedButton(Action action) {
        super(action);
        decorate();
    }

    public RoundedButton(Icon icon) {
        super(icon);
        decorate();
    }

    public RoundedButton(String text, Icon icon) {
        super(text, icon);
        decorate();
    }

    // �⺻ ��翡 �ִ� �׵θ� ����, ������
    protected void decorate() {
        setBorderPainted(false);
        setOpaque(false);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        Graphics2D graphics = (Graphics2D) g;

        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // isArmed(): ����, isRollover(): �ø�
        if (getModel().isArmed()) {
            graphics.setColor(c2.darker());
        } else if (getModel().isRollover()) {
            graphics.setColor(c2.brighter());
        } else {
            graphics.setColor(c2);
        }

        // ����, ���� ũ�⸸ŭ 10�� �ձ۱�
        graphics.fillRoundRect(0, 0, width, height, 15, 15);

        FontMetrics fontMetrics = graphics.getFontMetrics();
        Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

        int textX = (width - stringBounds.width) / 2;
        int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();

        graphics.setColor(c1);
        graphics.setFont(getFont());
        graphics.drawString(getText(), textX, textY);
        graphics.dispose();

        super.paintComponent(g);
    }
}
