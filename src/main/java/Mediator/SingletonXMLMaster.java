package main.java.Mediator;

/*
    Make GrandMaster Singleton
    Here we assume that the master can read a configuration from outer
    xml file.
 */
abstract public class SingletonXMLMaster implements GrandMaster{
    String rules;
    SingletonXMLMaster singleton = null;
    SingletonXMLMaster(){ }

    abstract public SingletonXMLMaster getInstance(String xml);
}
