/**
 * VehicleUpdateInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mitchell.www.examples.claim;

public class VehicleUpdateInfoType  implements java.io.Serializable {
    private java.lang.String exteriorColor;

    private java.lang.String vin;

    private java.util.Date licPlateExpDate;

    public VehicleUpdateInfoType() {
    }

    public VehicleUpdateInfoType(
           java.lang.String exteriorColor,
           java.lang.String vin,
           java.util.Date licPlateExpDate) {
           this.exteriorColor = exteriorColor;
           this.vin = vin;
           this.licPlateExpDate = licPlateExpDate;
    }


    /**
     * Gets the exteriorColor value for this VehicleUpdateInfoType.
     * 
     * @return exteriorColor
     */
    public java.lang.String getExteriorColor() {
        return exteriorColor;
    }


    /**
     * Sets the exteriorColor value for this VehicleUpdateInfoType.
     * 
     * @param exteriorColor
     */
    public void setExteriorColor(java.lang.String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }


    /**
     * Gets the vin value for this VehicleUpdateInfoType.
     * 
     * @return vin
     */
    public java.lang.String getVin() {
        return vin;
    }


    /**
     * Sets the vin value for this VehicleUpdateInfoType.
     * 
     * @param vin
     */
    public void setVin(java.lang.String vin) {
        this.vin = vin;
    }


    /**
     * Gets the licPlateExpDate value for this VehicleUpdateInfoType.
     * 
     * @return licPlateExpDate
     */
    public java.util.Date getLicPlateExpDate() {
        return licPlateExpDate;
    }


    /**
     * Sets the licPlateExpDate value for this VehicleUpdateInfoType.
     * 
     * @param licPlateExpDate
     */
    public void setLicPlateExpDate(java.util.Date licPlateExpDate) {
        this.licPlateExpDate = licPlateExpDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleUpdateInfoType)) return false;
        VehicleUpdateInfoType other = (VehicleUpdateInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exteriorColor==null && other.getExteriorColor()==null) || 
             (this.exteriorColor!=null &&
              this.exteriorColor.equals(other.getExteriorColor()))) &&
            ((this.vin==null && other.getVin()==null) || 
             (this.vin!=null &&
              this.vin.equals(other.getVin()))) &&
            ((this.licPlateExpDate==null && other.getLicPlateExpDate()==null) || 
             (this.licPlateExpDate!=null &&
              this.licPlateExpDate.equals(other.getLicPlateExpDate())));
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
        if (getExteriorColor() != null) {
            _hashCode += getExteriorColor().hashCode();
        }
        if (getVin() != null) {
            _hashCode += getVin().hashCode();
        }
        if (getLicPlateExpDate() != null) {
            _hashCode += getLicPlateExpDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleUpdateInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleUpdateInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exteriorColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "ExteriorColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "Vin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licPlateExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "LicPlateExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
