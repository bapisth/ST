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

public class wsFolderInfo implements KvmSerializable_ws {
    
    public String comments;
    public int displayOrder;
    public boolean displayOrderSpecified;
    public boolean encryptionFlag;
    public boolean encryptionFlagSpecified;
    public long folderStage;
    public boolean folderStageSpecified;
    public String folderType;
    public int infoCode;
    public boolean infoCodeSpecified;
    public String infoDesc;
    public String infoType;
    public String infoValue;
    public boolean mandatory;
    public boolean mandatorySpecified;
    public boolean printFlag;
    public boolean printFlagSpecified;
    public boolean requiredForInitialSetup;
    public boolean requiredForInitialSetupSpecified;
    public boolean webDisplayApplyFlag;
    public boolean webDisplayApplyFlagSpecified;
    public boolean webDisplayApplyForLicenceFlag;
    public boolean webDisplayApplyForLicenceFlagSpecified;
    public boolean webDisplayApplyForPermitFlag;
    public boolean webDisplayApplyForPermitFlagSpecified;
    public String webDisplayFlag;
    public boolean webDisplayMyLicenceFlag;
    public boolean webDisplayMyLicenceFlagSpecified;
    public boolean webDisplayMyPermitFlag;
    public boolean webDisplayMyPermitFlagSpecified;
    public boolean webDisplayPublicQueryFlag;
    public boolean webDisplayPublicQueryFlagSpecified;
    public boolean webDisplayRenewLicenceFlag;
    public boolean webDisplayRenewLicenceFlagSpecified;
    public boolean webDisplayViewFlag;
    public boolean webDisplayViewFlagSpecified;
    
    public wsFolderInfo(){}
    
