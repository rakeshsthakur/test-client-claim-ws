/**
 * VehicleInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mitchell.www.examples.claim;

public class VehicleInfoType  implements java.io.Serializable {
    private int modelYear;

    private java.lang.String makeDescription;

    private java.lang.String modelDescription;

    private java.lang.String engineDescription;

    private java.lang.String exteriorColor;

    private java.lang.String vin;

    private java.lang.String licPlate;

    private java.lang.String licPlateState;

    private java.util.Date licPlateExpDate;

    private java.lang.String damageDescription;

    private java.lang.Integer mileage;

    public VehicleInfoType() {
    }

    public VehicleInfoType(
           int modelYear,
           java.lang.String makeDescription,
           java.lang.String modelDescription,
           java.lang.String engineDescription,
           java.lang.String exteriorColor,
           java.lang.String vin,
           java.lang.String licPlate,
           java.lang.String licPlateState,
           java.util.Date licPlateExpDate,
           java.lang.String damageDescription,
           java.lang.Integer mileage) {
           this.modelYear = modelYear;
           this.makeDescription = makeDescription;
           this.modelDescription = modelDescription;
           this.engineDescription = engineDescription;
           this.exteriorColor = exteriorColor;
           this.vin = vin;
           this.licPlate = licPlate;
           this.licPlateState = licPlateState;
           this.licPlateExpDate = licPlateExpDate;
           this.damageDescription = damageDescription;
           this.mileage = mileage;
    }


    /**
     * Gets the modelYear value for this VehicleInfoType.
     * 
     * @return modelYear
     */
    public int getModelYear() {
        return modelYear;
    }


    /**
     * Sets the modelYear value for this VehicleInfoType.
     * 
     * @param modelYear
     */
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }


    /**
     * Gets the makeDescription value for this VehicleInfoType.
     * 
     * @return makeDescription
     */
    public java.lang.String getMakeDescription() {
        return makeDescription;
    }


    /**
     * Sets the makeDescription value for this VehicleInfoType.
     * 
     * @param makeDescription
     */
    public void setMakeDescription(java.lang.String makeDescription) {
        this.makeDescription = makeDescription;
    }


    /**
     * Gets the modelDescription value for this VehicleInfoType.
     * 
     * @return modelDescription
     */
    public java.lang.String getModelDescription() {
        return modelDescription;
    }


    /**
     * Sets the modelDescription value for this VehicleInfoType.
     * 
     * @param modelDescription
     */
    public void setModelDescription(java.lang.String modelDescription) {
        this.modelDescription = modelDescription;
    }


    /**
     * Gets the engineDescription value for this VehicleInfoType.
     * 
     * @return engineDescription
     */
    public java.lang.String getEngineDescription() {
        return engineDescription;
    }


    /**
     * Sets the engineDescription value for this VehicleInfoType.
     * 
     * @param engineDescription
     */
    public void setEngineDescription(java.lang.String engineDescription) {
        this.engineDescription = engineDescription;
    }


    /**
     * Gets the exteriorColor value for this VehicleInfoType.
     * 
     * @return exteriorColor
     */
    public java.lang.String getExteriorColor() {
        return exteriorColor;
    }


    /**
     * Sets the exteriorColor value for this VehicleInfoType.
     * 
     * @param exteriorColor
     */
    public void setExteriorColor(java.lang.String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }


    /**
     * Gets the vin value for this VehicleInfoType.
     * 
     * @return vin
     */
    public java.lang.String getVin() {
        return vin;
    }


    /**
     * Sets the vin value for this VehicleInfoType.
     * 
     * @param vin
     */
    public void setVin(java.lang.String vin) {
        this.vin = vin;
    }


    /**
     * Gets the licPlate value for this VehicleInfoType.
     * 
     * @return licPlate
     */
    public java.lang.String getLicPlate() {
        return licPlate;
    }


    /**
     * Sets the licPlate value for this VehicleInfoType.
     * 
     * @param licPlate
     */
    public void setLicPlate(java.lang.String licPlate) {
        this.licPlate = licPlate;
    }


    /**
     * Gets the licPlateState value for this VehicleInfoType.
     * 
     * @return licPlateState
     */
    public java.lang.String getLicPlateState() {
        return licPlateState;
    }


    /**
     * Sets the licPlateState value for this VehicleInfoType.
     * 
     * @param licPlateState
     */
    public void setLicPlateState(java.lang.String licPlateState) {
        this.licPlateState = licPlateState;
    }


    /**
     * Gets the licPlateExpDate value for this VehicleInfoType.
     * 
     * @return licPlateExpDate
     */
    public java.util.Date getLicPlateExpDate() {
        return licPlateExpDate;
    }


    /**
     * Sets the licPlateExpDate value for this VehicleInfoType.
     * 
     * @param licPlateExpDate
     */
    public void setLicPlateExpDate(java.util.Date licPlateExpDate) {
        this.licPlateExpDate = licPlateExpDate;
    }


    /**
     * Gets the damageDescription value for this VehicleInfoType.
     * 
     * @return damageDescription
     */
    public java.lang.String getDamageDescription() {
        return damageDescription;
    }


    /**
     * Sets the damageDescription value for this VehicleInfoType.
     * 
     * @param damageDescription
     */
    public void setDamageDescription(java.lang.String damageDescription) {
        this.damageDescription = damageDescription;
    }


    /**
     * Gets the mileage value for this VehicleInfoType.
     * 
     * @return mileage
     */
    public java.lang.Integer getMileage() {
        return mileage;
    }


    /**
     * Sets the mileage value for this VehicleInfoType.
     * 
     * @param mileage
     */
    public void setMileage(java.lang.Integer mileage) {
        this.mileage = mileage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleInfoType)) return false;
        VehicleInfoType other = (VehicleInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.modelYear == other.getModelYear() &&
            ((this.makeDescription==null && other.getMakeDescription()==null) || 
             (this.makeDescription!=null &&
              this.makeDescription.equals(other.getMakeDescription()))) &&
            ((this.modelDescription==null && other.getModelDescription()==null) || 
             (this.modelDescription!=null &&
              this.modelDescription.equals(other.getModelDescription()))) &&
            ((this.engineDescription==null && other.getEngineDescription()==null) || 
             (this.engineDescription!=null &&
              this.engineDescription.equals(other.getEngineDescription()))) &&
            ((this.exteriorColor==null && other.getExteriorColor()==null) || 
             (this.exteriorColor!=null &&
              this.exteriorColor.equals(other.getExteriorColor()))) &&
            ((this.vin==null && other.getVin()==null) || 
             (this.vin!=null &&
              this.vin.equals(other.getVin()))) &&
            ((this.licPlate==null && other.getLicPlate()==null) || 
             (this.licPlate!=null &&
              this.licPlate.equals(other.getLicPlate()))) &&
            ((this.licPlateState==null && other.getLicPlateState()==null) || 
             (this.licPlateState!=null &&
              this.licPlateState.equals(other.getLicPlateState()))) &&
            ((this.licPlateExpDate==null && other.getLicPlateExpDate()==null) || 
             (this.licPlateExpDate!=null &&
              this.licPlateExpDate.equals(other.getLicPlateExpDate()))) &&
            ((this.damageDescription==null && other.getDamageDescription()==null) || 
             (this.damageDescription!=null &&
              this.damageDescription.equals(other.getDamageDescription()))) &&
            ((this.mileage==null && other.getMileage()==null) || 
             (this.mileage!=null &&
              this.mileage.equals(other.getMileage())));
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
        _hashCode += getModelYear();
        if (getMakeDescription() != null) {
            _hashCode += getMakeDescription().hashCode();
        }
        if (getModelDescription() != null) {
            _hashCode += getModelDescription().hashCode();
        }
        if (getEngineDescription() != null) {
            _hashCode += getEngineDescription().hashCode();
        }
        if (getExteriorColor() != null) {
            _hashCode += getExteriorColor().hashCode();
        }
        if (getVin() != null) {
            _hashCode += getVin().hashCode();
        }
        if (getLicPlate() != null) {
            _hashCode += getLicPlate().hashCode();
        }
        if (getLicPlateState() != null) {
            _hashCode += getLicPlateState().hashCode();
        }
        if (getLicPlateExpDate() != null) {
            _hashCode += getLicPlateExpDate().hashCode();
        }
        if (getDamageDescription() != null) {
            _hashCode += getDamageDescription().hashCode();
        }
        if (getMileage() != null) {
            _hashCode += getMileage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "VehicleInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "ModelYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "MakeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "ModelDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engineDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "EngineDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("licPlate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "LicPlate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licPlateState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "LicPlateState"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damageDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "DamageDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mileage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "Mileage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
