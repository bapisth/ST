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

public class wsCustomReport implements KvmSerializable_ws {
    
    public String contentType;
    public int correspondenceRSN;
    public VectorByte reportContent;
    public String reportName;
    
    public wsCustomReport(){}
    
    public wsCustomReport(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("contentType"))
        {
            Object obj = soapObject.getProperty("contentType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                contentType = j.toString();
            }else if (obj!= null && obj instanceof String){
                contentType = (String) obj;
            }
        }
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
        if (soapObject.hasProperty("reportContent"))
        {
            SoapPrimitive j = (SoapPrimitive)soapObject.getProperty("reportContent");
            reportContent = new VectorByte(j);
        }
        if (soapObject.hasProperty("reportName"))
        {
            Object obj = soapObject.getProperty("reportName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                reportName = j.toString();
            }else if (obj!= null && obj instanceof String){
                reportName = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return contentType;
            case 1:
                return correspondenceRSN;
            case 2:
                return reportContent.toString();
            case 3:
                return reportName;
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
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "contentType";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "correspondenceRSN";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "reportContent";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "reportName";
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