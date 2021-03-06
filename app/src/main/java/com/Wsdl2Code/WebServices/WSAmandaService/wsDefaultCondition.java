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

public class wsDefaultCondition implements KvmSerializable_ws {
    
    public String comments;
    public String conditionDesc;
    public int displayOrder;
    public String folderType;
    public String stampDate;
    public boolean stampDateSpecified;
    public String stampUser;
    
    public wsDefaultCondition(){}
    
    public wsDefaultCondition(SoapObject soapObject)
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
        if (soapObject.hasProperty("conditionDesc"))
        {
            Object obj = soapObject.getProperty("conditionDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                conditionDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                conditionDesc = (String) obj;
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
        if (soapObject.hasProperty("folderType"))
        {
            Object obj = soapObject.getProperty("folderType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                folderType = j.toString();
            }else if (obj!= null && obj instanceof String){
                folderType = (String) obj;
            }
        }
        if (soapObject.hasProperty("stampDate"))
        {
            Object obj = soapObject.getProperty("stampDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                stampDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                stampDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("stampDateSpecified"))
        {
            Object obj = soapObject.getProperty("stampDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                stampDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                stampDateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("stampUser"))
        {
            Object obj = soapObject.getProperty("stampUser");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                stampUser = j.toString();
            }else if (obj!= null && obj instanceof String){
                stampUser = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return comments;
            case 1:
                return conditionDesc;
            case 2:
                return displayOrder;
            case 3:
                return folderType;
            case 4:
                return stampDate;
            case 5:
                return stampDateSpecified;
            case 6:
                return stampUser;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 7;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "comments";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "conditionDesc";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "displayOrder";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "folderType";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "stampDate";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "stampDateSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "stampUser";
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
