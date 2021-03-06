
package com.woolpert.safe.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SafeImplService", targetNamespace = "http://webservices.safe.woolpert.com/", wsdlLocation = "http://localhost:8080/safeservices/serv?wsdl")
public class SafeImplService
    extends Service
{

    private final static URL SAFEIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.woolpert.safe.webservices.SafeImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.woolpert.safe.webservices.SafeImplService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/safeservices/serv?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/safeservices/serv?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SAFEIMPLSERVICE_WSDL_LOCATION = url;
    }

    public SafeImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SafeImplService() {
        super(SAFEIMPLSERVICE_WSDL_LOCATION, new QName("http://webservices.safe.woolpert.com/", "SafeImplService"));
    }

    /**
     * 
     * @return
     *     returns SafeImpl
     */
    @WebEndpoint(name = "SafeImplPort")
    public SafeImpl getSafeImplPort() {
        return super.getPort(new QName("http://webservices.safe.woolpert.com/", "SafeImplPort"), SafeImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SafeImpl
     */
    @WebEndpoint(name = "SafeImplPort")
    public SafeImpl getSafeImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.safe.woolpert.com/", "SafeImplPort"), SafeImpl.class, features);
    }

}