    public wsFolderInfo(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
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
        if (soapObject.hasProperty("encryptionFlag"))
        {
            Object obj = soapObject.getProperty("encryptionFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                encryptionFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                encryptionFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("encryptionFlagSpecified"))
        {
            Object obj = soapObject.getProperty("encryptionFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                encryptionFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                encryptionFlagSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("folderStage"))
        {
            Object obj = soapObject.getProperty("folderStage");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                folderStage = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                folderStage = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("folderStageSpecified"))
        {
            Object obj = soapObject.getProperty("folderStageSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                folderStageSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                folderStageSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("infoCode"))
        {
            Object obj = soapObject.getProperty("infoCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                infoCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                infoCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("infoCodeSpecified"))
        {
            Object obj = soapObject.getProperty("infoCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                infoCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                infoCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("infoDesc"))
        {
            Object obj = soapObject.getProperty("infoDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                infoDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                infoDesc = (String) obj;
            }
        }
        if (soapObject.hasProperty("infoType"))
        {
            Object obj = soapObject.getProperty("infoType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                infoType = j.toString();
            }else if (obj!= null && obj instanceof String){
                infoType = (String) obj;
            }
        }
        if (soapObject.hasProperty("infoValue"))
        {
            Object obj = soapObject.getProperty("infoValue");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                infoValue = j.toString();
            }else if (obj!= null && obj instanceof String){
                infoValue = (String) obj;
            }
        }
        if (soapObject.hasProperty("mandatory"))
        {
            Object obj = soapObject.getProperty("mandatory");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mandatory = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mandatory = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("mandatorySpecified"))
        {
            Object obj = soapObject.getProperty("mandatorySpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mandatorySpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                mandatorySpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("printFlag"))
        {
            Object obj = soapObject.getProperty("printFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                printFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                printFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("printFlagSpecified"))
        {
            Object obj = soapObject.getProperty("printFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                printFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                printFlagSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("requiredForInitialSetup"))
        {
            Object obj = soapObject.getProperty("requiredForInitialSetup");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                requiredForInitialSetup = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                requiredForInitialSetup = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("requiredForInitialSetupSpecified"))
        {
            Object obj = soapObject.getProperty("requiredForInitialSetupSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                requiredForInitialSetupSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                requiredForInitialSetupSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayApplyFlag"))
        {
            Object obj = soapObject.getProperty("webDisplayApplyFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayApplyFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayApplyFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayApplyFlagSpecified"))
        {
            Object obj = soapObject.getProperty("webDisplayApplyFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayApplyFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayApplyFlagSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayApplyForLicenceFlag"))
        {
            Object obj = soapObject.getProperty("webDisplayApplyForLicenceFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayApplyForLicenceFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayApplyForLicenceFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayApplyForLicenceFlagSpecified"))
        {
            Object obj = soapObject.getProperty("webDisplayApplyForLicenceFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayApplyForLicenceFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayApplyForLicenceFlagSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayApplyForPermitFlag"))
        {
            Object obj = soapObject.getProperty("webDisplayApplyForPermitFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayApplyForPermitFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayApplyForPermitFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayApplyForPermitFlagSpecified"))
        {
            Object obj = soapObject.getProperty("webDisplayApplyForPermitFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayApplyForPermitFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayApplyForPermitFlagSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayFlag"))
        {
            Object obj = soapObject.getProperty("webDisplayFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayFlag = j.toString();
            }else if (obj!= null && obj instanceof String){
                webDisplayFlag = (String) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayMyLicenceFlag"))
        {
            Object obj = soapObject.getProperty("webDisplayMyLicenceFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayMyLicenceFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayMyLicenceFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayMyLicenceFlagSpecified"))
        {
            Object obj = soapObject.getProperty("webDisplayMyLicenceFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayMyLicenceFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayMyLicenceFlagSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayMyPermitFlag"))
        {
            Object obj = soapObject.getProperty("webDisplayMyPermitFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayMyPermitFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayMyPermitFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayMyPermitFlagSpecified"))
        {
            Object obj = soapObject.getProperty("webDisplayMyPermitFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayMyPermitFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayMyPermitFlagSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayPublicQueryFlag"))
        {
            Object obj = soapObject.getProperty("webDisplayPublicQueryFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayPublicQueryFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayPublicQueryFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayPublicQueryFlagSpecified"))
        {
            Object obj = soapObject.getProperty("webDisplayPublicQueryFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayPublicQueryFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayPublicQueryFlagSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayRenewLicenceFlag"))
        {
            Object obj = soapObject.getProperty("webDisplayRenewLicenceFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayRenewLicenceFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayRenewLicenceFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayRenewLicenceFlagSpecified"))
        {
            Object obj = soapObject.getProperty("webDisplayRenewLicenceFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayRenewLicenceFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayRenewLicenceFlagSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayViewFlag"))
        {
            Object obj = soapObject.getProperty("webDisplayViewFlag");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayViewFlag = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayViewFlag = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("webDisplayViewFlagSpecified"))
        {
            Object obj = soapObject.getProperty("webDisplayViewFlagSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                webDisplayViewFlagSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                webDisplayViewFlagSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return comments;
            case 1:
                return displayOrder;
            case 2:
                return displayOrderSpecified;
            case 3:
                return encryptionFlag;
            case 4:
                return encryptionFlagSpecified;
            case 5:
                return folderStage;
            case 6:
                return folderStageSpecified;
            case 7:
                return folderType;
            case 8:
                return infoCode;
            case 9:
                return infoCodeSpecified;
            case 10:
                return infoDesc;
            case 11:
                return infoType;
            case 12:
                return infoValue;
            case 13:
                return mandatory;
            case 14:
                return mandatorySpecified;
            case 15:
                return printFlag;
            case 16:
                return printFlagSpecified;
            case 17:
                return requiredForInitialSetup;
            case 18:
                return requiredForInitialSetupSpecified;
            case 19:
                return webDisplayApplyFlag;
            case 20:
                return webDisplayApplyFlagSpecified;
            case 21:
                return webDisplayApplyForLicenceFlag;
            case 22:
                return webDisplayApplyForLicenceFlagSpecified;
            case 23:
                return webDisplayApplyForPermitFlag;
            case 24:
                return webDisplayApplyForPermitFlagSpecified;
            case 25:
                return webDisplayFlag;
            case 26:
                return webDisplayMyLicenceFlag;
            case 27:
                return webDisplayMyLicenceFlagSpecified;
            case 28:
                return webDisplayMyPermitFlag;
            case 29:
                return webDisplayMyPermitFlagSpecified;
            case 30:
                return webDisplayPublicQueryFlag;
            case 31:
                return webDisplayPublicQueryFlagSpecified;
            case 32:
                return webDisplayRenewLicenceFlag;
            case 33:
                return webDisplayRenewLicenceFlagSpecified;
            case 34:
                return webDisplayViewFlag;
            case 35:
                return webDisplayViewFlagSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 36;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "comments";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "displayOrder";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "displayOrderSpecified";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "encryptionFlag";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "encryptionFlagSpecified";
                break;
            case 5:
                info.type = Long.class;
                info.name = "folderStage";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "folderStageSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "folderType";
                break;
            case 8:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "infoCode";
                break;
            case 9:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "infoCodeSpecified";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "infoDesc";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "infoType";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "infoValue";
                break;
            case 13:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "mandatory";
                break;
            case 14:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "mandatorySpecified";
                break;
            case 15:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "printFlag";
                break;
            case 16:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "printFlagSpecified";
                break;
            case 17:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "requiredForInitialSetup";
                break;
            case 18:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "requiredForInitialSetupSpecified";
                break;
            case 19:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayApplyFlag";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayApplyFlagSpecified";
                break;
            case 21:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayApplyForLicenceFlag";
                break;
            case 22:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayApplyForLicenceFlagSpecified";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayApplyForPermitFlag";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayApplyForPermitFlagSpecified";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "webDisplayFlag";
                break;
            case 26:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayMyLicenceFlag";
                break;
            case 27:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayMyLicenceFlagSpecified";
                break;
            case 28:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayMyPermitFlag";
                break;
            case 29:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayMyPermitFlagSpecified";
                break;
            case 30:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayPublicQueryFlag";
                break;
            case 31:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayPublicQueryFlagSpecified";
                break;
            case 32:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayRenewLicenceFlag";
                break;
            case 33:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayRenewLicenceFlagSpecified";
                break;
            case 34:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayViewFlag";
                break;
            case 35:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "webDisplayViewFlagSpecified";
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
