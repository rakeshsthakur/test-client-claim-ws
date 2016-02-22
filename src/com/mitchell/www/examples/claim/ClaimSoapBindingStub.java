/**
 * ClaimSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mitchell.www.examples.claim;

public class ClaimSoapBindingStub extends org.apache.axis.client.Stub implements com.mitchell.www.examples.claim.ClaimService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClaimByClaimId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "GetClaimByClaimIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", ">GetClaimByClaimIdRequest"), com.mitchell.www.examples.claim.GetClaimByClaimIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", ">GetClaimByClaimIdResponse"));
        oper.setReturnClass(com.mitchell.www.examples.claim.GetClaimByClaimIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "GetClaimByClaimIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClaimsListByLossDateRange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "GetClaimsListByLossDateRanageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "GetClaimsListByLossDateRanageRequest"), com.mitchell.www.examples.claim.GetClaimsListByLossDateRanageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "GetClaimsListByLossDateRangeResponse"));
        oper.setReturnClass(com.mitchell.www.examples.claim.MitchellClaimType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "GetClaimsListByLossDateRangeResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaim"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpDateClaim");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "UpDateClaimRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaimUpdateType"), com.mitchell.www.examples.claim.MitchellClaimUpdateType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", ">UpDateClaimResponse"));
        oper.setReturnClass(com.mitchell.www.examples.claim.UpDateClaimResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "UpDateClaimResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateClaim");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaim"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaimType"), com.mitchell.www.examples.claim.MitchellClaimType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", ">CreateClaimResponse"));
        oper.setReturnClass(com.mitchell.www.examples.claim.CreateClaimResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "CreateClaimResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public ClaimSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ClaimSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ClaimSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", ">CreateClaimResponse");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.CreateClaimResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", ">GetClaimByClaimIdRequest");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.GetClaimByClaimIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", ">GetClaimByClaimIdResponse");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.GetClaimByClaimIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", ">UpDateClaimResponse");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.UpDateClaimResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "GetClaimsListByLossDateRanageRequest");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.GetClaimsListByLossDateRanageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "GetClaimsListByLossDateRangeResponse");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.MitchellClaimType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaimType");
            qName2 = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaim");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "LossInfoType");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.LossInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaimType");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.MitchellClaimType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaimUpdateType");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.MitchellClaimUpdateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleInfoType");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.VehicleInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleListType");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.VehicleInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleInfoType");
            qName2 = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleListUpdateType");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.VehicleUpdateInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleUpdateInfoType");
            qName2 = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleUpdateDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleUpdateInfoType");
            cachedSerQNames.add(qName);
            cls = com.mitchell.www.examples.claim.VehicleUpdateInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.mitchell.www.examples.claim.GetClaimByClaimIdResponse getClaimByClaimId(com.mitchell.www.examples.claim.GetClaimByClaimIdRequest payload) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetClaimByClaimId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {payload});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mitchell.www.examples.claim.GetClaimByClaimIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mitchell.www.examples.claim.GetClaimByClaimIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mitchell.www.examples.claim.GetClaimByClaimIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.mitchell.www.examples.claim.MitchellClaimType[] getClaimsListByLossDateRange(com.mitchell.www.examples.claim.GetClaimsListByLossDateRanageRequest payload) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetClaimsListByLossDateRange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {payload});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mitchell.www.examples.claim.MitchellClaimType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mitchell.www.examples.claim.MitchellClaimType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.mitchell.www.examples.claim.MitchellClaimType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.mitchell.www.examples.claim.UpDateClaimResponse upDateClaim(com.mitchell.www.examples.claim.MitchellClaimUpdateType payload) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpDateClaim"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {payload});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mitchell.www.examples.claim.UpDateClaimResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mitchell.www.examples.claim.UpDateClaimResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mitchell.www.examples.claim.UpDateClaimResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.mitchell.www.examples.claim.CreateClaimResponse createClaim(com.mitchell.www.examples.claim.MitchellClaimType payload) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateClaim"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {payload});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.mitchell.www.examples.claim.CreateClaimResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.mitchell.www.examples.claim.CreateClaimResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.mitchell.www.examples.claim.CreateClaimResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
