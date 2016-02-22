/**
 * MitchellClaimType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mitchell.www.examples.claim;

public class MitchellClaimType  implements java.io.Serializable {
    private java.lang.String claimNumber;

    private java.lang.String claimantFirstName;

    private java.lang.String claimantLastName;

    private java.lang.String status;

    private java.util.Calendar lossDate;

    private com.mitchell.www.examples.claim.LossInfoType lossInfo;

    private java.lang.Long assignedAdjusterID;

    private com.mitchell.www.examples.claim.VehicleInfoType[] vehicles;

    public MitchellClaimType() {
    }

    public MitchellClaimType(
           java.lang.String claimNumber,
           java.lang.String claimantFirstName,
           java.lang.String claimantLastName,
           java.lang.String status,
           java.util.Calendar lossDate,
           com.mitchell.www.examples.claim.LossInfoType lossInfo,
           java.lang.Long assignedAdjusterID,
           com.mitchell.www.examples.claim.VehicleInfoType[] vehicles) {
           this.claimNumber = claimNumber;
           this.claimantFirstName = claimantFirstName;
           this.claimantLastName = claimantLastName;
           this.status = status;
           this.lossDate = lossDate;
           this.lossInfo = lossInfo;
           this.assignedAdjusterID = assignedAdjusterID;
           this.vehicles = vehicles;
    }


    /**
     * Gets the claimNumber value for this MitchellClaimType.
     * 
     * @return claimNumber
     */
    public java.lang.String getClaimNumber() {
        return claimNumber;
    }


    /**
     * Sets the claimNumber value for this MitchellClaimType.
     * 
     * @param claimNumber
     */
    public void setClaimNumber(java.lang.String claimNumber) {
        this.claimNumber = claimNumber;
    }


    /**
     * Gets the claimantFirstName value for this MitchellClaimType.
     * 
     * @return claimantFirstName
     */
    public java.lang.String getClaimantFirstName() {
        return claimantFirstName;
    }


    /**
     * Sets the claimantFirstName value for this MitchellClaimType.
     * 
     * @param claimantFirstName
     */
    public void setClaimantFirstName(java.lang.String claimantFirstName) {
        this.claimantFirstName = claimantFirstName;
    }


    /**
     * Gets the claimantLastName value for this MitchellClaimType.
     * 
     * @return claimantLastName
     */
    public java.lang.String getClaimantLastName() {
        return claimantLastName;
    }


    /**
     * Sets the claimantLastName value for this MitchellClaimType.
     * 
     * @param claimantLastName
     */
    public void setClaimantLastName(java.lang.String claimantLastName) {
        this.claimantLastName = claimantLastName;
    }


    /**
     * Gets the status value for this MitchellClaimType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MitchellClaimType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the lossDate value for this MitchellClaimType.
     * 
     * @return lossDate
     */
    public java.util.Calendar getLossDate() {
        return lossDate;
    }


    /**
     * Sets the lossDate value for this MitchellClaimType.
     * 
     * @param lossDate
     */
    public void setLossDate(java.util.Calendar lossDate) {
        this.lossDate = lossDate;
    }


    /**
     * Gets the lossInfo value for this MitchellClaimType.
     * 
     * @return lossInfo
     */
    public com.mitchell.www.examples.claim.LossInfoType getLossInfo() {
        return lossInfo;
    }


    /**
     * Sets the lossInfo value for this MitchellClaimType.
     * 
     * @param lossInfo
     */
    public void setLossInfo(com.mitchell.www.examples.claim.LossInfoType lossInfo) {
        this.lossInfo = lossInfo;
    }


    /**
     * Gets the assignedAdjusterID value for this MitchellClaimType.
     * 
     * @return assignedAdjusterID
     */
    public java.lang.Long getAssignedAdjusterID() {
        return assignedAdjusterID;
    }


    /**
     * Sets the assignedAdjusterID value for this MitchellClaimType.
     * 
     * @param assignedAdjusterID
     */
    public void setAssignedAdjusterID(java.lang.Long assignedAdjusterID) {
        this.assignedAdjusterID = assignedAdjusterID;
    }


    /**
     * Gets the vehicles value for this MitchellClaimType.
     * 
     * @return vehicles
     */
    public com.mitchell.www.examples.claim.VehicleInfoType[] getVehicles() {
        return vehicles;
    }


    /**
     * Sets the vehicles value for this MitchellClaimType.
     * 
     * @param vehicles
     */
    public void setVehicles(com.mitchell.www.examples.claim.VehicleInfoType[] vehicles) {
        this.vehicles = vehicles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MitchellClaimType)) return false;
        MitchellClaimType other = (MitchellClaimType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimNumber==null && other.getClaimNumber()==null) || 
             (this.claimNumber!=null &&
              this.claimNumber.equals(other.getClaimNumber()))) &&
            ((this.claimantFirstName==null && other.getClaimantFirstName()==null) || 
             (this.claimantFirstName!=null &&
              this.claimantFirstName.equals(other.getClaimantFirstName()))) &&
            ((this.claimantLastName==null && other.getClaimantLastName()==null) || 
             (this.claimantLastName!=null &&
              this.claimantLastName.equals(other.getClaimantLastName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.lossDate==null && other.getLossDate()==null) || 
             (this.lossDate!=null &&
              this.lossDate.equals(other.getLossDate()))) &&
            ((this.lossInfo==null && other.getLossInfo()==null) || 
             (this.lossInfo!=null &&
              this.lossInfo.equals(other.getLossInfo()))) &&
            ((this.assignedAdjusterID==null && other.getAssignedAdjusterID()==null) || 
             (this.assignedAdjusterID!=null &&
              this.assignedAdjusterID.equals(other.getAssignedAdjusterID()))) &&
            ((this.vehicles==null && other.getVehicles()==null) || 
             (this.vehicles!=null &&
              java.util.Arrays.equals(this.vehicles, other.getVehicles())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getClaimNumber() != null) {
            _hashCode += getClaimNumber().hashCode();
        }
        if (getClaimantFirstName() != null) {
            _hashCode += getClaimantFirstName().hashCode();
        }
        if (getClaimantLastName() != null) {
            _hashCode += getClaimantLastName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getLossDate() != null) {
            _hashCode += getLossDate().hashCode();
        }
        if (getLossInfo() != null) {
            _hashCode += getLossInfo().hashCode();
        }
        if (getAssignedAdjusterID() != null) {
            _hashCode += getAssignedAdjusterID().hashCode();
        }
        if (getVehicles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehicles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehicles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MitchellClaimType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaimType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "ClaimNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimantFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "ClaimantFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimantLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "ClaimantLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "LossDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "LossInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "LossInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedAdjusterID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "AssignedAdjusterID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "Vehicles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleDetails"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
