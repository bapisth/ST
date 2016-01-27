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
import com.Wsdl2Code.WebServices.WSAmandaService.VectorwsTransactionRequest;
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class executeCustomTransaction implements KvmSerializable_ws {
    
    public int transactionCode;
    public boolean transactionCodeSpecified;
    public VectorwsTransactionRequest transactionParameters;
    
    public executeCustomTransaction(){}
    
    public executeCustomTransaction(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("transactionCode"))
        {
            Object obj = soapObject.getProperty("transactionCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                transactionCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                transactionCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("transactionCodeSpecified"))
        {
            Object obj = soapObject.getProperty("transactionCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                transactionCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                transactionCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("transactionParameters"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("transactionParameters");
            transactionParameters = new VectorwsTransactionRequest(j);
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return transactionCode;
            case 1:
                return transactionCodeSpecified;
            case 2:
                return transactionParameters;
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
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "transactionCode";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "transactionCodeSpecified";
                break;
            case 2:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "transactionParameters";
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