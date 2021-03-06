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

public class wsProcessFee implements KvmSerializable_ws {
    
    public int accountBillFeeRSN;
    public boolean accountBillFeeRSNSpecified;
    public double amountLeft;
    public boolean amountLeftSpecified;
    public int billNumber;
    public boolean billNumberSpecified;
    public String comments;
    public String dueDate;
    public boolean dueDateSpecified;
    public double feeAmount;
    public boolean feeAmountSpecified;
    public int feeCode;
    public boolean feeCodeSpecified;
    public String feeDesc;
    public int folderRSN;
    public boolean folderRSNSpecified;
    public String paid;
    public int processRSN;
    public boolean processRSNSpecified;
    
    public wsProcessFee(){}
    
    public wsProcessFee(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("accountBillFeeRSN"))
        {
            Object obj = soapObject.getProperty("accountBillFeeRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                accountBillFeeRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                accountBillFeeRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("accountBillFeeRSNSpecified"))
        {
            Object obj = soapObject.getProperty("accountBillFeeRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                accountBillFeeRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                accountBillFeeRSNSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("amountLeft"))
        {
            Object obj = soapObject.getProperty("amountLeft");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                amountLeft = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                amountLeft = (Double) obj;
            }
        }
        if (soapObject.hasProperty("amountLeftSpecified"))
        {
            Object obj = soapObject.getProperty("amountLeftSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                amountLeftSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                amountLeftSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("billNumber"))
        {
            Object obj = soapObject.getProperty("billNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                billNumber = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                billNumber = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("billNumberSpecified"))
        {
            Object obj = soapObject.getProperty("billNumberSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                billNumberSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                billNumberSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("dueDate"))
        {
            Object obj = soapObject.getProperty("dueDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dueDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                dueDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("dueDateSpecified"))
        {
            Object obj = soapObject.getProperty("dueDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dueDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dueDateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("feeAmount"))
        {
            Object obj = soapObject.getProperty("feeAmount");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeAmount = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                feeAmount = (Double) obj;
            }
        }
        if (soapObject.hasProperty("feeAmountSpecified"))
        {
            Object obj = soapObject.getProperty("feeAmountSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeAmountSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                feeAmountSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("feeCode"))
        {
            Object obj = soapObject.getProperty("feeCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                feeCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("feeCodeSpecified"))
        {
            Object obj = soapObject.getProperty("feeCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                feeCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("feeDesc"))
        {
            Object obj = soapObject.getProperty("feeDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                feeDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                feeDesc = (String) obj;
            }
        }
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
        if (soapObject.hasProperty("paid"))
        {
            Object obj = soapObject.getProperty("paid");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                paid = j.toString();
            }else if (obj!= null && obj instanceof String){
                paid = (String) obj;
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
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return accountBillFeeRSN;
            case 1:
                return accountBillFeeRSNSpecified;
            case 2:
                return amountLeft;
            case 3:
                return amountLeftSpecified;
            case 4:
                return billNumber;
            case 5:
                return billNumberSpecified;
            case 6:
                return comments;
            case 7:
                return dueDate;
            case 8:
                return dueDateSpecified;
            case 9:
                return feeAmount;
            case 10:
                return feeAmountSpecified;
            case 11:
                return feeCode;
            case 12:
                return feeCodeSpecified;
            case 13:
                return feeDesc;
            case 14:
                return folderRSN;
            case 15:
                return folderRSNSpecified;
            case 16:
                return paid;
            case 17:
                return processRSN;
            case 18:
                return processRSNSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 19;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "accountBillFeeRSN";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "accountBillFeeRSNSpecified";
                break;
            case 2:
                info.type = Double.class;
                info.name = "amountLeft";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "amountLeftSpecified";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "billNumber";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "billNumberSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "comments";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dueDate";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dueDateSpecified";
                break;
            case 9:
                info.type = Double.class;
                info.name = "feeAmount";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "feeAmountSpecified";
                break;
            case 11:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "feeCode";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "feeCodeSpecified";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "feeDesc";
                break;
            case 14:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "folderRSN";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "folderRSNSpecified";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "paid";
                break;
            case 17:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "processRSN";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "processRSNSpecified";
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
