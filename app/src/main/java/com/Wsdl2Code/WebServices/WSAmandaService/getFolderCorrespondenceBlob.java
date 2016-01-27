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

public class getFolderCorrespondenceBlob implements KvmSerializable_ws {
    
    public int correspondenceRSN;
    public boolean correspondenceRSNSpecified;
    
    public getFolderCorrespondenceBlob(){}
    
    public getFolderCorrespondenceBlob(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("correspondenceRSN"))
        {
            Object obj = soapObject.getProperty("correspondenceRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                correspondenceRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                correspondenceRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("correspondenceRSNSpecified"))
        {
            Object obj = soapObject.getProperty("correspondenceRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                correspondenceRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                correspondenceRSNSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return correspondenceRSN;
            case 1:
                return correspondenceRSNSpecified;
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
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "correspondenceRSN";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "correspondenceRSNSpecified";
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
