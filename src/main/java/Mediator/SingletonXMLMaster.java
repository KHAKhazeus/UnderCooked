package Mediator;

import java.util.ArrayList;

/*
    Make GrandMaster Singleton
    Here we assume that the master can read a configuration from outer
    xml file.
 */
abstract public class SingletonXMLMaster implements GrandMaster{
    ArrayList branches = null;
    ArrayList buffer = null;
    String rules;
    SingletonXMLMaster singleton = null;
    SingletonXMLMaster(){ }

    public static <INFOTYPE> SingletonXMLMaster getInstance(String xml){return null;}
}
