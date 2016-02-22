/**
 * ClaimService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mitchell.www.examples.claim;

public interface ClaimService extends java.rmi.Remote {
    public com.mitchell.www.examples.claim.GetClaimByClaimIdResponse getClaimByClaimId(com.mitchell.www.examples.claim.GetClaimByClaimIdRequest payload) throws java.rmi.RemoteException;
    public com.mitchell.www.examples.claim.MitchellClaimType[] getClaimsListByLossDateRange(com.mitchell.www.examples.claim.GetClaimsListByLossDateRanageRequest payload) throws java.rmi.RemoteException;
    public com.mitchell.www.examples.claim.UpDateClaimResponse upDateClaim(com.mitchell.www.examples.claim.MitchellClaimUpdateType payload) throws java.rmi.RemoteException;
    public com.mitchell.www.examples.claim.CreateClaimResponse createClaim(com.mitchell.www.examples.claim.MitchellClaimType payload) throws java.rmi.RemoteException;
}
