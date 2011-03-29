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

package com.abiquo.commons.amqp.impl.datacenter.domain.builder;

import com.abiquo.commons.amqp.impl.datacenter.domain.DiskDescription.DiskFormatType;
import com.abiquo.commons.amqp.impl.datacenter.domain.HypervisorConnection.HypervisorType;
import com.abiquo.commons.amqp.impl.datacenter.domain.StateTransaction;
import com.abiquo.commons.amqp.impl.datacenter.domain.dto.ApplyVirtualMachineStateDto;
import com.abiquo.commons.amqp.impl.datacenter.domain.dto.ConfigureVirtualMachineDto;
import com.abiquo.commons.amqp.impl.datacenter.domain.dto.ReconfigureVirtualMachineDto;
import com.abiquo.commons.amqp.impl.datacenter.domain.dto.SnapshotVirtualMachineDto;

public class VirtualFactoryTestJobs
{

    public VirtualMachineDescriptionBuilder testVirtualMachine()
    {
        return new VirtualMachineDescriptionBuilder() //
            .hardware(1, 256) //
            .addNetwork("mac:mac:mac", "127.0.0.1", "vSwitchName", "networkName", 1, "leaseName",
                "forwardMode", "netAddress", "gateway", "mask", "primaryDNS", "secondaryDNS",
                "sufixDNS", 0) //
            // .primaryDisk("RAW", "1024", "iqn.bla.bla-lun-0")
            .primaryDisk(DiskFormatType.RAW, 1024l, "nfs-devel:/opt/vm_repo",
                "1/rs.bcn/m0n0/m0n0.iso", "datastore1") //
            .addAuxDisk(DiskFormatType.RAW, 1024l, "iqn....", 1);

    }

    public ConfigureVirtualMachineDto testConfigureVirtualMachine(
        VirtualMachineDescriptionBuilder vmbuilder)
    {

        return new ConfigureVirtualMachineJobBuilder() //
            .connection(HypervisorType.XEN_3, "10.60.1.15", "root", "root") //
            .setVirtualMachineDefinition(vmbuilder, "virtualMachineID") //
            .buildConfigureVirtualMachineDto();

    }

    public ApplyVirtualMachineStateDto testApplyVirtualMachineState(
        VirtualMachineDescriptionBuilder vmbuilder)
    {
        return new ApplyVirtualMachineStateJobBuilder() //
            .connection(HypervisorType.XEN_3, "10.60.1.15", "root", "root") //
            .setVirtualMachineDefinition(vmbuilder, "virtualMachineID") //
            .state(StateTransaction.PAUSE)//
            .buildApplyVirtualMachineStateDto();
    }

    public SnapshotVirtualMachineDto testSnapshotVirtualMachine(
        VirtualMachineDescriptionBuilder vmbuilder)
    {
        return new SnapshotVirtualMachineJobBuilder()
            .connection(HypervisorType.XEN_3, "10.60.1.15", "root", "root") //
            .setVirtualMachineDefinition(vmbuilder, "virtualMachineID") //
            .destinationDisk(DiskFormatType.RAW, 1024l, "nfs-devel:/opt/vm_repository",
                "1/some/bundle/m0n0.iso")//
            .buildSnapshotVirtualMachineDto();
    }

    public ReconfigureVirtualMachineDto testReconfigureVirtualMachine(
        VirtualMachineDescriptionBuilder vmbuilder)
    {
        return new ReconfigureVirtualMachineJobBuilder()//
            .connection(HypervisorType.XEN_3, "10.60.1.15", "root", "root") //
            .setVirtualMachineDefinition(vmbuilder, "virtualMachineID") //
            .setNewVirtualMachineDefinition(vmbuilder.hardware(4, 512), "virtualMachineID") //
            .buildReconfigureVirtualMachineDto();

    }

}
