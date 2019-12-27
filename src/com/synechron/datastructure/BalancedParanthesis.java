package com.synechron.datastructure;

import java.util.HashMap;

public class BalancedParanthesis {

	public static void main(String[] args) {
		HashMap<String, String> braces = new HashMap();
		braces.put("[", "]");
		braces.put("{", "}");
		braces.put("(", ")");
		System.out.println(isBalanced("[{()}]", braces));
		System.out.println(isBalanced("[[{{(({[()]}))}}]]", braces));
	}

	public static boolean isBalanced(String data, HashMap<String, String> braces) {
		boolean status = false;
		if(data!=null && !(data.length()%2==0))
			return status;
		int left = data.length() - 1;
		int right = 0;
		while (right <= left) {
			if (braces.get(("" + data.charAt(right++))).equals(("" + data.charAt(left--)))) {
				status = true;
				continue;
			} else {
				status = false;
				return status;

			}
		}

		return status;
	}
}
