package com.engine.core;

public final class InvalidConfigurationFileFormatException extends Exception
{
    private static final long serialVersionUID = 7882682479176377699L;
    
    public InvalidConfigurationFileFormatException(String lineAndExpectedSymbol)
    {
        super(lineAndExpectedSymbol);
    }
}