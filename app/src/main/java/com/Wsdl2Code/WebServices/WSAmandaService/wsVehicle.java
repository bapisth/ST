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

public class wsVehicle implements KvmSerializable_ws {
    
    public int axles;
    public boolean axlesSpecified;
    public String bodyType;
    public String bodyTypeDesc;
    public String colour;
    public String colourDesc;
    public int cylinder;
    public boolean cylinderSpecified;
    public String make;
    public String makeDesc;
    public String model;
    public String modelDesc;
    public String power;
    public String powerDesc;
    public String referenceFile1;
    public String referenceFile2;
    public String referenceFile3;
    public String referenceFile4;
    public String referenceFile5;
    public int statusCode;
    public boolean statusCodeSpecified;
    public String statusDesc;
    public int vehicleRSN;
    public boolean vehicleRSNSpecified;
    public String vinNo;
    public int weight;
    public boolean weightSpecified;
    public int year;
    public boolean yearSpecified;
    
    public wsVehicle(){}
    
    public wsVehicle(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("axles"))
        {
            Object obj = soapObject.getProperty("axles");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                axles = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof String){
                //axles = (String) obj;
            }
        }
        if (soapObject.hasProperty("axlesSpecified"))
        {
            Object obj = soapObject.getProperty("axlesSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                axlesSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                axlesSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("bodyType"))
        {
            Object obj = soapObject.getProperty("bodyType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                bodyType = j.toString();
            }else if (obj!= null && obj instanceof String){
                bodyType = (String) obj;
            }
        }
        if (soapObject.hasProperty("bodyTypeDesc"))
        {
            Object obj = soapObject.getProperty("bodyTypeDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                bodyTypeDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                bodyTypeDesc = (String) obj;
            }
        }
        if (soapObject.hasProperty("colour"))
        {
            Object obj = soapObject.getProperty("colour");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                colour = j.toString();
            }else if (obj!= null && obj instanceof String){
                colour = (String) obj;
            }
        }
        if (soapObject.hasProperty("colourDesc"))
        {
            Object obj = soapObject.getProperty("colourDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                colourDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                colourDesc = (String) obj;
            }
        }
        if (soapObject.hasProperty("cylinder"))
        {
            Object obj = soapObject.getProperty("cylinder");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cylinder = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof String){
                //cylinder = (String) obj;
            }
        }
        if (soapObject.hasProperty("cylinderSpecified"))
        {
            Object obj = soapObject.getProperty("cylinderSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cylinderSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                cylinderSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("make"))
        {
            Object obj = soapObject.getProperty("make");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                make = j.toString();
            }else if (obj!= null && obj instanceof String){
                make = (String) obj;
            }
        }
        if (soapObject.hasProperty("makeDesc"))
        {
            Object obj = soapObject.getProperty("makeDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                makeDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                makeDesc = (String) obj;
            }
        }
        if (soapObject.hasProperty("model"))
        {
            Object obj = soapObject.getProperty("model");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                model = j.toString();
            }else if (obj!= null && obj instanceof String){
                model = (String) obj;
            }
        }
        if (soapObject.hasProperty("modelDesc"))
        {
            Object obj = soapObject.getProperty("modelDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                modelDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                modelDesc = (String) obj;
            }
        }
        if (soapObject.hasProperty("power"))
        {
            Object obj = soapObject.getProperty("power");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                power = j.toString();
            }else if (obj!= null && obj instanceof String){
                power = (String) obj;
            }
        }
        if (soapObject.hasProperty("powerDesc"))
        {
            Object obj = soapObject.getProperty("powerDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                powerDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                powerDesc = (String) obj;
            }
        }
        if (soapObject.hasProperty("referenceFile1"))
        {
            Object obj = soapObject.getProperty("referenceFile1");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                referenceFile1 = j.toString();
            }else if (obj!= null && obj instanceof String){
                referenceFile1 = (String) obj;
            }
        }
        if (soapObject.hasProperty("referenceFile2"))
        {
            Object obj = soapObject.getProperty("referenceFile2");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                referenceFile2 = j.toString();
            }else if (obj!= null && obj instanceof String){
                referenceFile2 = (String) obj;
            }
        }
        if (soapObject.hasProperty("referenceFile3"))
        {
            Object obj = soapObject.getProperty("referenceFile3");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                referenceFile3 = j.toString();
            }else if (obj!= null && obj instanceof String){
                referenceFile3 = (String) obj;
            }
        }
        if (soapObject.hasProperty("referenceFile4"))
        {
            Object obj = soapObject.getProperty("referenceFile4");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                referenceFile4 = j.toString();
            }else if (obj!= null && obj instanceof String){
                referenceFile4 = (String) obj;
            }
        }
        if (soapObject.hasProperty("referenceFile5"))
        {
            Object obj = soapObject.getProperty("referenceFile5");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                referenceFile5 = j.toString();
            }else if (obj!= null && obj instanceof String){
                referenceFile5 = (String) obj;
            }
        }
        if (soapObject.hasProperty("statusCode"))
        {
            Object obj = soapObject.getProperty("statusCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                statusCode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                statusCode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("statusCodeSpecified"))
        {
            Object obj = soapObject.getProperty("statusCodeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                statusCodeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                statusCodeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("statusDesc"))
        {
            Object obj = soapObject.getProperty("statusDesc");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                statusDesc = j.toString();
            }else if (obj!= null && obj instanceof String){
                statusDesc = (String) obj;
            }
        }
        if (soapObject.hasProperty("vehicleRSN"))
        {
            Object obj = soapObject.getProperty("vehicleRSN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                vehicleRSN = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                vehicleRSN = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("vehicleRSNSpecified"))
        {
            Object obj = soapObject.getProperty("vehicleRSNSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                vehicleRSNSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                vehicleRSNSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("vinNo"))
        {
            Object obj = soapObject.getProperty("vinNo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                vinNo = j.toString();
            }else if (obj!= null && obj instanceof String){
                vinNo = (String) obj;
            }
        }
        if (soapObject.hasProperty("weight"))
        {
            Object obj = soapObject.getProperty("weight");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                weight = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                weight = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("weightSpecified"))
        {
            Object obj = soapObject.getProperty("weightSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                weightSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                weightSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("year"))
        {
            Object obj = soapObject.getProperty("year");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                year = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                year = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("yearSpecified"))
        {
            Object obj = soapObject.getProperty("yearSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                yearSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                yearSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return axles;
            case 1:
                return axlesSpecified;
            case 2:
                return bodyType;
            case 3:
                return bodyTypeDesc;
            case 4:
                return colour;
            case 5:
                return colourDesc;
            case 6:
                return cylinder;
            case 7:
                return cylinderSpecified;
            case 8:
                return make;
            case 9:
                return makeDesc;
            case 10:
                return model;
            case 11:
                return modelDesc;
            case 12:
                return power;
            case 13:
                return powerDesc;
            case 14:
                return referenceFile1;
            case 15:
                return referenceFile2;
            case 16:
                return referenceFile3;
            case 17:
                return referenceFile4;
            case 18:
                return referenceFile5;
            case 19:
                return statusCode;
            case 20:
                return statusCodeSpecified;
            case 21:
                return statusDesc;
            case 22:
                return vehicleRSN;
            case 23:
                return vehicleRSNSpecified;
            case 24:
                return vinNo;
            case 25:
                return weight;
            case 26:
                return weightSpecified;
            case 27:
                return year;
            case 28:
                return yearSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 29;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "axles";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "axlesSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "bodyType";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "bodyTypeDesc";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "colour";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "colourDesc";
                break;
            case 6:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "cylinder";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "cylinderSpecified";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "make";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "makeDesc";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "model";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "modelDesc";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "power";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "powerDesc";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "referenceFile1";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "referenceFile2";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "referenceFile3";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "referenceFile4";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "referenceFile5";
                break;
            case 19:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "statusCode";
                break;
            case 20:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "statusCodeSpecified";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "statusDesc";
                break;
            case 22:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "vehicleRSN";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "vehicleRSNSpecified";
                break;
            case 24:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "vinNo";
                break;
            case 25:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "weight";
                break;
            case 26:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "weightSpecified";
                break;
            case 27:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "year";
                break;
            case 28:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "yearSpecified";
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