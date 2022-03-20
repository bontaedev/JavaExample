package com.exam.day08_OOP01;

import javax.swing.JOptionPane;

public class Joption {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("1. 이름을 입력해 주세요 >> ");
		JOptionPane.showMessageDialog(null, name);
		String peopleNum = JOptionPane.showInputDialog("2. 인원수를 입력해 주세요 >> ");
		JOptionPane.showMessageDialog(null, peopleNum);
		String temp = JOptionPane.showInputDialog("3. 현재 체온을 입력해 주세요 >>");
		JOptionPane.showMessageDialog(null, temp);
		String toGo = JOptionPane.showInputDialog("4. 매장 식사여부를 입력해 주세요 >> ");
		JOptionPane.showMessageDialog(null, toGo);
		
	}
}
