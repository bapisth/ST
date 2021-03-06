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
import com.Wsdl2Code.WebServices.WSAmandaService.VectorwsDisplayOptionFlag;
import com.Wsdl2Code.WebServices.WSAmandaService.VectorInt32;
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class getFolderAttachment implements KvmSerializable_ws {
    
    public int folderRSN;
    public boolean folderRSNSpecified;
    public VectorwsDisplayOptionFlag displayOptions;
    public VectorInt32 attachmentStatusCode;
    
    public getFolderAttachment(){}
    
    public getFolderAttachment(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("folderRSN"))
        {
            Object obj = soapObject.getProperty("folderRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                folderRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                folderRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("folderRSNSpecified"))
        {
            Object obj = soapObject.getProperty("folderRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                folderRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                folderRSNSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("displayOptions"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("displayOptions");
            displayOptions = new VectorwsDisplayOptionFlag(j);
        }
        if (soapObject.hasProperty("attachmentStatusCode"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("attachmentStatusCode");
            attachmentStatusCode = new VectorInt32(j);
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return folderRSN;
            case 1:
                return folderRSNSpecified;
            case 2:
                return displayOptions;
            case 3:
                return attachmentStatusCode;
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
                info.name = "folderRSN";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "folderRSNSpecified";
                break;
            case 2:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "displayOptions";
                break;
            case 3:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "attachmentStatusCode";
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
