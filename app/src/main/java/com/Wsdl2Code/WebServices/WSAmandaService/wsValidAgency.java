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

public class wsValidAgency implements KvmSerializable_ws {
    
    public int accessCode;
    public boolean accessCodeSpecified;
    public String comments;
    public int parentRowLevelSecurityCode;
    public boolean parentRowLevelSecurityCodeSpecified;
    public int rowLevelSecurityCode;
    public boolean rowLevelSecurityCodeSpecified;
    public String rowLevelSecurityDesc;
    public String stampDate;
    public boolean stampDateSpecified;
    public String stampUser;
    
    public wsValidAgency(){}
    
    public wsValidAgency(SoapObject soapObject)
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
        if (soapObject.hasProperty("parentRowLevelSecurityCode"))
        {
            Object obj = soapObject.getProperty("parentRowLevelSecurityCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                parentRowLevelSecurityCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                parentRowLevelSecurityCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("parentRowLevelSecurityCodeSpecified"))
        {
            Object obj = soapObject.getProperty("parentRowLevelSecurityCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                parentRowLevelSecurityCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                parentRowLevelSecurityCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("rowLevelSecurityCode"))
        {
            Object obj = soapObject.getProperty("rowLevelSecurityCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                rowLevelSecurityCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                rowLevelSecurityCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("rowLevelSecurityCodeSpecified"))
        {
            Object obj = soapObject.getProperty("rowLevelSecurityCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                rowLevelSecurityCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                rowLevelSecurityCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("rowLevelSecurityDesc"))
        {
            Object obj = soapObject.getProperty("rowLevelSecurityDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                rowLevelSecurityDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                rowLevelSecurityDesc = (String) obj;
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
                return accessCode;
            case 1:
                return accessCodeSpecified;
            case 2:
                return comments;
            case 3:
                return parentRowLevelSecurityCode;
            case 4:
                return parentRowLevelSecurityCodeSpecified;
            case 5:
                return rowLevelSecurityCode;
            case 6:
                return rowLevelSecurityCodeSpecified;
            case 7:
                return rowLevelSecurityDesc;
            case 8:
                return stampDate;
            case 9:
                return stampDateSpecified;
            case 10:
                return stampUser;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 11;
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "comments";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "parentRowLevelSecurityCode";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "parentRowLevelSecurityCodeSpecified";
                break;
            case 5:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "rowLevelSecurityCode";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "rowLevelSecurityCodeSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "rowLevelSecurityDesc";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "stampDate";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "stampDateSpecified";
                break;
            case 10:
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