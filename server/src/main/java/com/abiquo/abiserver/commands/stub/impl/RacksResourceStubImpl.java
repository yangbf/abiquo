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

package com.abiquo.abiserver.commands.stub.impl;

import java.util.List;

import com.abiquo.abiserver.commands.stub.AbstractAPIStub;
import com.abiquo.abiserver.commands.stub.RacksResourceStub;
import com.abiquo.abiserver.networking.IPAddress;
import com.abiquo.abiserver.pojo.infrastructure.DataCenter;
import com.abiquo.abiserver.pojo.infrastructure.Rack;
import com.abiquo.abiserver.pojo.infrastructure.UcsRack;
import com.abiquo.abiserver.pojo.result.BasicResult;
import com.abiquo.abiserver.pojo.result.DataResult;
import com.abiquo.model.enumerator.HypervisorType;

public class RacksResourceStubImpl extends AbstractAPIStub implements RacksResourceStub
{
    /**
     * @see com.abiquo.abiserver.commands.stub.RacksResourceStub#createUcsRack(com.abiquo.server.core.infrastructure.UcsRack)
     */
    @Override
    public DataResult<UcsRack> createUcsRack(UcsRack ucsRack)
    {
        // PREMIUM

        return null;
    }

    /**
     * @see com.abiquo.abiserver.commands.stub.RacksResourceStub#getAllNotManagedRacks(com.abiquo.abiserver.pojo.infrastructure.DataCenter)
     */
    public DataResult<List<Rack>> getAllNotManagedRacks(DataCenter datacenter)
    {
        // PREMIUM
        return null;
    }

    @Override
    public BasicResult associateBlades(Integer datacenterId, Integer rackId, IPAddress ipFrom,
        IPAddress ipTo, HypervisorType hypervisorType, String user, String password, Integer port,
        String vSwitchName)
    {
        return null;
    }

    @Override
    public BasicResult powerOnMachine(Integer datacenterId, Integer rackId, Integer machineId)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BasicResult powerOffMachine(Integer datacenterId, Integer rackId, Integer machineId)
    {
        // TODO Auto-generated method stub
        return null;
    }
 
    /**
     * @see com.abiquo.abiserver.commands.stub.RacksResourceStub#getUcsRacks(com.abiquo.abiserver.pojo.infrastructure.DataCenter)
     */
    public DataResult<List<UcsRack>> getUcsRacks(DataCenter datacenter)
    {
        // PREMIUM
        return null;
    }
}
