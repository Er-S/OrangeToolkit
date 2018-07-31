package cn.eyretec.eyre.orange.methodwindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import cn.eyretec.eyre.util.RandomAccess;

/**
 * 
 * TODO :
 * 
 * @author Cookie Eyre
 * @date 2018年7月25日
 * @time 下午7:17:01
 * @lasttime TODO: 2018年7月31日 19:58:01
 * @version 0.4.0
 * @remarks 2
 *
 */

public class RandomWindow {
	public static void hex() {
		JFrame frHex = new JFrame("十六进制随机数 || Orange工具箱 ");
		JPanel pMain = new JPanel();
		Box boMain = Box.createVerticalBox();
		boMain.add(new JLabel("十六进制随机数生成器"));
		JTextArea teaNum = new JTextArea(5,40);
		JScrollPane text = new JScrollPane(teaNum,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		boMain.add(text);
		JPanel pSet = new JPanel();
		pSet.add(new JLabel("生成长度"));
		JTextField tefLength = new JTextField(5);
		tefLength.setText("5");
		pSet.add(tefLength);
		boMain.add(pSet);
		JPanel pAccess = new JPanel();
		JButton buAccess = new JButton("生成");
		buAccess.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int len = 5;
				try {
					len = Integer.parseInt(tefLength.getText());
				} catch (NumberFormatException ea) {
					ea.printStackTrace();
				}
				teaNum.append(RandomAccess.hex(len) + '\n');
			}
		});
		pAccess.add(buAccess);
		boMain.add(pAccess);
		pMain.add(boMain);
		frHex.add(pMain);
		frHex.pack();
		frHex.setVisible(true);
	}
}
