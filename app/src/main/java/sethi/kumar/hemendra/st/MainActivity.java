package sethi.kumar.hemendra.st;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.Wsdl2Code.WebServices.WSAmandaSecurityService.IWsdl2CodeEvents;
import com.Wsdl2Code.WebServices.WSAmandaSecurityService.WSAmandaSecurityService;
import com.Wsdl2Code.WebServices.WSAmandaSecurityService.wsAuthToken;
import com.Wsdl2Code.WebServices.WSAmandaService.VectorwsPeople;
import com.Wsdl2Code.WebServices.WSAmandaService.WSAmandaService;
import com.Wsdl2Code.WebServices.WSAmandaService.wsFolder;
import com.Wsdl2Code.WebServices.WSAmandaService.wsPeople;

import org.ksoap2.HeaderProperty;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import sethi.kumar.hemendra.st.constants.SOAPConstants;
import shem.com.materiallogin.LoginView;
import shem.com.materiallogin.LoginViewListener;

public class MainActivity extends AppCompatActivity implements IWsdl2CodeEvents {

    private static final String WSDLLOCATION = "https://play.csdcsystems.com/axis/services/WSAmandaSecurityService?wsdl";
    private static final String  TAG = "MainActivity";
    private LoginView loginView;
    private ProgressDialog dialog;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginView = (LoginView) findViewById(R.id.loginView);
        loginView.setListener(new LoginViewListener() {
            @Override
            public void onRegister(TextInputLayout registerUser, TextInputLayout registerPass, TextInputLayout registerPassRep) {

            }

            @Override
            public void onLogin(TextInputLayout loginUser, TextInputLayout loginPass) {
                Log.e(TAG, "onLogin: Inside ..........");
                dialog = new ProgressDialog(MainActivity.this);
                dialog.setMessage("Logiging.....");
                dialog.show();
                String userName = loginUser.getEditText().getText().toString();
                String password = loginPass.getEditText().getText().toString();
                Log.e(TAG, "onRegister: User name : " + userName + "  Pass:" + password);

                        WSAmandaSecurityService securityService = new WSAmandaSecurityService();
                        String result = securityService.echo(null);
                        Log.d(TAG, "doInBackground: result :" + result);

                        List<HeaderProperty> headers = new ArrayList<HeaderProperty>();
                        /*HeaderProperty headerProperty = new HeaderProperty("system", "ivco");*/
                        HeaderProperty headerProperty = new HeaderProperty("system", "senegal");
                        headers.add(headerProperty);
                        //wsAuthToken authToken = securityService.authenticateUser("AMANDA_ADMIN", "AMANDA_ADMIN", headers);
                        //wsAuthToken authToken = securityService.authenticateUser("INTERNET", "INTERNET", headers);
                        wsAuthToken authToken = securityService.authenticateUser(userName, password, headers);
                        if (authToken != null) {
                            dialog.hide();
                            Toast.makeText(MainActivity.this, "Logged In Successfully!!", Toast.LENGTH_SHORT).show();
                            Log.d(TAG, "doInBackground: authToken -> LID  :" + authToken.lid);
                            Log.d(TAG, "doInBackground: authToken -> LID  :" + authToken.admin);
                        }


                        /*String lid = authToken.lid;

                        headers.clear();
                        HeaderProperty lidHeaderProperty = new HeaderProperty("lid", lid);
                        headers.add(lidHeaderProperty);
                        WSAmandaService service = new WSAmandaService();
                        String s = service.echo(headers);

                        Log.d(TAG, "doInBackground: Service Method Echo result :" + s);*/


            }
        });

