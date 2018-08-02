package cn.eyretec.eyre.util;

import java.util.Random;

/**
 * 
 * TODO : 随机数生成器
 * 
 * @author Cookie Eyre
 * @date 2018年7月22日
 * @time 上午11:35:44
 * @lasttime TODO: 2018年7月22日 12:25:24
 * @version 0.3.1
 * @remarks 1
 *
 */

public class RandomAccess {
	
	public static String hex (int lougth ) {
		Random rand = new Random();
		StringBuilder hex = new StringBuilder();
		for (int i = 0; i != lougth; i++) {
			int num = rand.nextInt(15);
			char tmp = '\0';
			if (num <10) {
				tmp = String.valueOf(num).charAt(0);
			} else {
				switch (num) {
				case 10:
					tmp = 'A';
					break;
				case 11:
					tmp = 'B';
					break;
				case 12:
					tmp = 'C';
					break;
				case 13:
					tmp = 'D';
					break;
				case 14:
					tmp = 'E';
					break;
				case 15:
					tmp = 'F';
				}
			}
			hex.append(tmp);
		}
		return hex.toString();
	}

}
