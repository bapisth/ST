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

public class cancelInspection implements KvmSerializable_ws {
    
    public int folderRSN;
    public boolean folderRSNSpecified;
    public int processRSN;
    public boolean processRSNSpecified;
    public int attemptResultCode;
    public boolean attemptResultCodeSpecified;
    public String comments;
    
    public cancelInspection(){}
    
    public cancelInspection(SoapObject soapObject)
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
        if (soapObject.hasProperty("attemptResultCode"))
        {
            Object obj = soapObject.getProperty("attemptResultCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attemptResultCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                attemptResultCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("attemptResultCodeSpecified"))
        {
            Object obj = soapObject.getProperty("attemptResultCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attemptResultCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                attemptResultCodeSpecified = (Boolean) obj;
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
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return folderRSN;
            case 1:
                return folderRSNSpecified;
            case 2:
                return processRSN;
            case 3:
                return processRSNSpecified;
            case 4:
                return attemptResultCode;
            case 5:
                return attemptResultCodeSpecified;
            case 6:
                return comments;
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
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "folderRSN";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "folderRSNSpecified";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "processRSN";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "processRSNSpecified";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "attemptResultCode";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "attemptResultCodeSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "comments";
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
