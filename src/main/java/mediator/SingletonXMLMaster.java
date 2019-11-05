package mediator;

import java.util.ArrayList;

/*
    Make GrandMaster Singleton
    Here we assume that the master can read a configuration from outer
    xml file.
 */
abstract public class SingletonXMLMaster implements GrandMaster{
    //存储所有挂钩的分支
    ArrayList branches = null;
    //模拟信息缓冲区
    ArrayList buffer = null;
    //模拟从XML中读出的设置
    String rules;
    //单例属性
    SingletonXMLMaster singleton = null;
    //PackageWise
    SingletonXMLMaster(){ }

    public static <INFOTYPE> SingletonXMLMaster getInstance(String xml){return null;}
}
