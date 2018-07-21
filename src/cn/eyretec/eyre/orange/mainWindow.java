package cn.eyretec.eyre.orange;

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
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

/**
 * 
 * TODO 主界面
 * 
 * @author Cookie Eyre
 * @date 2018年7月5日
 * @time 下午2:59:02
 * @last_time 2018年7月21日 18:42:33
 * @version 0.2.1
 * @remarks 8
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
		
		// 设置窗口
		System.out.println("[INFO]Loading setting window ");
		JFrame frSetting = new JFrame("设置");
		frSetting.setLocation(180, 120);
		JPanel setWel = new JPanel();
		setWel.add(new JLabel("欢迎信息"));
		setWel.add(new JTextField(20));
		JButton setWelOK = new JButton("应用");
		setWelOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("[WARN]Try to start an unexist code ");
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
		System.out.println("[INFO]Loading \"BeautifulEye\" ");
		try
	    {
	        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
	    }
	    catch(Exception e)
	    {
	       //UNTODO exception
	    }
		
		// 开启系统
		System.out.println("[INFO]System Start ");
		
		// 主界面
		BeautyEyeLNFHelper
		.frameBorderStyle
				= BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
		UIManager.put("RootPane.setupButtonVisible", false);
		System.out.println("[INFO]Loading Main Window ");
		JFrame main = new JFrame("Orange工具箱 ");
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		main.setLocation(180, 120);
		main.setLayout(new FlowLayout());
//		main.setSize(660, 420);
		
		// 底栏信息
		System.out.println("[INFO]Loading Deep Information ");
		JPanel pDeep = new JPanel();
		Box boDeep = Box.createVerticalBox();
		boDeep.add(new JLabel("Orange Debug "));
		boDeep.add(new JLabel("Version 0.2.1 "));
		pDeep.add(boDeep);
		pDeep.add(new JLabel("              Copyright©Cookie Eyre 2018-7"));
		
		// 主菜单
		JButton buMenu = new JButton("菜单");
		
		// 标题
		JLabel labTitle = new JLabel("Orange ");
		labTitle.setFont(new Font(null, Font.PLAIN, 50));
		JLabel labTitle2 = new JLabel("Toolkit");
		labTitle2.setFont(new Font(null, Font.PLAIN, 30));
		JPanel pTitle = new JPanel();
		pTitle.add(labTitle);
		pTitle.add(labTitle2);
		
		// TODO:设置按钮
		System.out.println("[INFO]Loading the setting window ");
		JButton buSetting = new JButton("☢");
		buSetting.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setting();
			}
		});
		
		// 链接组件
		System.out.println("[INFO]Connecting workers... ");
		JPanel pSet = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pSet.add(buSetting);
		pSet.add(new JLabel("设置"));
		JPanel pMainMenu = new JPanel();
		pMainMenu.add(buMenu);
		Box boMain = Box.createVerticalBox();
		boMain.add(pSet);
		boMain.add(pTitle);
		boMain.add(pMainMenu);
		boMain.add(pDeep);
		main.add(boMain);
		System.out.println("[INFO] **Done!** ");
		
		// 窗口事件
		main.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("[INFO]Window Opened ");
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
				System.out.println("[INFO]Window Closed ");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("[INFO]Window Actived ");
				// TODO Auto-generated method stub
				
			}
		});
		
		// 打开主界面
		main.pack();
		main.setVisible(true);
		
	}

}
