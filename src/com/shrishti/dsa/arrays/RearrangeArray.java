package com.shrishti.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {

	public int[] array(int[] arr) {
		List<Integer> pos = new ArrayList<>();
		List<Integer> neg = new ArrayList<>();
		int[] result = new int[arr.length];
		int i = 0, p = 0, n = 0;

		for (int n1 : arr) {
			if (n1 >= 0) {
				pos.add(n1);
			} else {
				neg.add(n1);
			}

		}

		while (p < pos.size() && n < neg.size()) {
			result[i++] = pos.get(p++);
			result[i++] = neg.get(n++);

		}

		while (p < pos.size()) {
			result[i++] = pos.get(p++);
		}

		while (n < neg.size()) {
			result[i++] = neg.get(n++);
		}

		return result;

	}

}
