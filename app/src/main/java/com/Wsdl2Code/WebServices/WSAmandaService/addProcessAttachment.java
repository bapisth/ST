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
import com.Wsdl2Code.WebServices.WSAmandaService.wsAttachment;
import com.Wsdl2Code.WebServices.WSAmandaService.wsAttachmentContent;
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class addProcessAttachment implements KvmSerializable_ws {
    
    public int processRSN;
    public boolean processRSNSpecified;
    public wsAttachment attachment;
    public wsAttachmentContent attachmentContent;
    
    public addProcessAttachment(){}
    
    public addProcessAttachment(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("processRSN"))
        {
            Object obj = soapObject.getProperty("processRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                processRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                processRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("processRSNSpecified"))
        {
            Object obj = soapObject.getProperty("processRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                processRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                processRSNSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("attachment"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("attachment");
            attachment =  new wsAttachment (j);
            
        }
        if (soapObject.hasProperty("attachmentContent"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("attachmentContent");
            attachmentContent =  new wsAttachmentContent (j);
            
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return processRSN;
            case 1:
                return processRSNSpecified;
            case 2:
                return attachment;
            case 3:
                return attachmentContent;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 4;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "processRSN";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "processRSNSpecified";
                break;
            case 2:
                info.type = wsAttachment.class;
                info.name = "attachment";
                break;
            case 3:
                info.type = wsAttachmentContent.class;
                info.name = "attachmentContent";
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