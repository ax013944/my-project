package com.well.free;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class game {
	JFrame f;

	public game() {
		
		f = new JFrame("rpg");
		JButton b = new JButton("開始遊戲");
		b.setFont(new Font("標楷體", Font.BOLD, 32));
		f.getContentPane().add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				new ff();
			}
		});
		
		f.setSize(810, 810);
		f.show();
	}
	

	public static void main(String[] args) {
		new game();
	}
}

class ff {
	public ff() {
		JFrame f = new JFrame("rpg");
		f.setSize(1920, 1080);
		f.show();
	}

}
