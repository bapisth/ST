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

public class wsFoiReleasePackageFolder implements KvmSerializable_ws {
    
    public String attachmentFileName;
    public int attachmentRSN;
    public boolean attachmentRSNSpecified;
    public String dateOnDocument;
    public boolean dateOnDocumentSpecified;
    public String datePublished;
    public boolean datePublishedSpecified;
    public String department;
    public String disposition;
    public int dispositionCode;
    public boolean dispositionCodeSpecified;
    public int folderRSN;
    public boolean folderRSNSpecified;
    public String folderType;
    public String fullText;
    public String reqNNNNN;
    public String year;
    
    public wsFoiReleasePackageFolder(){}
    
    public wsFoiReleasePackageFolder(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("attachmentFileName"))
        {
            Object obj = soapObject.getProperty("attachmentFileName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attachmentFileName = j.toString();
            }else if (obj!= null && obj instanceof String){
                attachmentFileName = (String) obj;
            }
        }
        if (soapObject.hasProperty("attachmentRSN"))
        {
            Object obj = soapObject.getProperty("attachmentRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attachmentRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                attachmentRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("attachmentRSNSpecified"))
        {
            Object obj = soapObject.getProperty("attachmentRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                attachmentRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                attachmentRSNSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("dateOnDocument"))
        {
            Object obj = soapObject.getProperty("dateOnDocument");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateOnDocument = j.toString();
            }else if (obj!= null && obj instanceof String){
                dateOnDocument = (String) obj;
            }
        }
        if (soapObject.hasProperty("dateOnDocumentSpecified"))
        {
            Object obj = soapObject.getProperty("dateOnDocumentSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateOnDocumentSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dateOnDocumentSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("datePublished"))
        {
            Object obj = soapObject.getProperty("datePublished");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                datePublished = j.toString();
            }else if (obj!= null && obj instanceof String){
                datePublished = (String) obj;
            }
        }
        if (soapObject.hasProperty("datePublishedSpecified"))
        {
            Object obj = soapObject.getProperty("datePublishedSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                datePublishedSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                datePublishedSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("department"))
        {
            Object obj = soapObject.getProperty("department");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                department = j.toString();
            }else if (obj!= null && obj instanceof String){
                department = (String) obj;
            }
        }
        if (soapObject.hasProperty("disposition"))
        {
            Object obj = soapObject.getProperty("disposition");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                disposition = j.toString();
            }else if (obj!= null && obj instanceof String){
                disposition = (String) obj;
            }
        }
        if (soapObject.hasProperty("dispositionCode"))
        {
            Object obj = soapObject.getProperty("dispositionCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dispositionCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                dispositionCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("dispositionCodeSpecified"))
        {
            Object obj = soapObject.getProperty("dispositionCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dispositionCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dispositionCodeSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("folderType"))
        {
            Object obj = soapObject.getProperty("folderType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                folderType = j.toString();
            }else if (obj!= null && obj instanceof String){
                folderType = (String) obj;
            }
        }
        if (soapObject.hasProperty("fullText"))
        {
            Object obj = soapObject.getProperty("fullText");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                fullText = j.toString();
            }else if (obj!= null && obj instanceof String){
                fullText = (String) obj;
            }
        }
        if (soapObject.hasProperty("reqNNNNN"))
        {
            Object obj = soapObject.getProperty("reqNNNNN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                reqNNNNN = j.toString();
            }else if (obj!= null && obj instanceof String){
                reqNNNNN = (String) obj;
            }
        }
        if (soapObject.hasProperty("year"))
        {
            Object obj = soapObject.getProperty("year");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                year = j.toString();
            }else if (obj!= null && obj instanceof String){
                year = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return attachmentFileName;
            case 1:
                return attachmentRSN;
            case 2:
                return attachmentRSNSpecified;
            case 3:
                return dateOnDocument;
            case 4:
                return dateOnDocumentSpecified;
            case 5:
                return datePublished;
            case 6:
                return datePublishedSpecified;
            case 7:
                return department;
            case 8:
                return disposition;
            case 9:
                return dispositionCode;
            case 10:
                return dispositionCodeSpecified;
            case 11:
                return folderRSN;
            case 12:
                return folderRSNSpecified;
            case 13:
                return folderType;
            case 14:
                return fullText;
            case 15:
                return reqNNNNN;
            case 16:
                return year;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 17;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "attachmentFileName";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "attachmentRSN";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "attachmentRSNSpecified";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dateOnDocument";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dateOnDocumentSpecified";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "datePublished";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "datePublishedSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "department";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "disposition";
                break;
            case 9:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "dispositionCode";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dispositionCodeSpecified";
                break;
            case 11:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "folderRSN";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "folderRSNSpecified";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "folderType";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fullText";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "reqNNNNN";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "year";
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
