package com.Wsdl2Code.WebServices.WSAmandaService;

import org.ksoap2.serialization.PropertyInfo;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Created by BAPI1 on 25-01-2016.
 */
public interface KvmSerializable_ws extends Serializable {
    Object getProperty(int var1);

    int getPropertyCount();

    void setProperty(int var1, Object var2);

    void getPropertyInfo(int var1, Hashtable var2, PropertyInfo var3);

    public String getInnerText();

    public void setInnerText(String s) ;
}
