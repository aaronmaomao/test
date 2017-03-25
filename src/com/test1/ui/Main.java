package com.test1.ui;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试
 * @author 毛正军
 */
public class Main {

	/**
	 * 计算最大不同字符串的长度
	 * @param str		源字符串
	 * @return
	 */
	public static int lengthOfMaxDiff(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		int current = 0;
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				current = Math.max(map.get(str.charAt(i)) + 1, current);
				if ((i - current + 1) > max) {
					max = i - current + 1;
				}
			} else if ((i - current + 1) > max) {
				max = i - current + 1;
			}
			map.put(str.charAt(i), i);
		}
		return max;
	}

	public static void main(String[] args) {
		String str = "abcdbafgh"; // 测试字符串
		System.out.println(lengthOfMaxDiff(str));
	}
}