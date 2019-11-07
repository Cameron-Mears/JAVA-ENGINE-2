package com.engine.display;

import java.awt.BufferCapabilities;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.ImageCapabilities;

import javax.swing.JFrame;

public class Window
{
	
	private static final long serialVersionUID = -1454354845345432324L;
	private JFrame win;
	
	public Window(int width, int height, String title, Image icon)
	{
		win = new JFrame();
		Dimension winD = new Dimension(width, width);
		win.setPreferredSize(winD);
		win.setSize(winD);
		win.setIconImage(icon);
		win.setTitle(title);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);
	}
	
}