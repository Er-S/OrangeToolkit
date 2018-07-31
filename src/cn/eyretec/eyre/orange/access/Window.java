package cn.eyretec.eyre.orange.access;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cn.eyretec.eyre.orange.methodwindow.RandomWindow;

/**
 * 
 * TODO : 所有可视化界面的组件与功能定义
 * 
 * @author Cookie Eyre
 * @date 2018年7月25日
 * @time 下午7:16:12
 * @lasttime TODO: 2018年7月25日 19:17:19
 * @version 0.4.0
 * @remarks 2
 *
 */

public class Window {
	
	public static class Main {
		public static JFrame window = new JFrame("菜单 || Orange工具箱");
			public static Box box = Box.createVerticalBox();
				public static JPanel pSetting = new JPanel(new FlowLayout(FlowLayout.LEFT));
					public static JButton setting = new JButton("☢");
				public static JPanel title = new JPanel();
					public static JLabel title1 = new JLabel("Orange	 ");
					public static JLabel title2 = new JLabel("Toolkit");
				public static JPanel pMenu = new JPanel();
					public static JButton menu = new JButton("菜单");
				public static JPanel info = new JPanel();
					public static Box left = Box.createVerticalBox();
						public static JLabel userInfo = new JLabel("自定义区域");
		
		public static void init() {

			window.setLocation(180, 120);
			window.setLayout(new FlowLayout());
			setting.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					window.setVisible(false);
					Setting.init();
					Setting.window.setVisible(true);
				}
			});
			title1.setFont(new Font(null, Font.PLAIN, 50));
			title2.setFont(new Font(null, Font.PLAIN, 30));
			menu.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					RandomWindow.hex();
				}
			});
			
			window.addWindowListener(new WindowListener() {
				
				@Override
				public void windowOpened(WindowEvent e) {
					System.out.println("[INFO]Main Window Opened");
					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					System.out.println("[INFO]Main Window Iconified");
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					System.out.println("[INFO]Main Window Deiconified");
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					System.out.println("[INFO]Main Window Deactivated");
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					System.out.println("[INFO]Main Window Closing");
					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					System.out.println("[INFO]Main Window Closed");
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					System.out.println("[INFO]Main Window Actived");
					
				}
			});
			
			pSetting.add(setting);
			pSetting.add(new JLabel("选项"));
			title.add(title1);title.add(title2);
			pMenu.add(menu);
			left.add(new JLabel("Orange Debug / Version 0.4.0"));
			left.add(userInfo);
			info.add(left);
			info.add(new JLabel("              Copyright?Cookie Eyre 2018-7"));
			box.add(pSetting);box.add(title);box.add(pMenu);box.add(info);
			window.add(box);
			window.pack();
		}
	}
	
	public static class Setting {
		public static JFrame window = new JFrame("设置 || Orange工具箱");
			public static Box box = Box.createVerticalBox();
				public static JPanel pAbout = new JPanel(new FlowLayout(FlowLayout.RIGHT));
					public static JButton about = new JButton("关于");
				public static JPanel userInfo = new JPanel();
					public static JTextField infoIn = new JTextField(25);
					public static JButton infoInSure = new JButton("应用");
					
		public static void init() {
			window.setLocation(180, 120);
			about.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(
							window,
							"Orange Toolkit\n由 Miki 成员 Cookie Eyre 制作\n尽情享用!!!",
							"关于 Orange 工具箱",
							JOptionPane.INFORMATION_MESSAGE
							);
				}
			});
			infoInSure.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Main.userInfo.setText(infoIn.getText());
					
				}
			});
			
			window.addWindowListener(new WindowListener() {
				
				@Override
				public void windowOpened(WindowEvent e) {
					System.out.println("[INFO]Setting Window Opened");
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					System.out.println("[INFO]Setting Window Iconified");
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					System.out.println("[INFO]Setting Window Deiconified");
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					System.out.println("[INFO]Setting Window Deactivated");
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					System.out.println("[INFO]Setting Window Closing");
					Main.window.setVisible(true);
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					System.out.println("[INFO]Setting Window Closed");
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					System.out.println("[INFO]Setting Window Actived");
					
				}
			});
			
			userInfo.add(new JLabel("底部信息"));
			userInfo.add(infoIn);userInfo.add(infoInSure);
			pAbout.add(about);
			box.add(pAbout);
			box.add(userInfo);
			window.add(box);
			window.pack();
		}
		
	}
	
	public static class Menu {
		public static JFrame window = new JFrame("菜单 || Orange工具箱");
			public static Box box = Box.createVerticalBox();
			
	}
	
	public static class App {
		
	}
}
