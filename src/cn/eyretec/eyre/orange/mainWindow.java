package cn.eyretec.eyre.orange;

import java.text.SimpleDateFormat;

import javax.swing.UIManager;
import javax.swing.WindowConstants;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.eyretec.eyre.orange.access.Window;

/**
 * 
 * TODO 主界面
 * 
 * @author Cookie Eyre
 * @date 2018年7月5日
 * @time 下午2:59:02
 * @last_time 2018年7月21日 20:15:38
 * @version 0.4.0
 * @remarks 12
 * 
 */


/**
 * 
 * ** Change Log **
 * 
 * * V 0.3.0
 * 更改ChangeLog模式
 * 完善提示信息
 * 删除退出按钮
 * 更改窗口标题
 * 更改底栏信息
 * 加入 "主菜单"
 * 将 "设置" 按钮移至左上角
 * 加入 "标题" 栏
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
	
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println("[INFO]System started at " + df.format(System.currentTimeMillis()));
		
		// 导入BeautifulEye
		System.out.println("[INFO]Loading \"BeautifulEye\" ");
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {}

		System.out.println("[INFO]Initing \"Beauyiful Eye\"");
		BeautyEyeLNFHelper.frameBorderStyle
			= BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
		UIManager.put("RootPane.setupButtonVisible", false);
		Window.Main.window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		System.out.println("[INFO]Initing Main Window ");
		Window.Main.init();
		Window.Main.window.setVisible(true);
		
		System.out.println("[INFO]Done ! At " + df.format(System.currentTimeMillis()));
	}

}
