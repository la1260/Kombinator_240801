package hu.hl.kombinator_240801;

import java.util.TreeMap;

public class Main {
	private TreeMap<Integer, String> mainlist= new TreeMap<Integer, String>();
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		init();
		int i= 0;
		TreeMap<Integer, String> results= mainlist;
		while (i<4) {
			results= combine(mainlist, results);
			i++;
		}
		results.entrySet().forEach(System.out::println);
	}
	private TreeMap<Integer, String> combine(TreeMap<Integer, String> list0, TreeMap<Integer, String> list1) {
		return list0.entrySet().stream().collect(() -> new TreeMap<Integer, String>(), (k0, k1) -> {
			list1.entrySet().stream().forEach(k -> {
				k0.put(k1.getKey()+k.getKey(), k1.getValue()+k.getValue());
			});
		}, (k2, k3) -> {});		
	}
	private void init() {
		mainlist.put(61, "61;");
		mainlist.put(48, "48;");
		mainlist.put(33, "33;");
		mainlist.put(31, "31;");
		mainlist.put(31, "31;");
		mainlist.put(31, "31;");
		mainlist.put(30, "30;");
		mainlist.put(30, "30;");
		mainlist.put(29, "29;");
		mainlist.put(26, "26;");
		mainlist.put(22, "22;");
		mainlist.put(20, "20;");
		mainlist.put( 4, " 4;");
	}
}