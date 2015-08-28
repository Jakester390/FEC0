package util;

import java.util.LinkedList;

public class TriggerLinkTable<V> {
	private LinkedList<V>[] list;
	@SuppressWarnings("unchecked")
	public TriggerLinkTable() {
		list = (LinkedList<V>[]) (new Object[Statics.NUM_TRIGGERS]);
		for (int i = 0; i < list.length; i++) {
			list[i] = new LinkedList<V>();
		}
	}
	public void add(int key, V value) {
		for(int i = 1; i <= Statics.NUM_TRIGGERS; i++) {
			if(key / Math.pow(2, i) != 0) {
				key -= Math.pow(2, i - 1);
				list[i-1].add(value);
			}
		}
	}
	public LinkedList<V> get(int key) {
		int index = (int) (Math.log(key) / Math.log(2));
		return list[index];
	}
	public LinkedList<V> remove(int key) {
		int index = (int) (Math.log(key) / Math.log(2));
		LinkedList<V> r = list[index];
		list[index] = new LinkedList<V>();
		return r;
	}
	public void remove(V value) {
		for (int i = 0; i < list.length; i++) {
			list[i].remove(value);
		}
	}
}
