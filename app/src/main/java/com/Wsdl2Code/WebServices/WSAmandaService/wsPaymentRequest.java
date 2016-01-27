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
import com.Wsdl2Code.WebServices.WSAmandaService.VectorwsPaymentDetailsRequest;
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class wsPaymentRequest implements KvmSerializable_ws {
    
    public int billToRSN;
    public boolean billToRSNSpecified;
    public VectorwsPaymentDetailsRequest feeRequests;
    public double fullPaymentAmount;
    public boolean fullPaymentAmountSpecified;
    public int locationCode;
    public boolean locationCodeSpecified;
    public String paymentComment;
    public String paymentDate;
    public boolean paymentDateSpecified;
    public String paymentEffectiveDate;
    public boolean paymentEffectiveDateSpecified;
    public String paymentType;
    public long receiptNumber;
    public boolean receiptNumberSpecified;
    
    public wsPaymentRequest(){}
    
    public wsPaymentRequest(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("billToRSN"))
        {
            Object obj = soapObject.getProperty("billToRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                billToRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                billToRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("billToRSNSpecified"))
        {
            Object obj = soapObject.getProperty("billToRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                billToRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                billToRSNSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("feeRequests"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("feeRequests");
            feeRequests = new VectorwsPaymentDetailsRequest(j);
        }
        if (soapObject.hasProperty("fullPaymentAmount"))
        {
            Object obj = soapObject.getProperty("fullPaymentAmount");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fullPaymentAmount = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                fullPaymentAmount = (Double) obj;
            }
        }
        if (soapObject.hasProperty("fullPaymentAmountSpecified"))
        {
            Object obj = soapObject.getProperty("fullPaymentAmountSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fullPaymentAmountSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                fullPaymentAmountSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("locationCode"))
        {
            Object obj = soapObject.getProperty("locationCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                locationCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("locationCodeSpecified"))
        {
            Object obj = soapObject.getProperty("locationCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                locationCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("paymentComment"))
        {
            Object obj = soapObject.getProperty("paymentComment");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                paymentComment = j.toString();
            }else if (obj!= null && obj instanceof String){
                paymentComment = (String) obj;
            }
        }
        if (soapObject.hasProperty("paymentDate"))
        {
            Object obj = soapObject.getProperty("paymentDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                paymentDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                paymentDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("paymentDateSpecified"))
        {
            Object obj = soapObject.getProperty("paymentDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                paymentDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                paymentDateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("paymentEffectiveDate"))
        {
            Object obj = soapObject.getProperty("paymentEffectiveDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                paymentEffectiveDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                paymentEffectiveDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("paymentEffectiveDateSpecified"))
        {
            Object obj = soapObject.getProperty("paymentEffectiveDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                paymentEffectiveDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                paymentEffectiveDateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("paymentType"))
        {
            Object obj = soapObject.getProperty("paymentType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                paymentType = j.toString();
            }else if (obj!= null && obj instanceof String){
                paymentType = (String) obj;
            }
        }
        if (soapObject.hasProperty("receiptNumber"))
        {
            Object obj = soapObject.getProperty("receiptNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                receiptNumber = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                receiptNumber = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("receiptNumberSpecified"))
        {
            Object obj = soapObject.getProperty("receiptNumberSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                receiptNumberSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                receiptNumberSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return billToRSN;
            case 1:
                return billToRSNSpecified;
            case 2:
                return feeRequests;
            case 3:
                return fullPaymentAmount;
            case 4:
                return fullPaymentAmountSpecified;
            case 5:
                return locationCode;
            case 6:
                return locationCodeSpecified;
            case 7:
                return paymentComment;
            case 8:
                return paymentDate;
            case 9:
                return paymentDateSpecified;
            case 10:
                return paymentEffectiveDate;
            case 11:
                return paymentEffectiveDateSpecified;
            case 12:
                return paymentType;
            case 13:
                return receiptNumber;
            case 14:
                return receiptNumberSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 15;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "billToRSN";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "billToRSNSpecified";
                break;
            case 2:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "feeRequests";
                break;
            case 3:
                info.type = Double.class;
                info.name = "fullPaymentAmount";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "fullPaymentAmountSpecified";
                break;
            case 5:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "locationCode";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "locationCodeSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "paymentComment";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "paymentDate";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "paymentDateSpecified";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "paymentEffectiveDate";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "paymentEffectiveDateSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "paymentType";
                break;
            case 13:
                info.type = Long.class;
                info.name = "receiptNumber";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "receiptNumberSpecified";
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
