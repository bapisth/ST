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

public class getValidFolderComplaintORCorrection implements KvmSerializable_ws {
    
    public boolean isComplaint;
    public boolean isCorrection;
    public boolean checkWebFlag;
    
    public getValidFolderComplaintORCorrection(){}
    
    public getValidFolderComplaintORCorrection(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("isComplaint"))
        {
            Object obj = soapObject.getProperty("isComplaint");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                isComplaint = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                isComplaint = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("isCorrection"))
        {
            Object obj = soapObject.getProperty("isCorrection");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                isCorrection = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                isCorrection = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("checkWebFlag"))
        {
            Object obj = soapObject.getProperty("checkWebFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                checkWebFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                checkWebFlag = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return isComplaint;
            case 1:
                return isCorrection;
            case 2:
                return checkWebFlag;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 3;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "isComplaint";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "isCorrection";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "checkWebFlag";
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