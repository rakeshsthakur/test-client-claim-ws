/**
 * MitchellClaimUpdateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mitchell.www.examples.claim;

public class MitchellClaimUpdateType  implements java.io.Serializable {
    private java.lang.String claimNumber;

    private java.lang.Long assignedAdjusterID;

    private com.mitchell.www.examples.claim.VehicleUpdateInfoType[] vehiclesUpdate;

    public MitchellClaimUpdateType() {
    }

    public MitchellClaimUpdateType(
           java.lang.String claimNumber,
           java.lang.Long assignedAdjusterID,
           com.mitchell.www.examples.claim.VehicleUpdateInfoType[] vehiclesUpdate) {
           this.claimNumber = claimNumber;
           this.assignedAdjusterID = assignedAdjusterID;
           this.vehiclesUpdate = vehiclesUpdate;
    }


    /**
     * Gets the claimNumber value for this MitchellClaimUpdateType.
     * 
     * @return claimNumber
     */
    public java.lang.String getClaimNumber() {
        return claimNumber;
    }


    /**
     * Sets the claimNumber value for this MitchellClaimUpdateType.
     * 
     * @param claimNumber
     */
    public void setClaimNumber(java.lang.String claimNumber) {
        this.claimNumber = claimNumber;
    }


    /**
     * Gets the assignedAdjusterID value for this MitchellClaimUpdateType.
     * 
     * @return assignedAdjusterID
     */
    public java.lang.Long getAssignedAdjusterID() {
        return assignedAdjusterID;
    }


    /**
     * Sets the assignedAdjusterID value for this MitchellClaimUpdateType.
     * 
     * @param assignedAdjusterID
     */
    public void setAssignedAdjusterID(java.lang.Long assignedAdjusterID) {
        this.assignedAdjusterID = assignedAdjusterID;
    }


    /**
     * Gets the vehiclesUpdate value for this MitchellClaimUpdateType.
     * 
     * @return vehiclesUpdate
     */
    public com.mitchell.www.examples.claim.VehicleUpdateInfoType[] getVehiclesUpdate() {
        return vehiclesUpdate;
    }


    /**
     * Sets the vehiclesUpdate value for this MitchellClaimUpdateType.
     * 
     * @param vehiclesUpdate
     */
    public void setVehiclesUpdate(com.mitchell.www.examples.claim.VehicleUpdateInfoType[] vehiclesUpdate) {
        this.vehiclesUpdate = vehiclesUpdate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MitchellClaimUpdateType)) return false;
        MitchellClaimUpdateType other = (MitchellClaimUpdateType) obj;
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
            ((this.assignedAdjusterID==null && other.getAssignedAdjusterID()==null) || 
             (this.assignedAdjusterID!=null &&
              this.assignedAdjusterID.equals(other.getAssignedAdjusterID()))) &&
            ((this.vehiclesUpdate==null && other.getVehiclesUpdate()==null) || 
             (this.vehiclesUpdate!=null &&
              java.util.Arrays.equals(this.vehiclesUpdate, other.getVehiclesUpdate())));
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
        if (getAssignedAdjusterID() != null) {
            _hashCode += getAssignedAdjusterID().hashCode();
        }
        if (getVehiclesUpdate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehiclesUpdate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehiclesUpdate(), i);
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
        new org.apache.axis.description.TypeDesc(MitchellClaimUpdateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MitchellClaimUpdateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "ClaimNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("vehiclesUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehiclesUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleUpdateInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleUpdateDetails"));
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
