package com.engine.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Scanner;

import com.engine.util.datastruct.GNode;
import com.engine.util.datastruct.list.List;

final class ConfigParse 
{
    private static Map<String, Variable> var;
    static String workingPackage = null;

    private static String parseCommandatClass(String command, int line) throws InvalidConfigurationFileFormatException {
        int begin = 1, end = 1;
        for (; end < command.length(); end++) 
        {
            if (command.charAt(end) == ':') break;
        }
        if (end == command.length()) 
        {
            throw new InvalidConfigurationFileFormatException("Config Syntax Error at line " + Integer.toString(line) + " | Expected Symbol -> ':' for command @ClassName:{args}");
        }

        return command.substring(begin, end);
    }


    private static Variable getByName(String name)
    {
       

        return null;
    }

    private boolean keywordfreeVar(String command)
    {
        return true;
    }

    public static String parseLine(String line)
    {
        return null;
    }
    public static String parseCommandPackage(String command, int line) throws InvalidConfigurationFileFormatException
    {
        int start = getCommandSymbolindex(command) + 1;
        int begin = start, end = start;
        for (; end < command.length(); end++) 
        {
            if (command.charAt(end) == ';')
            {
                return command.substring(begin, end);
            }                
        }
        throw new InvalidConfigurationFileFormatException("Config Syntax Error at line " + Integer.toString(line) + " | Expected Symbol -> ';' for command ^package;");
    }

    public static char getCommandSymbol(String line)
    {
        for (int index = 0; index < line.length(); index++) 
        {
            if ((int)line.charAt(index) != 32) return line.charAt(index);   
        }

        return '\0';
    }

    public static int getCommandSymbolindex(String line) 
    {
        for (int index = 0; index < line.length(); index++) {
            if (line.charAt(index) != 32 || line.charAt(index) != '\t')
                return index;
        }

        return 0;
    }

    public static void parseConfig(File config) throws FileNotFoundException, InvalidConfigurationFileFormatException 
    {
        System.out.println(config);
        List<WorkingClass> classes = new List<WorkingClass>();
        Scanner scanner = new Scanner(config);
        String next = scanner.nextLine();
        if (!next.equals("@JAVAENGINECONFIG")) throw new AssertionError("file does not contain @JAVAENGINECONFIG header");//start file with
        boolean inItemConfig = false;
        int line = 1;
        int depth = 1;

        while (scanner.hasNextLine()) 
        {
            line++;
            next = scanner.nextLine();
            System.out.println(next);
            char command = getCommandSymbol(next);
            if (next.length() == 0) continue;
            if (command == '^')
            {
                workingPackage = parseCommandPackage(next, line);
            }
            else if (command == '~') //access static member
            {

            }
            else if (command == '$') //param for function/member 
            {
                throw new InvalidConfigurationFileFormatException("Syntax Errror at -> " + Integer.toString(line) + " unexpected symbol -> '$' -> $ states a function argument");
            }
            else if (command == '`') //end of block
            {
                depth --;
            }
            else if (command == '#')//config function
            {
                depth++;
            }
            else if (command == '&')
            {
                depth ++;
            }
            else if (command == '@') //annotates a class in the config
            {
                depth ++;
                String className = parseCommandatClass(next, line);
                try 
                {
                    Class<?> cls = Class.forName(workingPackage + className);
                    Class<?>[] members = null;
                    WorkingClass thisClass = new WorkingClass();
                    thisClass.members = members;
                    thisClass.type = cls;
                    thisClass.name = className;
                    
                    classes.append(new GNode<WorkingClass>(thisClass));
                } 
                catch (ClassNotFoundException e)
                {
                    throw new InvalidConfigurationFileFormatException("Config Read Error at line " + Integer.toString(line) + " | For Command --> '@ClassName' no class named --> " + e.getMessage());
                }
                

            } 
            //else throw new InvalidConfigurationFileFormatException("Config Syntax Error at line " + Integer.toString(line) + " | Expected Command --> @ClassName or @ClassNameEND");
        }

        if (depth != 0)
        {
            System.out.println(depth);
            throw new InvalidConfigurationFileFormatException("Syntax Error at line " + Integer.toString(line) + " | Expected symbol `END ");
        }
        
        scanner.close();
    }

    private static class WorkingClass
    {
        String name;
        Class<?> type;
        Class<?>[] members;
        Constructor<?> constructor;
        Object[][] args;
        Method[] method;
    }

    private static class Variable
    {
        String name;
        Class type;
        Object instance;
    }


}