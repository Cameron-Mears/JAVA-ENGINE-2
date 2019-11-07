package com.engine.core;

import java.io.File;
import java.io.FileNotFoundException;

import com.engine.display.Window;
import com.engine.instance.Instance;
import com.engine.util.math.GMath;
import com.game.entites.Player;

public final class Engine extends Thread {
    private File config;

    public Engine() throws FileNotFoundException, InvalidConfigurationFileFormatException 
    {
    	
    }

    public void init(File config) throws FileNotFoundException, InvalidConfigurationFileFormatException
    {
        if (!config.canRead()) throw new AssertionError("config file not readable");//file needs to be readable
        ConfigParse.parseConfig(config);
    }

    public static void main(String[] args) throws FileNotFoundException, InvalidConfigurationFileFormatException 
    {
        System.out.println(GMath.factorial[GMath.FACTORIAL_MAX]);
        Instance test = new Player();
        System.out.println(test.getClass());
        new Window(720,720,null, null);
        new Engine();    
    }
}