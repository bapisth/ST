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
import com.Wsdl2Code.WebServices.WSAmandaService.VectorwsValidAttachmentInfoValue;
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class wsValidAttachmentInfo implements KvmSerializable_ws {
    
    public int attachmentInfoCode;
    public boolean attachmentInfoCodeSpecified;
    public String attachmentInfoDesc;
    public String attachmentInfoType;
    public String comments;
    public int pickSelectCode;
    public boolean pickSelectCodeSpecified;
    public int statisticAttachmentInfo;
    public boolean statisticAttachmentInfoSpecified;
    public VectorwsValidAttachmentInfoValue validAttachmentInfoValues;
    
    public wsValidAttachmentInfo(){}
    
    public wsValidAttachmentInfo(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("attachmentInfoCode"))
        {
            Object obj = soapObject.getProperty("attachmentInfoCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attachmentInfoCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                attachmentInfoCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("attachmentInfoCodeSpecified"))
        {
            Object obj = soapObject.getProperty("attachmentInfoCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attachmentInfoCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                attachmentInfoCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("attachmentInfoDesc"))
        {
            Object obj = soapObject.getProperty("attachmentInfoDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attachmentInfoDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                attachmentInfoDesc = (String) obj;
            }
        }
        if (soapObject.hasProperty("attachmentInfoType"))
        {
            Object obj = soapObject.getProperty("attachmentInfoType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attachmentInfoType = j.toString();
            }else if (obj!= null && obj instanceof String){
                attachmentInfoType = (String) obj;
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
        if (soapObject.hasProperty("pickSelectCode"))
        {
            Object obj = soapObject.getProperty("pickSelectCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pickSelectCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                pickSelectCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("pickSelectCodeSpecified"))
        {
            Object obj = soapObject.getProperty("pickSelectCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pickSelectCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pickSelectCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("statisticAttachmentInfo"))
        {
            Object obj = soapObject.getProperty("statisticAttachmentInfo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                statisticAttachmentInfo = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                statisticAttachmentInfo = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("statisticAttachmentInfoSpecified"))
        {
            Object obj = soapObject.getProperty("statisticAttachmentInfoSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                statisticAttachmentInfoSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                statisticAttachmentInfoSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("validAttachmentInfoValues"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("validAttachmentInfoValues");
            validAttachmentInfoValues = new VectorwsValidAttachmentInfoValue(j);
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return attachmentInfoCode;
            case 1:
                return attachmentInfoCodeSpecified;
            case 2:
                return attachmentInfoDesc;
            case 3:
                return attachmentInfoType;
            case 4:
                return comments;
            case 5:
                return pickSelectCode;
            case 6:
                return pickSelectCodeSpecified;
            case 7:
                return statisticAttachmentInfo;
            case 8:
                return statisticAttachmentInfoSpecified;
            case 9:
                return validAttachmentInfoValues;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 10;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "attachmentInfoCode";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "attachmentInfoCodeSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "attachmentInfoDesc";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "attachmentInfoType";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "comments";
                break;
            case 5:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "pickSelectCode";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "pickSelectCodeSpecified";
                break;
            case 7:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "statisticAttachmentInfo";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "statisticAttachmentInfoSpecified";
                break;
            case 9:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "validAttachmentInfoValues";
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
