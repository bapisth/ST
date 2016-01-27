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
import com.Wsdl2Code.WebServices.WSAmandaService.VectorObject;
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class sendEmailWithAttachmentByContent implements KvmSerializable_ws {
    
    public String toEmail;
    public String fromEmail;
    public String ccEmail;
    public String bccEmail;
    public String subject;
    public VectorObject wSAttachmentDetail;
    public String body;
    
    public sendEmailWithAttachmentByContent(){}
    
    public sendEmailWithAttachmentByContent(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("toEmail"))
        {
            Object obj = soapObject.getProperty("toEmail");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                toEmail = j.toString();
            }else if (obj!= null && obj instanceof String){
                toEmail = (String) obj;
            }
        }
        if (soapObject.hasProperty("fromEmail"))
        {
            Object obj = soapObject.getProperty("fromEmail");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fromEmail = j.toString();
            }else if (obj!= null && obj instanceof String){
                fromEmail = (String) obj;
            }
        }
        if (soapObject.hasProperty("ccEmail"))
        {
            Object obj = soapObject.getProperty("ccEmail");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ccEmail = j.toString();
            }else if (obj!= null && obj instanceof String){
                ccEmail = (String) obj;
            }
        }
        if (soapObject.hasProperty("bccEmail"))
        {
            Object obj = soapObject.getProperty("bccEmail");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                bccEmail = j.toString();
            }else if (obj!= null && obj instanceof String){
                bccEmail = (String) obj;
            }
        }
        if (soapObject.hasProperty("subject"))
        {
            Object obj = soapObject.getProperty("subject");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                subject = j.toString();
            }else if (obj!= null && obj instanceof String){
                subject = (String) obj;
            }
        }
        if (soapObject.hasProperty("WSAttachmentDetail"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("WSAttachmentDetail");
            wSAttachmentDetail = new VectorObject(j);
        }
        if (soapObject.hasProperty("body"))
        {
            Object obj = soapObject.getProperty("body");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                body = j.toString();
            }else if (obj!= null && obj instanceof String){
                body = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return toEmail;
            case 1:
                return fromEmail;
            case 2:
                return ccEmail;
            case 3:
                return bccEmail;
            case 4:
                return subject;
            case 5:
                return wSAttachmentDetail;
            case 6:
                return body;
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
                info.name = "toEmail";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fromEmail";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ccEmail";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "bccEmail";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "subject";
                break;
            case 5:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "WSAttachmentDetail";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "body";
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
