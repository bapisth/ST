package sethi.kumar.hemendra.st.marshaller;

import org.ksoap2.serialization.Marshal;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;

/**
 * Created by BAPI1 on 25-01-2016.
 */
public class CustomMarshal implements Marshal {
    @Override
    public Object readInstance(XmlPullParser parser, String namespace, String name, PropertyInfo expected) throws IOException, XmlPullParserException {
        String stringValue = parser.nextText();
        Object result;
        if (name.equals("float")) {
            result = new Float(stringValue);
        } else if (name.equals("double")) {
            result = new Double(stringValue);
        } else if (name.equals("decimal")) {
            result = new java.math.BigDecimal(stringValue);
        }else if (name.equalsIgnoreCase("int")){
            result = new Integer(stringValue);
        }
        else if (name.equalsIgnoreCase("string")){
            result = new String(stringValue);
        }
        else if (name.equalsIgnoreCase("boolean")){
            result = new Boolean(stringValue);
        }
        else {
            throw new RuntimeException("float, double, int, string or decimal expected");
        }
        return result;
    }

    @Override
    public void writeInstance(XmlSerializer writer, Object instance) throws IOException {
        writer.text(instance.toString());
    }

    @Override
    public void register(SoapSerializationEnvelope cm) {
        cm.addMapping(cm.xsd, "float", Float.class, this);
        cm.addMapping(cm.xsd, "double", Double.class, this);
        cm.addMapping(cm.xsd, "decimal", java.math.BigDecimal.class, this);
        cm.addMapping(cm.xsd, "int", Integer.class, this);
        cm.addMapping(cm.xsd, "string", String.class, this);
        cm.addMapping(cm.xsd, "boolean", Boolean.class, this);

    }
}
