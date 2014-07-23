package com.jsonviewer;

import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

class SortedComboBoxModel extends DefaultComboBoxModel {
	public SortedComboBoxModel() {
		super();
	}

	public SortedComboBoxModel(Object[] items) {
		super(items);
	}

	public SortedComboBoxModel(Vector items) {
		super(items);
	}

	public void addElement(Object element) {
		int index = 0;
		int size = getSize();

		// Determine where to insert element to keep list in sorted order

		for (index = 0; index < size; index++) {
			Comparable c = (Comparable) getElementAt(index);

			if (c.compareTo(element) > 0)
				break;
		}

		super.insertElementAt(element, index);
	}

	public void insertElementAt(Object element, int index) {
		addElement(element);
	}
}