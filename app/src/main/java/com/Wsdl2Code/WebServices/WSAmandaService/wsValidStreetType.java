package com.Wsdl2Code.WebServices.WSAmandaService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 1/24/2016 9:16:23 PM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class wsValidStreetType implements KvmSerializable_ws {
    
    public String alias;
    public String description;
    public String id;
    public int languageCode;
    public boolean languageCodeSpecified;
    
    public wsValidStreetType(){}
    
    public wsValidStreetType(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("alias"))
        {
            Object obj = soapObject.getProperty("alias");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                alias = j.toString();
            }else if (obj!= null && obj instanceof String){
                alias = (String) obj;
            }
        }
        if (soapObject.hasProperty("description"))
        {
            Object obj = soapObject.getProperty("description");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                description = j.toString();
            }else if (obj!= null && obj instanceof String){
                description = (String) obj;
            }
        }
        if (soapObject.hasProperty("id"))
        {
            Object obj = soapObject.getProperty("id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                id = j.toString();
            }else if (obj!= null && obj instanceof String){
                id = (String) obj;
            }
        }
        if (soapObject.hasProperty("languageCode"))
        {
            Object obj = soapObject.getProperty("languageCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                languageCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                languageCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("languageCodeSpecified"))
        {
            Object obj = soapObject.getProperty("languageCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                languageCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                languageCodeSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return alias;
            case 1:
                return description;
            case 2:
                return id;
            case 3:
                return languageCode;
            case 4:
                return languageCodeSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 5;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "alias";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "id";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "languageCode";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "languageCodeSpecified";
                break;
        }
    }
    
    @Override
    public String getInnerText() {
        return null;
    }
    
    
    @Override
    public void setInnerText(String s) {
    }
    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
