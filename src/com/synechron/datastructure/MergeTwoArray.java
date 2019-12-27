package com.synechron.datastructure;

public class MergeTwoArray {

	public static void main(String[] args) {
		int a1[] = { 1, 6, 9,9, 10, 13, 15 ,16};
		int a2[] = { 1,2, 3,3, 5, 8, 10, 11, 12, 16 };
		int len = a1.length + a2.length;

		int temp[] = merge(a1, a2, len);
		for (int i : temp) {
			System.out.println(i);
		}
		System.out.println(len);
		System.out.println(temp.length);
	}

	public static int[] merge(int[] a1, int[] a2, int len) {
		int temp[] = new int[len];
		int i = 0, j = 0;
		for (int k = 0; k < len; k++) {

			if (i > a1.length - 1) {
				// System.arraycopy(a2, j, temp, k, len);
				temp = mergeRemaing(j, a2, temp, k);
				return temp;
			}

			if (j > a2.length - 1) {
				// System.arraycopy(a1, i, temp, k, len);
				temp = mergeRemaing(i, a1, temp, k);
				return temp;
			}

			if (a1[i] < a2[j])
				temp[k] = a1[i++];

			else if (a1[i] == a2[j]) {
				temp[k++] = a1[i++];
				temp[k] = a2[j++];
			} else {
				temp[k] = a2[j++];
			}

		}
		return temp;
	}

	public static int[] mergeRemaing(int j, int[] a2, int[] temp, int tPos) {
		for (; tPos < temp.length; tPos++) {
			temp[tPos] = a2[j++];
		}
		return temp;
	}
}
