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
// Generated on: 2011.02.18 at 12:55:00 PM CET 
//


package com.abiquo.virtualfactory.model.jobs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.abiquo.virtualfactory.model.jobs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HypervisorConnection_QNAME = new QName("http://abiquo.com/virtualfactory/model/jobs", "HypervisorConnection");
    private final static QName _VirtualMachineAction_QNAME = new QName("http://abiquo.com/virtualfactory/model/jobs", "VirtualMachineAction");
    private final static QName _CreateVirtualMachine_QNAME = new QName("http://abiquo.com/virtualfactory/model/jobs", "CreateVirtualMachine");
    private final static QName _SnapshootVirtualMachine_QNAME = new QName("http://abiquo.com/virtualfactory/model/jobs", "SnapshootVirtualMachine");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.abiquo.virtualfactory.model.jobs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VirtualMachine.SecondaryDisks }
     * 
     */
    public VirtualMachine.SecondaryDisks createVirtualMachineSecondaryDisks() {
        return new VirtualMachine.SecondaryDisks();
    }

    /**
     * Create an instance of {@link AuxDisk }
     * 
     */
    public AuxDisk createAuxDisk() {
        return new AuxDisk();
    }

    /**
     * Create an instance of {@link VirtualMachine.NetworkConf }
     * 
     */
    public VirtualMachine.NetworkConf createVirtualMachineNetworkConf() {
        return new VirtualMachine.NetworkConf();
    }

    /**
     * Create an instance of {@link VirtualMachine.PrimaryDisk.DiskStandardConf }
     * 
     */
    public VirtualMachine.PrimaryDisk.DiskStandardConf createVirtualMachinePrimaryDiskDiskStandardConf() {
        return new VirtualMachine.PrimaryDisk.DiskStandardConf();
    }

    /**
     * Create an instance of {@link HardwareConf }
     * 
     */
    public HardwareConf createHardwareConf() {
        return new HardwareConf();
    }

    /**
     * Create an instance of {@link DiskStandard }
     * 
     */
    public DiskStandard createDiskStandard() {
        return new DiskStandard();
    }

    /**
     * Create an instance of {@link DiskStatefull }
     * 
     */
    public DiskStatefull createDiskStatefull() {
        return new DiskStatefull();
    }

    /**
     * Create an instance of {@link SnapshootVirtualMachine.SourceDisk }
     * 
     */
    public SnapshootVirtualMachine.SourceDisk createSnapshootVirtualMachineSourceDisk() {
        return new SnapshootVirtualMachine.SourceDisk();
    }

    /**
     * Create an instance of {@link VirtualNIC }
     * 
     */
    public VirtualNIC createVirtualNIC() {
        return new VirtualNIC();
    }

    /**
     * Create an instance of {@link VirtualMachine.PrimaryDisk }
     * 
     */
    public VirtualMachine.PrimaryDisk createVirtualMachinePrimaryDisk() {
        return new VirtualMachine.PrimaryDisk();
    }

    /**
     * Create an instance of {@link CreateVirtualMachine }
     * 
     */
    public CreateVirtualMachine createCreateVirtualMachine() {
        return new CreateVirtualMachine();
    }

    /**
     * Create an instance of {@link DiskDesc }
     * 
     */
    public DiskDesc createDiskDesc() {
        return new DiskDesc();
    }

    /**
     * Create an instance of {@link VirtualMachine }
     * 
     */
    public VirtualMachine createVirtualMachine() {
        return new VirtualMachine();
    }

    /**
     * Create an instance of {@link SnapshootVirtualMachine }
     * 
     */
    public SnapshootVirtualMachine createSnapshootVirtualMachine() {
        return new SnapshootVirtualMachine();
    }

    /**
     * Create an instance of {@link HypervisorConnection }
     * 
     */
    public HypervisorConnection createHypervisorConnection() {
        return new HypervisorConnection();
    }

    /**
     * Create an instance of {@link VirtualMachineAction }
     * 
     */
    public VirtualMachineAction createVirtualMachineAction() {
        return new VirtualMachineAction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HypervisorConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abiquo.com/virtualfactory/model/jobs", name = "HypervisorConnection")
    public JAXBElement<HypervisorConnection> createHypervisorConnection(HypervisorConnection value) {
        return new JAXBElement<HypervisorConnection>(_HypervisorConnection_QNAME, HypervisorConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirtualMachineAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abiquo.com/virtualfactory/model/jobs", name = "VirtualMachineAction")
    public JAXBElement<VirtualMachineAction> createVirtualMachineAction(VirtualMachineAction value) {
        return new JAXBElement<VirtualMachineAction>(_VirtualMachineAction_QNAME, VirtualMachineAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVirtualMachine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abiquo.com/virtualfactory/model/jobs", name = "CreateVirtualMachine")
    public JAXBElement<CreateVirtualMachine> createCreateVirtualMachine(CreateVirtualMachine value) {
        return new JAXBElement<CreateVirtualMachine>(_CreateVirtualMachine_QNAME, CreateVirtualMachine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnapshootVirtualMachine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abiquo.com/virtualfactory/model/jobs", name = "SnapshootVirtualMachine")
    public JAXBElement<SnapshootVirtualMachine> createSnapshootVirtualMachine(SnapshootVirtualMachine value) {
        return new JAXBElement<SnapshootVirtualMachine>(_SnapshootVirtualMachine_QNAME, SnapshootVirtualMachine.class, null, value);
    }

}
