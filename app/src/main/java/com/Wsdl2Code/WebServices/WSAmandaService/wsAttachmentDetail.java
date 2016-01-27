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
import com.Wsdl2Code.WebServices.WSAmandaService.VectorByte;
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class wsAttachmentDetail implements KvmSerializable_ws {
    
    public VectorByte content;
    public String fileName;
    
    public wsAttachmentDetail(){}
    
    public wsAttachmentDetail(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("content"))
        {
            SoapPrimitive j = (SoapPrimitive)soapObject.getProperty("content");
            content = new VectorByte(j);
        }
        if (soapObject.hasProperty("fileName"))
        {
            Object obj = soapObject.getProperty("fileName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fileName = j.toString();
            }else if (obj!= null && obj instanceof String){
                fileName = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return content.toString();
            case 1:
                return fileName;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 2;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "content";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fileName";
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
