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
import com.Wsdl2Code.WebServices.WSAmandaService.VectorInt32;
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class getFolderTypeByGroups implements KvmSerializable_ws {
    
    public VectorInt32 folderGroupCode;
    public String webDisplayFlag;
    
    public getFolderTypeByGroups(){}
    
    public getFolderTypeByGroups(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("folderGroupCode"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("folderGroupCode");
            folderGroupCode = new VectorInt32(j);
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
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return folderGroupCode;
            case 1:
                return webDisplayFlag;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 2;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "folderGroupCode";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "webDisplayFlag";
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
