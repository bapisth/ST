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
import com.Wsdl2Code.WebServices.WSAmandaService.VectorwsFolder;
import com.Wsdl2Code.WebServices.WSAmandaService.wsPeople;
import com.Wsdl2Code.WebServices.WSAmandaService.KvmSerializable_ws;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class wsPeopleFolder implements KvmSerializable_ws {
    
    public VectorwsFolder folder;
    public wsPeople people;
    
    public wsPeopleFolder(){}
    
    public wsPeopleFolder(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("folder"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("folder");
            folder = new VectorwsFolder(j);
        }
        if (soapObject.hasProperty("people"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("people");
            people =  new wsPeople (j);
            
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return folder;
            case 1:
                return people;
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
                info.name = "folder";
                break;
            case 1:
                info.type = wsPeople.class;
                info.name = "people";
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
