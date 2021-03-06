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

public class wsFolderProcessAttempt implements KvmSerializable_ws {
    
    public String attemptBy;
    public String attemptComment;
    public String attemptDate;
    public boolean attemptDateSpecified;
    public int attemptRSN;
    public boolean attemptRSNSpecified;
    public double expenseAmount;
    public boolean expenseAmountSpecified;
    public double hourSpent;
    public boolean hourSpentSpecified;
    public double mileageAmount;
    public boolean mileageAmountSpecified;
    public double overTime;
    public boolean overTimeSpecified;
    public int processRSN;
    public boolean processRSNSpecified;
    public int resultCode;
    public boolean resultCodeSpecified;
    public String scheduleDate;
    public boolean scheduleDateSpecified;
    public String stampDate;
    public boolean stampDateSpecified;
    public String stampUser;
    public String timeUnit;
    
    public wsFolderProcessAttempt(){}
    
    public wsFolderProcessAttempt(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("attemptBy"))
        {
            Object obj = soapObject.getProperty("attemptBy");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attemptBy = j.toString();
            }else if (obj!= null && obj instanceof String){
                attemptBy = (String) obj;
            }
        }
        if (soapObject.hasProperty("attemptComment"))
        {
            Object obj = soapObject.getProperty("attemptComment");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attemptComment = j.toString();
            }else if (obj!= null && obj instanceof String){
                attemptComment = (String) obj;
            }
        }
        if (soapObject.hasProperty("attemptDate"))
        {
            Object obj = soapObject.getProperty("attemptDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attemptDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                attemptDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("attemptDateSpecified"))
        {
            Object obj = soapObject.getProperty("attemptDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attemptDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                attemptDateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("attemptRSN"))
        {
            Object obj = soapObject.getProperty("attemptRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attemptRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                attemptRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("attemptRSNSpecified"))
        {
            Object obj = soapObject.getProperty("attemptRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attemptRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                attemptRSNSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("expenseAmount"))
        {
            Object obj = soapObject.getProperty("expenseAmount");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                expenseAmount = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                expenseAmount = (Double) obj;
            }
        }
        if (soapObject.hasProperty("expenseAmountSpecified"))
        {
            Object obj = soapObject.getProperty("expenseAmountSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                expenseAmountSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                expenseAmountSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("hourSpent"))
        {
            Object obj = soapObject.getProperty("hourSpent");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                hourSpent = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                hourSpent = (Double) obj;
            }
        }
        if (soapObject.hasProperty("hourSpentSpecified"))
        {
            Object obj = soapObject.getProperty("hourSpentSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                hourSpentSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                hourSpentSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("mileageAmount"))
        {
            Object obj = soapObject.getProperty("mileageAmount");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mileageAmount = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                mileageAmount = (Double) obj;
            }
        }
        if (soapObject.hasProperty("mileageAmountSpecified"))
        {
            Object obj = soapObject.getProperty("mileageAmountSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mileageAmountSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mileageAmountSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("overTime"))
        {
            Object obj = soapObject.getProperty("overTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                overTime = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                overTime = (Double) obj;
            }
        }
        if (soapObject.hasProperty("overTimeSpecified"))
        {
            Object obj = soapObject.getProperty("overTimeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                overTimeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                overTimeSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("resultCode"))
        {
            Object obj = soapObject.getProperty("resultCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                resultCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                resultCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("resultCodeSpecified"))
        {
            Object obj = soapObject.getProperty("resultCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                resultCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                resultCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("scheduleDate"))
        {
            Object obj = soapObject.getProperty("scheduleDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                scheduleDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                scheduleDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("scheduleDateSpecified"))
        {
            Object obj = soapObject.getProperty("scheduleDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                scheduleDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                scheduleDateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("stampDate"))
        {
            Object obj = soapObject.getProperty("stampDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                stampDate = j.toString();
            }else if (obj!= null && obj instanceof String){
                stampDate = (String) obj;
            }
        }
        if (soapObject.hasProperty("stampDateSpecified"))
        {
            Object obj = soapObject.getProperty("stampDateSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                stampDateSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                stampDateSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("stampUser"))
        {
            Object obj = soapObject.getProperty("stampUser");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                stampUser = j.toString();
            }else if (obj!= null && obj instanceof String){
                stampUser = (String) obj;
            }
        }
        if (soapObject.hasProperty("timeUnit"))
        {
            Object obj = soapObject.getProperty("timeUnit");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                timeUnit = j.toString();
            }else if (obj!= null && obj instanceof String){
                timeUnit = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return attemptBy;
            case 1:
                return attemptComment;
            case 2:
                return attemptDate;
            case 3:
                return attemptDateSpecified;
            case 4:
                return attemptRSN;
            case 5:
                return attemptRSNSpecified;
            case 6:
                return expenseAmount;
            case 7:
                return expenseAmountSpecified;
            case 8:
                return hourSpent;
            case 9:
                return hourSpentSpecified;
            case 10:
                return mileageAmount;
            case 11:
                return mileageAmountSpecified;
            case 12:
                return overTime;
            case 13:
                return overTimeSpecified;
            case 14:
                return processRSN;
            case 15:
                return processRSNSpecified;
            case 16:
                return resultCode;
            case 17:
                return resultCodeSpecified;
            case 18:
                return scheduleDate;
            case 19:
                return scheduleDateSpecified;
            case 20:
                return stampDate;
            case 21:
                return stampDateSpecified;
            case 22:
                return stampUser;
            case 23:
                return timeUnit;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 24;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "attemptBy";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "attemptComment";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "attemptDate";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "attemptDateSpecified";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "attemptRSN";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "attemptRSNSpecified";
                break;
            case 6:
                info.type = Double.class;
                info.name = "expenseAmount";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "expenseAmountSpecified";
                break;
            case 8:
                info.type = Double.class;
                info.name = "hourSpent";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "hourSpentSpecified";
                break;
            case 10:
                info.type = Double.class;
                info.name = "mileageAmount";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "mileageAmountSpecified";
                break;
            case 12:
                info.type = Double.class;
                info.name = "overTime";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "overTimeSpecified";
                break;
            case 14:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "processRSN";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "processRSNSpecified";
                break;
            case 16:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "resultCode";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "resultCodeSpecified";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "scheduleDate";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "scheduleDateSpecified";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "stampDate";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "stampDateSpecified";
                break;
            case 22:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "stampUser";
                break;
            case 23:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "timeUnit";
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
