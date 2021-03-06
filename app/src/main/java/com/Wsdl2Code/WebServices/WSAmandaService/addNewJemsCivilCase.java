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
import com.Wsdl2Code.WebServices.WSAmandaService.wsFolder;
import com.Wsdl2Code.WebServices.WSAmandaService.VectorwsFolderProperty;
import com.Wsdl2Code.WebServices.WSAmandaService.VectorwsFolderPeople;
import com.Wsdl2Code.WebServices.WSAmandaService.VectorwsFolderInfo;
import com.Wsdl2Code.WebServices.WSAmandaService.VectorwsFolderFixture;
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class addNewJemsCivilCase implements KvmSerializable_ws {
    
    public wsFolder folder;
    public int peopleRSN;
    public boolean peopleRSNSpecified;
    public VectorwsFolderProperty folderProperty;
    public VectorwsFolderPeople folderPeople;
    public VectorwsFolderInfo folderInfo;
    public VectorwsFolderFixture folderFixture;
    
    public addNewJemsCivilCase(){}
    
    public addNewJemsCivilCase(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("folder"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("folder");
            folder =  new wsFolder (j);
            
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
        if (soapObject.hasProperty("folderProperty"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("folderProperty");
            folderProperty = new VectorwsFolderProperty(j);
        }
        if (soapObject.hasProperty("folderPeople"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("folderPeople");
            folderPeople = new VectorwsFolderPeople(j);
        }
        if (soapObject.hasProperty("folderInfo"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("folderInfo");
            folderInfo = new VectorwsFolderInfo(j);
        }
        if (soapObject.hasProperty("folderFixture"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("folderFixture");
            folderFixture = new VectorwsFolderFixture(j);
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return folder;
            case 1:
                return peopleRSN;
            case 2:
                return peopleRSNSpecified;
            case 3:
                return folderProperty;
            case 4:
                return folderPeople;
            case 5:
                return folderInfo;
            case 6:
                return folderFixture;
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
                info.type = wsFolder.class;
                info.name = "folder";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "peopleRSN";
                break;
            case 2:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "peopleRSNSpecified";
                break;
            case 3:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "folderProperty";
                break;
            case 4:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "folderPeople";
                break;
            case 5:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "folderInfo";
                break;
            case 6:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "folderFixture";
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
