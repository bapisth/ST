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

public class findWebPaymentLogByLogRSN implements KvmSerializable_ws {
    
    public int arg0;
    public boolean arg0Specified;
    
    public findWebPaymentLogByLogRSN(){}
    
    public findWebPaymentLogByLogRSN(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("arg0"))
        {
            Object obj = soapObject.getProperty("arg0");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                arg0 = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                arg0 = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("arg0Specified"))
        {
            Object obj = soapObject.getProperty("arg0Specified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                arg0Specified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                arg0Specified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return arg0;
            case 1:
                return arg0Specified;
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
                info.name = "arg0";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "arg0Specified";
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
