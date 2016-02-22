/**
 * ClaimLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mitchell.www.examples.claim;

public class ClaimLocator extends org.apache.axis.client.Service implements com.mitchell.www.examples.claim.Claim {

    public ClaimLocator() {
    }


    public ClaimLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClaimLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MitchellClaimWsPort
    private java.lang.String MitchellClaimWsPort_address = "http://localhost:8080/claim-ws/MitchellServices/ClaimWs";

    public java.lang.String getMitchellClaimWsPortAddress() {
        return MitchellClaimWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MitchellClaimWsPortWSDDServiceName = "MitchellClaimWsPort";

    public java.lang.String getMitchellClaimWsPortWSDDServiceName() {
        return MitchellClaimWsPortWSDDServiceName;
    }

    public void setMitchellClaimWsPortWSDDServiceName(java.lang.String name) {
        MitchellClaimWsPortWSDDServiceName = name;
    }

    public com.mitchell.www.examples.claim.ClaimService getMitchellClaimWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MitchellClaimWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMitchellClaimWsPort(endpoint);
    }

    public com.mitchell.www.examples.claim.ClaimService getMitchellClaimWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mitchell.www.examples.claim.ClaimSoapBindingStub _stub = new com.mitchell.www.examples.claim.ClaimSoapBindingStub(portAddress, this);
            _stub.setPortName(getMitchellClaimWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMitchellClaimWsPortEndpointAddress(java.lang.String address) {
        MitchellClaimWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mitchell.www.examples.claim.ClaimService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mitchell.www.examples.claim.ClaimSoapBindingStub _stub = new com.mitchell.www.examples.claim.ClaimSoapBindingStub(new java.net.URL(MitchellClaimWsPort_address), this);
                _stub.setPortName(getMitchellClaimWsPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MitchellClaimWsPort".equals(inputPortName)) {
            return getMitchellClaimWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "Claim");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaimWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MitchellClaimWsPort".equals(portName)) {
            setMitchellClaimWsPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
