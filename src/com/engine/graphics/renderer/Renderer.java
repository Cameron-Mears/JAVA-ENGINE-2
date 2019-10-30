package com.engine.graphics.renderer;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.engine.instance.GraphicsInstance;
import com.engine.util.datastruct.list.List;
public class Renderer
{
    private static int width;
    private static int height;
    private static int numLayers;
    static
    {
    	numLayers = 1;
    }
    
    private List<GraphicsInstance>[] layers;

    public Renderer()
    {
       layers = new List[numLayers];
    }

    public void render()
    {
        BufferedImage canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = canvas.createGraphics();
        
    }
}