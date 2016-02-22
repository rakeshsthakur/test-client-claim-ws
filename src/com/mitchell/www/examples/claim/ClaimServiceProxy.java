package com.mitchell.www.examples.claim;

public class ClaimServiceProxy implements com.mitchell.www.examples.claim.ClaimService {
  private String _endpoint = null;
  private com.mitchell.www.examples.claim.ClaimService claimService = null;
  
  public ClaimServiceProxy() {
    _initClaimServiceProxy();
  }
  
  public ClaimServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initClaimServiceProxy();
  }
  
  private void _initClaimServiceProxy() {
    try {
      claimService = (new com.mitchell.www.examples.claim.ClaimLocator()).getMitchellClaimWsPort();
      if (claimService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)claimService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)claimService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (claimService != null)
      ((javax.xml.rpc.Stub)claimService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mitchell.www.examples.claim.ClaimService getClaimService() {
    if (claimService == null)
      _initClaimServiceProxy();
    return claimService;
  }
  
  public com.mitchell.www.examples.claim.GetClaimByClaimIdResponse getClaimByClaimId(com.mitchell.www.examples.claim.GetClaimByClaimIdRequest payload) throws java.rmi.RemoteException{
    if (claimService == null)
      _initClaimServiceProxy();
    return claimService.getClaimByClaimId(payload);
  }
  
  public com.mitchell.www.examples.claim.MitchellClaimType[] getClaimsListByLossDateRange(com.mitchell.www.examples.claim.GetClaimsListByLossDateRanageRequest payload) throws java.rmi.RemoteException{
    if (claimService == null)
      _initClaimServiceProxy();
    return claimService.getClaimsListByLossDateRange(payload);
  }
  
  public com.mitchell.www.examples.claim.UpDateClaimResponse upDateClaim(com.mitchell.www.examples.claim.MitchellClaimUpdateType payload) throws java.rmi.RemoteException{
    if (claimService == null)
      _initClaimServiceProxy();
    return claimService.upDateClaim(payload);
  }
  
  public com.mitchell.www.examples.claim.CreateClaimResponse createClaim(com.mitchell.www.examples.claim.MitchellClaimType payload) throws java.rmi.RemoteException{
    if (claimService == null)
      _initClaimServiceProxy();
    return claimService.createClaim(payload);
  }
  
  
}