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

public class deletePeopleGroupMember implements KvmSerializable_ws {
    
    public int groupRSN;
    public boolean groupRSNSpecified;
    public int peopleRSN;
    public boolean peopleRSNSpecified;
    public String rowID;
    
    public deletePeopleGroupMember(){}
    
    public deletePeopleGroupMember(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("groupRSN"))
        {
            Object obj = soapObject.getProperty("groupRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                groupRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                groupRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("groupRSNSpecified"))
        {
            Object obj = soapObject.getProperty("groupRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                groupRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                groupRSNSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("rowID"))
        {
            Object obj = soapObject.getProperty("rowID");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                rowID = j.toString();
            }else if (obj!= null && obj instanceof String){
                rowID = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return groupRSN;
            case 1:
                return groupRSNSpecified;
            case 2:
                return peopleRSN;
            case 3:
                return peopleRSNSpecified;
            case 4:
                return rowID;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 5;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "groupRSN";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "groupRSNSpecified";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "peopleRSN";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "peopleRSNSpecified";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "rowID";
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
