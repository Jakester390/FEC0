package util;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class stringList extends AbstractListModel<String> implements ComboBoxModel<String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -581531617578308101L;
	private String[] list;
	private int size;
	private int index;
	public stringList() {
		list = new String[10];
		size = 0;
	}
	public stringList(String[] stringArray) {
		list = new String[10];
		size = 0;
		for (int i = 0; i < stringArray.length; i++) {
			this.add(stringArray[i]);
		}
		index = 0;
	}
	public int getSize() {
		return size;
	}
	@Override
	public String getElementAt(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return list[index];
	}
	private void growList() {
		String[] tempList = new String[list.length * 2];
		for (int i = 0; i < list.length; i++) {
			tempList[i] = list[i];
		}
		list = tempList;
	}
	public void add(String toAdd) {
		if(size == list.length)
			growList();
		list[size] = toAdd;
		size++;
	}
	public boolean contains(String search) {
		for (int i = 0; i < size; i++) {
			if(list[i].equals(search))
				return true;
		}
		return false;
	}
	public void append(stringList toAppend) {
		for (int i = 0; i < toAppend.size; i++)
			this.add(toAppend.getElementAt(i));
	}
	@Override
	public Object getSelectedItem() {
		return list[index];
	}
	@Override
	public void setSelectedItem(Object anItem) {
		for (int i = 0; i < size; i++) {
			if(list[i].equals(anItem))
				index = i;
		}
	}
	public boolean containsStart(String search) {
		for (int i = 0; i < size; i++)
			if(list[i].startsWith(search))
				return true;
		return false;
	}
}

