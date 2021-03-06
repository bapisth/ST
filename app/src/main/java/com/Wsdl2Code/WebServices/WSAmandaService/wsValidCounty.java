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

public class wsValidCounty implements KvmSerializable_ws {
    
    public String comments;
    public int countyCode;
    public boolean countyCodeSpecified;
    public String countyDesc;
    public int displayOrder;
    public boolean displayOrderSpecified;
    
    public wsValidCounty(){}
    
    public wsValidCounty(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("comments"))
        {
            Object obj = soapObject.getProperty("comments");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                comments = j.toString();
            }else if (obj!= null && obj instanceof String){
                comments = (String) obj;
            }
        }
        if (soapObject.hasProperty("countyCode"))
        {
            Object obj = soapObject.getProperty("countyCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                countyCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                countyCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("countyCodeSpecified"))
        {
            Object obj = soapObject.getProperty("countyCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                countyCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                countyCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("countyDesc"))
        {
            Object obj = soapObject.getProperty("countyDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                countyDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                countyDesc = (String) obj;
            }
        }
        if (soapObject.hasProperty("displayOrder"))
        {
            Object obj = soapObject.getProperty("displayOrder");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                displayOrder = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                displayOrder = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("displayOrderSpecified"))
        {
            Object obj = soapObject.getProperty("displayOrderSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                displayOrderSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                displayOrderSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return comments;
            case 1:
                return countyCode;
            case 2:
                return countyCodeSpecified;
            case 3:
                return countyDesc;
            case 4:
                return displayOrder;
            case 5:
                return displayOrderSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 6;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "comments";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "countyCode";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "countyCodeSpecified";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "countyDesc";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "displayOrder";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "displayOrderSpecified";
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
