//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.02 at 03:37:41 PM CET 
//


package com.abiquo.tarantino.model.jobs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HardwareConf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HardwareConf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="virtualCpu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ramInMb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HardwareConf", propOrder = {
    "virtualCpu",
    "ramInMb"
})
public class HardwareConf {

    protected int virtualCpu;
    protected int ramInMb;

    /**
     * Gets the value of the virtualCpu property.
     * 
     */
    public int getVirtualCpu() {
        return virtualCpu;
    }

    /**
     * Sets the value of the virtualCpu property.
     * 
     */
    public void setVirtualCpu(int value) {
        this.virtualCpu = value;
    }

    /**
     * Gets the value of the ramInMb property.
     * 
     */
    public int getRamInMb() {
        return ramInMb;
    }

    /**
     * Sets the value of the ramInMb property.
     * 
     */
    public void setRamInMb(int value) {
        this.ramInMb = value;
    }

}
