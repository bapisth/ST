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

public class wsFolderDocument implements KvmSerializable_ws {
    
    public String dateDue;
    public boolean dateDueSpecified;
    public String dateGenerated;
    public boolean dateGeneratedSpecified;
    public String dateReceivedReply;
    public boolean dateReceivedReplySpecified;
    public String dateSent;
    public boolean dateSentSpecified;
    public int displayOrder;
    public boolean displayOrderSpecified;
    public int documentCode;
    public boolean documentCodeSpecified;
    public String documentComment;
    public String documentDesc;
    public String documentName;
    public int documentRSN;
    public boolean documentRSNSpecified;
    public int documentStatus;
    public boolean documentStatusSpecified;
    public String documentSuffix;
    public String dosPath;
    public String eDMSID;
    public int folderRSN;
    public boolean folderRSNSpecified;
    public String generationType;
    public int peopleRSN;
    public boolean peopleRSNSpecified;
    public boolean pleaseGenerateFlag;
    public boolean pleaseGenerateFlagSpecified;
    public int securityCode;
    public boolean securityCodeSpecified;
    
    public wsFolderDocument(){}
    
    public wsFolderDocument(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("dateDue"))
        {
            Object obj = soapObject.getProperty("dateDue");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateDue = j.toString();
            }else if (obj!= null && obj instanceof String){
                dateDue = (String) obj;
            }
        }
        if (soapObject.hasProperty("dateDueSpecified"))
        {
            Object obj = soapObject.getProperty("dateDueSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateDueSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dateDueSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("dateGenerated"))
        {
            Object obj = soapObject.getProperty("dateGenerated");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateGenerated = j.toString();
            }else if (obj!= null && obj instanceof String){
                dateGenerated = (String) obj;
            }
        }
        if (soapObject.hasProperty("dateGeneratedSpecified"))
        {
            Object obj = soapObject.getProperty("dateGeneratedSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateGeneratedSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dateGeneratedSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("dateReceivedReply"))
        {
            Object obj = soapObject.getProperty("dateReceivedReply");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateReceivedReply = j.toString();
            }else if (obj!= null && obj instanceof String){
                dateReceivedReply = (String) obj;
            }
        }
        if (soapObject.hasProperty("dateReceivedReplySpecified"))
        {
            Object obj = soapObject.getProperty("dateReceivedReplySpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateReceivedReplySpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dateReceivedReplySpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("dateSent"))
        {
            Object obj = soapObject.getProperty("dateSent");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateSent = j.toString();
            }else if (obj!= null && obj instanceof String){
                dateSent = (String) obj;
            }
        }
        if (soapObject.hasProperty("dateSentSpecified"))
        {
            Object obj = soapObject.getProperty("dateSentSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dateSentSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                dateSentSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("displayOrder"))
        {
            Object obj = soapObject.getProperty("displayOrder");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                displayOrder = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                displayOrder = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("displayOrderSpecified"))
        {
            Object obj = soapObject.getProperty("displayOrderSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                displayOrderSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                displayOrderSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("documentCode"))
        {
            Object obj = soapObject.getProperty("documentCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documentCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                documentCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("documentCodeSpecified"))
        {
            Object obj = soapObject.getProperty("documentCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documentCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                documentCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("documentComment"))
        {
            Object obj = soapObject.getProperty("documentComment");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documentComment = j.toString();
            }else if (obj!= null && obj instanceof String){
                documentComment = (String) obj;
            }
        }
        if (soapObject.hasProperty("documentDesc"))
        {
            Object obj = soapObject.getProperty("documentDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documentDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                documentDesc = (String) obj;
            }
        }
        if (soapObject.hasProperty("documentName"))
        {
            Object obj = soapObject.getProperty("documentName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documentName = j.toString();
            }else if (obj!= null && obj instanceof String){
                documentName = (String) obj;
            }
        }
        if (soapObject.hasProperty("documentRSN"))
        {
            Object obj = soapObject.getProperty("documentRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documentRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                documentRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("documentRSNSpecified"))
        {
            Object obj = soapObject.getProperty("documentRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documentRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                documentRSNSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("documentStatus"))
        {
            Object obj = soapObject.getProperty("documentStatus");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documentStatus = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                documentStatus = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("documentStatusSpecified"))
        {
            Object obj = soapObject.getProperty("documentStatusSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documentStatusSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                documentStatusSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("documentSuffix"))
        {
            Object obj = soapObject.getProperty("documentSuffix");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                documentSuffix = j.toString();
            }else if (obj!= null && obj instanceof String){
                documentSuffix = (String) obj;
            }
        }
        if (soapObject.hasProperty("dosPath"))
        {
            Object obj = soapObject.getProperty("dosPath");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                dosPath = j.toString();
            }else if (obj!= null && obj instanceof String){
                dosPath = (String) obj;
            }
        }
        if (soapObject.hasProperty("EDMSID"))
        {
            Object obj = soapObject.getProperty("EDMSID");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                eDMSID = j.toString();
            }else if (obj!= null && obj instanceof String){
                eDMSID = (String) obj;
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
        if (soapObject.hasProperty("generationType"))
        {
            Object obj = soapObject.getProperty("generationType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                generationType = j.toString();
            }else if (obj!= null && obj instanceof String){
                generationType = (String) obj;
            }
        }
        if (soapObject.hasProperty("peopleRSN"))
        {
            Object obj = soapObject.getProperty("peopleRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                peopleRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                peopleRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("peopleRSNSpecified"))
        {
            Object obj = soapObject.getProperty("peopleRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                peopleRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                peopleRSNSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("pleaseGenerateFlag"))
        {
            Object obj = soapObject.getProperty("pleaseGenerateFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pleaseGenerateFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pleaseGenerateFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("pleaseGenerateFlagSpecified"))
        {
            Object obj = soapObject.getProperty("pleaseGenerateFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pleaseGenerateFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                pleaseGenerateFlagSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("securityCode"))
        {
            Object obj = soapObject.getProperty("securityCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                securityCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                securityCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("securityCodeSpecified"))
        {
            Object obj = soapObject.getProperty("securityCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                securityCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                securityCodeSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return dateDue;
            case 1:
                return dateDueSpecified;
            case 2:
                return dateGenerated;
            case 3:
                return dateGeneratedSpecified;
            case 4:
                return dateReceivedReply;
            case 5:
                return dateReceivedReplySpecified;
            case 6:
                return dateSent;
            case 7:
                return dateSentSpecified;
            case 8:
                return displayOrder;
            case 9:
                return displayOrderSpecified;
            case 10:
                return documentCode;
            case 11:
                return documentCodeSpecified;
            case 12:
                return documentComment;
            case 13:
                return documentDesc;
            case 14:
                return documentName;
            case 15:
                return documentRSN;
            case 16:
                return documentRSNSpecified;
            case 17:
                return documentStatus;
            case 18:
                return documentStatusSpecified;
            case 19:
                return documentSuffix;
            case 20:
                return dosPath;
            case 21:
                return eDMSID;
            case 22:
                return folderRSN;
            case 23:
                return folderRSNSpecified;
            case 24:
                return generationType;
            case 25:
                return peopleRSN;
            case 26:
                return peopleRSNSpecified;
            case 27:
                return pleaseGenerateFlag;
            case 28:
                return pleaseGenerateFlagSpecified;
            case 29:
                return securityCode;
            case 30:
                return securityCodeSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 31;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dateDue";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dateDueSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dateGenerated";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dateGeneratedSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dateReceivedReply";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dateReceivedReplySpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dateSent";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "dateSentSpecified";
                break;
            case 8:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "displayOrder";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "displayOrderSpecified";
                break;
            case 10:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "documentCode";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "documentCodeSpecified";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "documentComment";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "documentDesc";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "documentName";
                break;
            case 15:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "documentRSN";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "documentRSNSpecified";
                break;
            case 17:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "documentStatus";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "documentStatusSpecified";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "documentSuffix";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dosPath";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "EDMSID";
                break;
            case 22:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "folderRSN";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "folderRSNSpecified";
                break;
            case 24:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "generationType";
                break;
            case 25:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "peopleRSN";
                break;
            case 26:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "peopleRSNSpecified";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "pleaseGenerateFlag";
                break;
            case 28:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "pleaseGenerateFlagSpecified";
                break;
            case 29:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "securityCode";
                break;
            case 30:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "securityCodeSpecified";
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
