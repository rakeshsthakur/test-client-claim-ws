/**
 * LossInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mitchell.www.examples.claim;

public class LossInfoType  implements java.io.Serializable {
    private java.lang.String causeOfLoss;

    private java.util.Calendar reportedDate;

    private java.lang.String lossDescription;

    public LossInfoType() {
    }

    public LossInfoType(
           java.lang.String causeOfLoss,
           java.util.Calendar reportedDate,
           java.lang.String lossDescription) {
           this.causeOfLoss = causeOfLoss;
           this.reportedDate = reportedDate;
           this.lossDescription = lossDescription;
    }


    /**
     * Gets the causeOfLoss value for this LossInfoType.
     * 
     * @return causeOfLoss
     */
    public java.lang.String getCauseOfLoss() {
        return causeOfLoss;
    }


    /**
     * Sets the causeOfLoss value for this LossInfoType.
     * 
     * @param causeOfLoss
     */
    public void setCauseOfLoss(java.lang.String causeOfLoss) {
        this.causeOfLoss = causeOfLoss;
    }


    /**
     * Gets the reportedDate value for this LossInfoType.
     * 
     * @return reportedDate
     */
    public java.util.Calendar getReportedDate() {
        return reportedDate;
    }


    /**
     * Sets the reportedDate value for this LossInfoType.
     * 
     * @param reportedDate
     */
    public void setReportedDate(java.util.Calendar reportedDate) {
        this.reportedDate = reportedDate;
    }


    /**
     * Gets the lossDescription value for this LossInfoType.
     * 
     * @return lossDescription
     */
    public java.lang.String getLossDescription() {
        return lossDescription;
    }


    /**
     * Sets the lossDescription value for this LossInfoType.
     * 
     * @param lossDescription
     */
    public void setLossDescription(java.lang.String lossDescription) {
        this.lossDescription = lossDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LossInfoType)) return false;
        LossInfoType other = (LossInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.causeOfLoss==null && other.getCauseOfLoss()==null) || 
             (this.causeOfLoss!=null &&
              this.causeOfLoss.equals(other.getCauseOfLoss()))) &&
            ((this.reportedDate==null && other.getReportedDate()==null) || 
             (this.reportedDate!=null &&
              this.reportedDate.equals(other.getReportedDate()))) &&
            ((this.lossDescription==null && other.getLossDescription()==null) || 
             (this.lossDescription!=null &&
              this.lossDescription.equals(other.getLossDescription())));
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
        if (getCauseOfLoss() != null) {
            _hashCode += getCauseOfLoss().hashCode();
        }
        if (getReportedDate() != null) {
            _hashCode += getReportedDate().hashCode();
        }
        if (getLossDescription() != null) {
            _hashCode += getLossDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LossInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "LossInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causeOfLoss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "CauseOfLoss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "ReportedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mitchell.com/examples/claim", "LossDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
