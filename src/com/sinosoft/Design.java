package com.sinosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Design {
	/*
	 * 
	 */

	public static void main(String[] args) {
		boolean valid = isValid("()");
		System.out.println(valid);
	}
		
	 public static boolean isValid(String s) {
	      Map map = new HashMap();
			map.put("{", "}");
			map.put("[", "]");
			map.put("(", ")");
			List temp = new ArrayList();
			char[] left = { '{', '[', '('};
			List<char[]> leftList = Arrays.asList(left);
			char[] charArray = s.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				if (leftList.contains(charArray[i])) {
					temp.add(map.get(charArray[i]));
				} else {
					if (temp.size() == 0) {
						return false;
					} else {
						if (map.get(charArray[i]).equals(temp.get(temp.size()-1))) {
							temp.remove(temp.size() - 1);
						} else {
							return false;
						}
					}
				}
			}
			if(temp.size()==0) {
				return true;
			}else{
				return false;
			}
	    }

}
