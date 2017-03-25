package com.test1.ui;

import java.util.HashMap;
import java.util.Map;

/**
 * ����
 * @author ë����
 */
public class Main {

	/**
	 * �������ͬ�ַ����ĳ���
	 * @param str		Դ�ַ���
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
		String str = "abcdbafgh"; // �����ַ���
		System.out.println(lengthOfMaxDiff(str));
	}
}