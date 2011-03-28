/**
 * Abiquo community edition
 * cloud management application for hybrid clouds
 * Copyright (C) 2008-2010 - Abiquo Holdings S.L.
 *
 * This application is free software; you can redistribute it and/or
 * modify it under the terms of the GNU LESSER GENERAL PUBLIC
 * LICENSE as published by the Free Software Foundation under
 * version 3 of the License
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * LESSER GENERAL PUBLIC LICENSE v.3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.02 at 03:37:41 PM CET 
//


package com.abiquo.commons.amqp.impl.datacenter.domain.jobs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateVirtualMachine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateVirtualMachine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hypervisorConnection" type="{http://abiquo.com/tarantino/model/jobs}HypervisorConnection"/>
 *         &lt;element name="virtualMahine" type="{http://abiquo.com/tarantino/model/jobs}VirtualMachine"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVirtualMachine", propOrder = {
    "hypervisorConnection",
    "virtualMahine"
})
public class CreateVirtualMachine {

    @XmlElement(required = true)
    protected HypervisorConnectionDto hypervisorConnection;
    @XmlElement(required = true)
    protected VirtualMachineDefinitionDto virtualMahine;

    /**
     * Gets the value of the hypervisorConnection property.
     * 
     * @return
     *     possible object is
     *     {@link HypervisorConnectionDto }
     *     
     */
    public HypervisorConnectionDto getHypervisorConnection() {
        return hypervisorConnection;
    }

    /**
     * Sets the value of the hypervisorConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link HypervisorConnectionDto }
     *     
     */
    public void setHypervisorConnection(HypervisorConnectionDto value) {
        this.hypervisorConnection = value;
    }

    /**
     * Gets the value of the virtualMahine property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineDefinitionDto }
     *     
     */
    public VirtualMachineDefinitionDto getVirtualMahine() {
        return virtualMahine;
    }

    /**
     * Sets the value of the virtualMahine property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineDefinitionDto }
     *     
     */
    public void setVirtualMahine(VirtualMachineDefinitionDto value) {
        this.virtualMahine = value;
    }

}