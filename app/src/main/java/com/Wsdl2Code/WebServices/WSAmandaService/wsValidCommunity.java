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

public class wsValidCommunity implements KvmSerializable_ws {
    
    public int accessCode;
    public boolean accessCodeSpecified;
    public int code;
    public boolean codeSpecified;
    public String comments;
    public String description;
    public int displayOrder;
    public boolean displayOrderSpecified;
    
    public wsValidCommunity(){}
    
    public wsValidCommunity(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("accessCode"))
        {
            Object obj = soapObject.getProperty("accessCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                accessCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                accessCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("accessCodeSpecified"))
        {
            Object obj = soapObject.getProperty("accessCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                accessCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                accessCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("code"))
        {
            Object obj = soapObject.getProperty("code");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                code = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                code = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("codeSpecified"))
        {
            Object obj = soapObject.getProperty("codeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                codeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                codeSpecified = (Boolean) obj;
            }
        }
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
                return accessCode;
            case 1:
                return accessCodeSpecified;
            case 2:
                return code;
            case 3:
                return codeSpecified;
            case 4:
                return comments;
            case 5:
                return description;
            case 6:
                return displayOrder;
            case 7:
                return displayOrderSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 8;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "accessCode";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "accessCodeSpecified";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "code";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "codeSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "comments";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "description";
                break;
            case 6:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "displayOrder";
                break;
            case 7:
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
