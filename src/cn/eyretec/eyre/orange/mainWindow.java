package cn.eyretec.eyre.orange;

import java.awt.FlowLayout;
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
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

/**
 * 
 * TODO 主界面
 * 
 * @author Cookie Eyre
 * @date 2018年7月5日
 * @time 下午2:59:02
 * @version 0.2.1
 * @remarks 5
 * 
 */


/**
 * 
 * ** Change Log **
 * 
 * * V 0.2.0
 * 1.导入皮肤:BeautyEye
 * 2.设置退出按钮样式
 * 
 * * V 0.1.0
 * 1.创建主界面
 * 2.创建设置,退出按钮
 * 3.创建设置界面
 * 创建欢迎栏:
 * 名称,版本,Copyright
 * 
 */

public class mainWindow {
	
	static void setting() {
		JFrame frSetting = new JFrame("设置");
		frSetting.setLocation(180, 120);
		JPanel setWel = new JPanel();
		setWel.add(new JLabel("欢迎信息"));
		setWel.add(new JTextField(20));
		JButton setWelOK = new JButton("应用");
		setWelOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("[WARN]This is coding...");
				JOptionPane.showMessageDialog(
						frSetting,
						"对不起,此功能正在加入",
						"提示",
						JOptionPane.ERROR_MESSAGE
				);
			}
		});
		setWel.add(setWelOK);
		Box b2 = Box.createVerticalBox();
		b2.add(setWel);
		frSetting.add(b2);
		frSetting.pack();
		frSetting.setVisible(true);
	}


	public static void main(String[] args) {
		
		// 导入BeautifulEye
		System.out.println("[INFO]Loading \"BeautifulEye\"");
		try
	    {
	        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
	    }
	    catch(Exception e)
	    {
	        //TODO exception
	    }
		
		// 开启系统
		System.out.println("[INFO]System Start");
		
		// 主界面
//		BeautyEyeLNFHelper.frameBorderStyle
//				= BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
		UIManager.put("RootPane.setupButtonVisible", false);
		System.out.println("[INFO]Loading Main Window");
		JFrame main = new JFrame("Orange - 我的第一个应用程序");
//        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		main.setLocation(180, 120);
		main.setLayout(new FlowLayout());
		main.setSize(660, 420);
		
		// TODO:欢迎文字
		System.out.println("[INFO]Loading Welcome Label");
		JLabel laWel =new JLabel();
		laWel.setText("         -_-  欢迎使用由 Cookie Eyre 开发的 Orange 工具箱  ^v^         ");
		
		// 按钮1
		System.out.println("[INFO]Loading Chick Button");
		JButton bu1 = new JButton("点我!!");
		bu1.setSize(66, 42);
//		bu1.setLocation(10, 10);
		// 按钮一事件
		bu1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 信息对话框
				System.out.println("[INFO]Chicked the button 1");
				JOptionPane.showMessageDialog(
						main,
						"Hello! 你点击了按钮",
						"提示",
						JOptionPane.INFORMATION_MESSAGE
				);
			
			}
		});
		
		// TODO:设置按钮
		System.out.println("[INFO]Loading the setting window");
		JButton buSetting = new JButton("设置");
		buSetting.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setting();
			}
		});
		
		// 退出按钮
		System.out.println("[INFO]Loading Exit Button");
		JButton buExit = new JButton("退出");
		buExit.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
		buExit.setSize(66, 42);
		buExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Chick to exit...");
				System.exit(0);
				
			}
		});
		
		// 链接组件
		System.out.print("[INFO]Connecting workers...");
		JPanel pWelcome = new JPanel();
		pWelcome.add(laWel);
		JPanel pButton = new JPanel();
		pButton.add(bu1);
		JPanel pSetting = new JPanel();
		pSetting.add(buSetting);
		pSetting.add(buExit);
		Box b1 = Box.createVerticalBox();
		b1.add(pWelcome);
		b1.add(pButton);
		b1.add(pSetting);
		JPanel p = new JPanel();
		p.add(b1);
		main.add(p);
		System.out.println("[INFO] **Done!**");
		
		// 窗口事件
		main.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("[INFO]Window Opened");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("[INFO]Close Window by Exit ");
				System.exit(0);
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("[INFO]Window Closed");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("[INFO]Window Actived");
				// TODO Auto-generated method stub
				
			}
		});
		
		// 打开主界面
		main.pack();
		main.setVisible(true);
		
	}

}