        button = (Button) findViewById(R.id.startService);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: button cliked");
                new AsyncTask<Void, Void, Void>() {
                    @Override
                    protected void onPostExecute(Void result) {
                        Log.d(TAG, "onPostExecute: After exceution " + result);
                    }

                    @Override
                    protected Void doInBackground(Void... params) {
                        WSAmandaSecurityService securityService = new WSAmandaSecurityService();
                        String result = securityService.echo(null);
                        Log.d(TAG, "doInBackground: result :" + result);

                        List<HeaderProperty> headers = new ArrayList<HeaderProperty>();
                        /*HeaderProperty headerProperty = new HeaderProperty("system", "ivco");*/
                        HeaderProperty headerProperty = new HeaderProperty("system", "senegal");
                        headers.add(headerProperty);
                        //wsAuthToken authToken = securityService.authenticateUser("AMANDA_ADMIN", "AMANDA_ADMIN", headers);
                        wsAuthToken authToken = securityService.authenticateUser("INTERNET", "INTERNET", headers);
                        Log.d(TAG, "doInBackground: authToken -> LID  :" + authToken.lid);
                        Log.d(TAG, "doInBackground: authToken -> LID  :" + authToken.admin);

                        String lid = authToken.lid;

                        headers.clear();
                        HeaderProperty lidHeaderProperty = new HeaderProperty("lid", lid);
                        headers.add(lidHeaderProperty);
                        WSAmandaService service = new WSAmandaService();
                        String s = service.echo(headers);

                        Log.d(TAG, "doInBackground: Service Method Echo result :" + s);

                        //int peopleRSN = 435301539;
                        //service.getPeople(peopleRSN, false, headers);

                        int folderRSN = 1056770;
                        try {
                            //wsFolder wsFolder = service.getFolder(folderRSN, false, headers);
                            /*Log.d(TAG, "doInBackground: FolderRSN : "+wsFolder.folderRSN);
                            Log.d(TAG, "doInBackground: Folder Name : "+wsFolder.folderName);
                            Log.d(TAG, "doInBackground: Folder Description : "+wsFolder.folderDescription);
                            Log.d(TAG, "doInBackground: Folder Desc : "+wsFolder.folderTypeDesc);
                            Log.d(TAG, "doInBackground: FolderRSN : " + wsFolder.folderRSN);*/
                            //435301658,
                            wsPeople people = service.getPeople(435301710, false, headers);
                            VectorwsPeople vectorwsPeople = service.getFolderPeople(folderRSN, false, headers);
                            /*if (vectorwsPeople != null){
                                Log.d(TAG, "doInBackground: length of the folder people :"+vectorwsPeople.size()+ vectorwsPeople.getPropertyCount());
                                Iterator<wsPeople> i = vectorwsPeople.iterator();
                                while (i.hasNext()){
                                    Log.d(TAG, "doInBackground: Peole Iterator :"+"\n"+ i.next().nameFirst
                                            +" "+ i.next().nameLast
                                            +" "+ i.next().nameMiddle
                                            +" "+ i.next().addressLine1
                                            +" "+ i.next().addrCity
                                            +" "+ i.next().addrPostal
                                            +" "+ i.next().peopleCode
                                            +" "+ i.next().addrHouse);
                                }
                                for (wsPeople people1 : vectorwsPeople){
                                    Log.d(TAG, "doInBackground: People data "
                                    +"\n"+ people1.nameFirst
                                            +" "+ people.nameLast
                                            +" "+ people.nameMiddle
                                            +" "+ people.addressLine1
                                            +" "+ people.addrCity
                                            +" "+ people.addrPostal
                                            +" "+ people.peopleCode
                                            +" "+ people.addrHouse);
                                }
                            }*/

                            if (people != null)
                                Log.d(TAG, "doInBackground: People Details  :" + people.peopleRSN
                                        + " " + people.peopleDesc
                                        + " " + people.nameFirst
                                        + " " + people.nameLast
                                        + " " + people.nameMiddle
                                        + " " + people.addressLine1
                                        + " " + people.addrCity
                                        + " " + people.addrPostal
                                        + " " + people.peopleCode
                                        + " " + people.addrHouse);

                            wsPeople addPeopleData = new wsPeople();
                            addPeopleData.nameFirst = "Sabya Sagarika ";
                            addPeopleData.addrCity = "Kolkata";
                            addPeopleData.nameTitle = "Mr.";

                            addPeopleData.addressLine1 = "Bhubameswar, Garage Chhak";
                            addPeopleData.addrPostal = "garage Chhak";
                            addPeopleData.addrCountry = "India";
                            addPeopleData.phone1 = "9438834912";
                            addPeopleData.phone2 = "897562312";
                            addPeopleData.emailAddress = "i@yahoo.com";
                            addPeopleData.organizationName = "Esspl";
                            addPeopleData.socialSecurityNumber = "98234";
                            addPeopleData.internetQuestion = "will it work?";
                            addPeopleData.internetAnswer = "yes! Hard work can bring anything!!";
                            addPeopleData.internetPassword = "bapi7011";
                            addPeopleData.internetAccess = "A";


                            Log.d(TAG, "doInBackground: GetpeopleData     :" + addPeopleData.nameFirst);
                            int rsn = service.addPeople(addPeopleData, headers);

                            Log.e(TAG, "doInBackground: New Pople Rsn : " + rsn);


                        } catch (Exception e) {
                            securityService.logOff(lid);
                            e.printStackTrace();
                        }

                        /*

                        String Organization = request.getParameter("OrganizationName");
	String Name = request.getParameter("Name");
	String Title = request.getParameter("Title");

	String Phone1 = request.getParameter("Phone1");
	String Phone2 = request.getParameter("Phone2");
	String EmailAddress = request.getParameter("EmailAddress");

	String InternetPassword = request.getParameter("PassWord");
	String Address = request.getParameter("Address");

	String AddrCity = request.getParameter("City");
	String AddrPostal = request.getParameter("PostalCode");
	String AddrCountry = request.getParameter("Country");

	String WebAddress = request.getParameter("WebAddress");
	String PaymentType = request.getParameter("PaymentType");
	String CreationDate = request.getParameter("CreationDate");

	String SecurityNumber = request.getParameter("SecurityNumber");
	String LegalStatus = request.getParameter("LegalStatus");
	String SubscriptionDate = request.getParameter("SubscriptionDate");

	String SecurityQuestion = request.getParameter("SecurityQuestion");
	String SecurityQuestionAnswer = request.getParameter("SecurityQuestionAnswer");

                        //Working Codes...
                        //SoapObject soapObject = new SoapObject("http://webservice.amanda.csdcsystems.com", "echo");
                        SoapObject soapObject = new SoapObject(SOAPConstants.NAMESPACE, SOAPConstants.METHODNAME_STRING);
                        Log.d(TAG, "doInBackground: Backgroud processing........");


                        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
                        envelope.dotNet = false;
                        envelope.implicitTypes = true;
                        envelope.setAddAdornments(false);
                        envelope.setOutputSoapObject(soapObject);

                        HttpTransportSE transportSE = new HttpTransportSE(Proxy.NO_PROXY,WSDLLOCATION, 60000 );
                        transportSE.debug = true;
                        //transportSE.setXmlVersionTag("<!--?xml version=\"1.0\" encoding= \"UTF-8\" ?-->");
                        transportSE.setXmlVersionTag(SOAPConstants.XML_VERSION_TAG);

                        try {
                            //transportSE.call("urn:echo", envelope);
                            transportSE.call("urn:echo", envelope);
                            SoapPrimitive soapPrimitive = (SoapPrimitive) envelope.getResponse();
                            String res = soapPrimitive.toString();
                            Log.d(TAG, "doInBackground: Response     :"+res);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (XmlPullParserException e) {
                            e.printStackTrace();
                        }*/
                        return null;
                    }
                }.execute();
            }
        });
    }

    @Override
    public void Wsdl2CodeStartedRequest() {

    }

    @Override
    public void Wsdl2CodeFinished(String methodName, Object Data) {

    }

    @Override
    public void Wsdl2CodeFinishedWithException(Exception ex) {

    }

    @Override
    public void Wsdl2CodeEndedRequest() {

    }
}
