/**
 * Abiquo community edition
 * cloud management application for hybrid clouds
 * Copyright (C) 2008-2010 - Abiquo Holdings S.L.
 *
 * This application is free software; you can redistribute it and/or
 * modify it under the terms of the GNU LESSER GENERAL PUBLIC
 * LICENSE as published by the Free Software Foundation under
 * version 3 of the License
 * * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * LESSER GENERAL PUBLIC LICENSE v.3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

package com.abiquo.api.exceptions;

import java.util.Arrays;
import java.util.Comparator;

import com.abiquo.model.validation.IscsiPath;
import com.abiquo.server.core.infrastructure.management.Rasd;

/**
 * Contains all the errors notified by the API.
 * 
 * @author eruiz
 */
public enum APIError
{
    // STATUSCODES
    STATUS_BAD_REQUEST("400-BAD REQUEST", "Request not valid"), STATUS_UNAUTHORIZED(
        "401-UNAUTHORIZED", "This requests requires user authentication"), STATUS_FORBIDDEN(
        "403-FORBIDDEN", "Access is denied"), STATUS_NOT_FOUND("404-NOT FOUND",
        "The Resource requested does not exist"), STATUS_METHOD_NOT_ALLOWED(
        "405-METHOD NOT ALLOWED", "The resource doesn't expose this method"), STATUS_CONFLICT(
        "409-CONFLICT", "Conflict"), STATUS_UNSUPPORTED_MEDIA_TYPE("415-UNSUPPORTED MEDIA TYPE",
        "Abiquo API currently only supports application/xml Media Type"), STATUS_INTERNAL_SERVER_ERROR(
        "500-INTERNAL SERVER ERROR", "Unexpected exception"), STATUS_UNPROVISIONED(
        "412 - Unprovisioned", "Unprovisioned exception"),

    // GENERIC
    MALFORMED_URI("GEN-0", "Malformed URI"), INVALID_ID("GEN-1", "Identifier can't be 0"), CONSTRAINT_VIOLATION(
        "GEN-2", "Invalid xml document, please make sure all the mandatory fields are right"), UNMARSHAL_EXCEPTION(
        "GEN-3", "Invalid xml document"), FORBIDDEN("GEN-4",
        "Not enough permissions to perform this action"), INVALID_CREDENTIALS("GEN-5",
        "Invalid credentials"),

    // INVALID_IP("GEN-4", "Invalid IP"),
    INVALID_PRIVATE_NETWORK_TYPE("GEN-6", "Invalid private network type"), INTERNAL_SERVER_ERROR(
        "GEN-7", "Unexpected error"), GENERIC_OPERATION_ERROR("GEN-8",
        "The operation could not be performed. Please, contact the Administrator."), NOT_ENOUGH_PRIVILEGES(
        "GEN-9", "Not enough privileges to perform this operation"), INCOHERENT_IDS("GEN-10",
        "The paramter ID is different from the Entity ID"),

    // DATACENTER
    NON_EXISTENT_DATACENTER("DC-0", "The requested datacenter does not exist"), DATACENTER_DUPLICATED_NAME(
        "DC-3", "There is already a datacenter with that name"), DATACENTER_NOT_ALLOWED("DC-4",
        "The current enterprise can't use this datacenter"),

    // ENTERPRISE
    NON_EXISTENT_ENTERPRISE("EN-0", "The requested enterprise does not exist"), ENTERPRISE_DUPLICATED_NAME(
        "ENTERPRISE-4", "Duplicated name for an enterprise"), ENTERPRISE_DELETE_ERROR_WITH_VDCS(
        "ENTERPRISE-5", "Cannot delete enterprise with associated virtual datacenters"), ENTERPRISE_DELETE_OWN_ENTERPRISE(
        "ENTERPRISE-6", "Cannot delete the current user enterprise"), ENTERPRISE_EMPTY_NAME(
        "ENTERPRISE-7", "Enterprise name can't be empty"), MISSING_ENTERPRISE_LINK("ENTERPRISE-8",
        "Missing enterprise link"), ENTERPRISE_WITH_BLOCKED_USER(
        "ENTERPRISE-9",
        "Cannot delete enterprise because some users have roles that cannot be deleted, please change their enterprise before continuing"),

    // LIMITS: Common for Enterprise and virtual datacenter
    LIMITS_INVALID_HARD_LIMIT_FOR_VLANS_PER_VDC("LIMIT-6",
        "Invalid vlan hard limit, it cannot be bigger than the number of vlans per virtual datacenter: {0}"), LIMITS_DUPLICATED(
        "LIMIT-7", "Duplicated limits by enterprise and datacenter"), LIMITS_NOT_EXIST("LIMIT-8",
        "Limits by enterprise and datacenter don't exist"), //
    ENTERPRISE_LIMIT_EDIT_ARE_SURPRASED("LIMIT-9",
        "Can not edit resource limits, current enterprise allocation exceeds the new specified limits "
            + "(see SYSTEM traces in order to determine which resources are on HARD limit)"), //
    DATACENTER_LIMIT_EDIT_ARE_SURPRASED(
        "LIMIT-10",
        "Can not edit resource limits, current enterprise and datacenter allocation exceeds the new specified limits "
            + "(see SYSTEM traces in order to determine witch resources are on HARD limit)"), DATACENTER_LIMIT_DELETE_VDCS(
        "LIMIT-11",
        "Cannot unassign datacenter from enterprise because it is being used by virtual datacenter(s)."),

    // VIRTUAL DATACENTER
    NON_EXISTENT_VIRTUAL_DATACENTER("VDC-0", "The requested virtual datacenter does not exist"), VIRTUAL_DATACENTER_INVALID_HYPERVISOR_TYPE(
        "VDC-1", "Invalid hypervisor type for this datacenter"), VIRTUAL_DATACENTER_CONTAINS_VIRTUAL_APPLIANCES(
        "VDC-2",
        "This datacenter contains virtual appliances and cannot be deleted without removing them first"), VIRTUAL_DATACENTER_CONTAINS_RESOURCES(
        "VDC-3",
        "This datacenter has volumes attached and cannot be deleted without removing them first"), VIRTUAL_DATACENTER_INVALID_NETWORKS(
        "VDC-4", "This datacenter has networks without IPs!"), VIRTUAL_DATACENTER_LIMIT_EDIT_ARE_SURPRASED(
        "VDC-5",
        "Can not edit resource limits, current virtual datacenter allocation exceeds the new specified limits "
            + "(see SYSTEM traces in order to determine witch resources are on HARD limit)"), VIRTUAL_DATACENTER_MUST_HAVE_NETWORK(
        "VDC-6", "Virtual Datacenter must be created with a private network"),

    // VLANS
    VLANS_PRIVATE_MAXIMUM_REACHED("VLAN-0",
        "You have reached the maximum VLANs you can create in this VirtualDatacenter"), VLANS_DUPLICATED_VLAN_NAME(
        "VLAN-1", "Can not create two VLANs with the same name in a VirtualDatacenter"), VLANS_PRIVATE_ADDRESS_WRONG(
        "VLAN-2", "Can not use any other address than the private range"), VLANS_TOO_BIG_NETWORK(
        "VLAN-3", "For performance reasons, Abiquo don't allow to create so big networks"), VLANS_TOO_BIG_NETWORK_II(
        "VLAN-4", "This network allows a netmask up to 24. Try a value between 30 and 24"), VLANS_TOO_SMALL_NETWORK(
        "VLAN-5", "The smallest network allowed has a 30 mask. Try a value between 30 and 24"), VLANS_INVALID_NETWORK_AND_MASK(
        "VLAN-6", "The network does not match with the mask. Check your request"), VLANS_GATEWAY_OUT_OF_RANGE(
        "VLAN-7", "Gateway address out of range. It must be into the ip range address"), VLANS_NON_EXISTENT_VIRTUAL_NETWORK(
        "VLAN-8", "The requested virtual network does not exist"),

    // VIRTUAL APPLIANCE
    NON_EXISTENT_VIRTUALAPPLIANCE("VAPP-0", "The requested virtual appliance does not exist"),

    // RACK
    NOT_ASSIGNED_RACK_DATACENTER("RACK-0", "The rack is not assigned to the datacenter"), RACK_DUPLICATED_NAME(
        "RACK-3", "There is already a rack with that name in this datacenter"), NON_EXISTENT_RACK(
        "RACK-4", "This rack does not exists"), NON_MANAGED_RACK("RACK-5",
        "Machines in this rack can not be discovered"), NON_UCS_RACK("RACK-6",
        "This rack is not an UCS Rack"), RACK_DUPLICATED_IP("RACK-7",
        "There is already a managed rack with this IP defined"),

    // MACHINE
    NON_EXISTENT_MACHINE("MACHINE-0", "The requested machine does not exist"), NOT_ASSIGNED_MACHINE_DATACENTER_RACK(
        "MACHINE-1", "The machine is not assigned to the datacenter or rack"), MACHINE_ANY_DATASTORE_DEFINED(
        "MACHINE-2", "Machine definition should have at least one datastore created and enabled"), MACHINE_CAN_NOT_BE_ADDED_IN_UCS_RACK(
        "MACHINE-3", "A machine can not be added this way to a UCS Rack"), MACHINE_INVALID_VIRTUAL_SWITCH_NAME(
        "MACHINE-4", "Invalid virtual switch name"), INVALID_STATE_CHANGE("MACHINE-5",
        "The requested state transaction is not valid"), MACHINE_NOT_ACCESIBLE("MACHINE-6",
        "The requested machine could not be contacted"),

    HYPERVISOR_EXIST_IP("HYPERVISOR-1",
        "Invalid hypervisor IP. Already exist an hypervisor with that IP"), HYPERVISOR_EXIST_SERVICE_IP(
        "HYPERVISOR-2",
        "Invalid hypervisor service IP. Already exist an hypervisor with that service IP"),

    // NETWORK
    NETWORK_INVALID_CONFIGURATION("NET-0",
        "Invalid network configuration for the virtual datacenter"), NETWORK_WITHOUT_IPS("NET-8",
        "This network doesn't have IPs"), NETWORK_IP_FROM_BIGGER_THAN_IP_TO("NET-9",
        "Parameter IPFrom is greater than IPTo"),

    // VIRTUAL MACHINE
    VIRTUAL_MACHINE_WITHOUT_HYPERVISOR("VM-0", "The virtual machine not have a hypervisor assigned"), NON_EXISTENT_VIRTUALMACHINE(
        "VM-1", "The requested virtual machine does not exist"), VIRTUAL_MACHINE_ALREADY_IN_PROGRESS(
        "VM-2", "The virtual machine is already in progress"), VIRTUAL_MACHINE_NOT_DEPLOYED("VM-3",
        "The virtual machine is not deployed"), VIRTUAL_MACHINE_STATE_CHANGE_ERROR("VM-4",
        "The virtual machine cannot change the state to the required state"), VIRTUAL_MACHINE_REMOTE_SERVICE_ERROR(
        "VM-5", "The virtual machine cannot change the state due to a communication problem"), VIRTUAL_MACHINE_PAUSE_UNSUPPORTED(
        "VM-6", "The virtual machine does not support the action PAUSE"),

    // ROLE
    NON_EXISTENT_ROLE("ROLE-0", "The requested role does not exist"), NON_MODIFICABLE_ROLE(
        "ROLE-1", "The requested role cannot be modified"), PRIVILEGE_PARAM_NOT_FOUND("ROLE-2",
        "Missing privilege parameter"), DELETE_ERROR("ROLE-3",
        "The requested role is blocked. Cannot be deleted"), DELETE_ERROR_WITH_USER("ROLE-4",
        "Cannot delete a role with associated User"), DELETE_ERROR_WITH_ROLE_LDAP("ROLE-5",
        "Cannot delete a role with associated RoleLdap"), DUPLICATED_ROLE_NAME("ROLE-6",
        "Cannot create a role with the same name of existing role for the same enterprise"),

    // PRIVILEGE
    NON_EXISTENT_PRIVILEGE("PRIVILEGE-0", "The requested privilege does not exist"),

    // ROLE_LDAP
    NON_EXISTENT_ROLELDAP("ROLELDAP-0", "The requested roleLdap does not exist"), MULTIPLE_ENTRIES_ROLELDAP(
        "ROLELDAP-1", "There are multiple entries for the requested roleLdap"), NOT_ASSIGNED_ROLE(
        "ROLELDAP-2", "The roleLdap must have a Role"),

    // USER
    NOT_ASSIGNED_USER_ENTERPRISE("USER-0", "The user is not assigned to the enterprise"), MISSING_ROLE_LINK(
        "USER-1", "Missing link to the role"), ROLE_PARAM_NOT_FOUND("USER-2",
        "Missing roles parameter"), USER_NON_EXISTENT("USER-3", "The requested user does not exist"), USER_DUPLICATED_NICK(
        "USER-4", "Duplicated nick for the user"), EMAIL_IS_INVALID("USER-5",
        "The email isn't valid"), NOT_USER_CREACION_LDAP_MODE("USER-6",
        "In Ldap mode can not create user"), NOT_EDIT_USER_ROLE_LDAP_MODE("USER-7",
        "In Ldap mode can not modify user's role"), NOT_EDIT_USER_ENTERPRISE_LDAP_MODE("USER-8",
        "In Ldap mode can not modify user's enterprise"),

    // REMOTE SERVICE
    NOT_ASSIGNED_REMOTE_SERVICE_DATACENTER("RS-0",
        "The remote service is not assigned to the datacenter"), WRONG_REMOTE_SERVICE_TYPE("RS-1",
        "Wrong remote service"), NON_EXISTENT_REMOTE_SERVICE_TYPE("RS-2",
        "The remote service does not exist"), REMOTE_SERVICE_URL_ALREADY_EXISTS("RS-3",
        "The remote service's url already exist and can't be duplicated"), REMOTE_SERVICE_MALFORMED_URL(
        "RS-4", "The remote service's url is not well formed"), REMOTE_SERVICE_POOL_ASIGNED("RS-5",
        "This datacenter already has a storage pool asigned"), REMOTE_SERVICE_TYPE_EXISTS("RS-6",
        "This datacenter already has a remote service of that type"), REMOTE_SERVICE_CONNECTION_FAILED(
        "RS-7", "Connection failed with the remote service"), APPLIANCE_MANAGER_REPOSITORY_ALREADY_DEFINED(
        "AM-0",
        "The repository exported by the current appliance manager is being used on other datacenter"), APPLIANCE_MANAGER_REPOSITORY_IN_USE(
        "AM-1",
        "The current repository holds virtual images being used on some virtual appliances, so it's not possible to remove this Remote Service. You can modify the Appliance manager but only if the same repository is used."), REMOTE_SERVICE_STORAGE_REMOTE_WITH_POOLS(
        "RS-8", "Cannot delete a Storage Manager with associated Storage Pools"), REMOTE_SERVICE_IS_BEING_USED(
        "RS-9",
        "Cannot delete a Virtual System Monitor or DHCP Service. There are virtual machines deployed."), REMOTE_SERVICE_WRONG_URL(
        "RS-10", "Provided URL is not valid"),

    // OVF PACKAGE LIST
    OVF_PACKAGE_LIST_NAME_ALREADY_EXIST("OVF-PACKAGE-LIST-0", "OVF Package list name already exist"),

    // OVF PACKAGE
    NON_EXISTENT_OVF_PACKAGE("OVF-PACKAGE-0", "The requested OVF package does not exist"), NON_EXISTENT_OVF_PACKAGE_LIST(
        "OVF-PACKAGE-1", "The requested OVF package list does not exist"),

    // NODE COLLECTOR
    NON_EXISTENT_IP("NC-0", "The requested IP does not exist"), MISSING_IP_PARAMETER("NC-1",
        "Missing query parameter ip"), NC_BAD_CREDENTIALS_TO_RACK("NC-2",
        "Bad credentials attempting to retrieve the list of physical machines from rack "), NC_BAD_CREDENTIALS_TO_MACHINE(
        "NC-3", "Bad credentials attempting to retrieve the machine "), NC_CONNECTION_EXCEPTION(
        "NC-4", "There is a machine running in the given IP. But any hypervisor responds"), NC_NOT_FOUND_EXCEPTION(
        "NC-5", "There is any machine running in the given IP"), NC_UNEXPECTED_EXCEPTION("NC-6",
        "Unexpected exception building the request to Discovery Manager"), NC_UNAVAILABLE_EXCEPTION(
        "NC-7", "The discovery manager currently is not available"),

    // STORAGE POOL
    MISSING_REQUIRED_QUERY_PARAMETER_IQN("SP-1", "Missing query parameter iqn"), CONFLICT_STORAGE_POOL(
        "SP-2", "The id of the Storage Pool and the id of the submitted object must be the same"), NON_EXISTENT_STORAGE_POOL(
        "SP-3", "The requested Storage Pool does not exist"), STORAGE_POOL_ERROR_MODIFYING("SP-4",
        "There was an unexpected error while modifying the Storage Pool"), STORAGE_POOLS_SYNC(
        "SP-5", "Could not get the Storage Pools from the target device"), STORAGE_POOL_SYNC(
        "SP-6", "Could not get the requested Storage Pool from the target device"), CONFLICT_VOLUMES_CREATED(
        "SP-7", "Can not edit or delete the Storage Pool. There are volumes created "), STORAGE_POOL_DUPLICATED(
        "SP-8", "Duplicated Storage Pool"), STORAGE_POOL_TIER_IS_DISABLED("SP-9",
        "Tier is disabled"), STORAGE_POOL_PARAM_NOT_FOUND("SP-10", "Missing storage pool parameter"), STORAGE_POOL_LINK_DATACENTER_PARAM_NOT_FOUND(
        "SP-11", "Datacenter param in storage pool link not found"), STORAGE_POOL_LINK_DEVICE_PARAM_NOT_FOUND(
        "SP-12", "Storage device param in storage pool link not found"), MISSING_POOL_LINK("SP-13",
        "Missing storage pool link"),

    // DATASTORE
    DATASTORE_NON_EXISTENT("DATASTORE-0", "The requested datastore does not exist"), DATASTORE_DUPLICATED_NAME(
        "DATASTORE-4", "Duplicated name for the datastore"), DATASTORE_DUPLICATED_DIRECTORY(
        "DATASTORE-6", "Duplicated directory path for the datastore"), DATASTORE_NOT_ASSIGNED_TO_MACHINE(
        "DATASTORE-7", "The datastore is not assigned to that machine"),

    // SYSTEM PROPERTIES
    NON_EXISTENT_SYSTEM_PROPERTY("SYSPROP-0", "The requested system property does not exist"), SYSTEM_PROPERTIES_DUPLICATED_NAME(
        "SYSPROP-1", "There is already a system property with that name"),

    // ALLOCATOR
    LIMIT_EXCEEDED("LIMIT-1", "The required resources exceed the allowed limits"), NOT_ENOUGH_RESOURCES(
        "ALLOC-0", "There are not enough resources to create the virtual machine"), //
    ALLOCATOR_ERROR("ALLOC-1", "Can not create virtual machine"), //

    CHECK_EDIT_NO_TARGET_MACHINE("EDIT-01",
        "This method require the virtual machine being deployed on some target hypervisor"),

    // VIRTUAL SYSTEM MONITOR

    MONITOR_PROBLEM("VSM-0", "An error was occurred when monitoring the physical machine"), UNMONITOR_PROBLEM(
        "VSM-1", "An error was occurred when shutting down the monitored physical machine"),

    // LICENSE
    LICENSE_UNEXISTING("LICENSE-0", "The requested license does not exist"), LICENSE_INVALID(
        "LICENSE-1", "The provided license is not valid"), LICENSE_CIHPER_INIT_ERROR("LICENSE-2",
        "Could not initialize licensing ciphers"), LICENSE_CIHPER_KEY("LICENSE-3",
        "Could not read licensing cipher key"), LICENSE_OVERFLOW("LICENSE-4",
        "The maximum number of managed cores has been reached"), LICENSE_DUPLICATED("LICENSE-5",
        "The license already exists"),

    // TIERS
    NON_EXISTENT_TIER("TIER-0", "The requested tier does not exist"), NULL_TIER("TIER-1",
        "Embedded Tier of the StoragePool can not be null"), MISSING_TIER_LINK("TIER-2",
        "Missing link to the tier"), TIER_PARAM_NOT_FOUND("TIER-3", "Missing tiers parameter"), TIER_LINK_DATACENTER_PARAM_NOT_FOUND(
        "TIER-4", "Datacenter param in tier link not found"), TIER_LINK_DATACENTER_DIFFERENT(
        "TIER-5",
        "Tier's datacenter does not belong to the same datacenter where you want to create the StoragePool"), TIER_CONFLICT_DISABLING_TIER(
        "TIER-6", "Can not disable a Tier with associated Storage Pools"),

    // DEVICES
    NON_EXISTENT_DEVICE("DEVICE-0", "The requested device does not exist"), DEVICE_DUPLICATED(
        "DEVICE-1", "Duplicated Storage Device"),

    // STATISTICS
    NON_EXISTENT_STATS("STATS-0", "Non existent statistical data found"), NON_EXISTENT_STATS_FOR_DATACENTER(
        "STATS-1", "Non existent statistical data found for the requested datacenter"), NON_EXISTENT_STATS_FOR_DCLIMITS(
        "STATS-2",
        "Non existent statistical data found for the requested enterprise in this datacenter"), NON_EXISTENT_STATS_FOR_ENTERPRISE(
        "STATS-3", "Non existent statistical data found for the requested enterprise"), NODECOLLECTOR_ERROR(
        "NODECOLLECTOR-1", "Nodecollector has raised an error"),

    QUERY_INVALID_PARAMETER("QUERY-0", "Invalid 'by' parameter"),

    VOLUME_GENERIC_ERROR("VOL-0", "Could not create the volume in the selected tier"), VOLUME_NOT_ENOUGH_RESOURCES(
        "VOL-1", "There are not enough resources in the selected tier to create the volume"), VOLUME_NAME_NOT_FOUND(
        "VOL-2", "The name of the volume is required"), NON_EXISTENT_VOLUME("VOL-3",
        "The volume does not exist"), VOLUME_CREATE_ERROR("VOL-4",
        "An unexpected error occured while creating the volume"), VOLUME_MOUNTED_OR_RESERVED(
        "VOL-5", "The volume cannot be deleted because it is associated to a virtual machine"), VOLUME_SSM_DELETE_ERROR(
        "VOL-6", "Could not physically delete the volume from the target storage device"), VOLUME_DELETE_STATEFUL(
        "VOL-7", "The volume cannot be deleted because it is in a persistent image process"), VOLUME_DELETE_IN_VIRTUALAPPLIANCE(
        "VOL-8",
        "The stateful volume cannot be deleted because it is being used in a virtual appliance"), VOLUME_ISCSI_NOT_FOUND(
        "VOL-9", "The idScsi of the volume is required"), VOLUME_DECREASE_SIZE_LIMIT_ERROR(
        "VOL-10", "The size of the volume cannot be decreased"), VOLUME_NAME_LENGTH_ERROR("VOL-11",
        "The size of the 'name' field of the volume cannot exceed 256 characters"), VOLUME_ISCSI_INVALID(
        "VOL-12", "The property idScsi " + IscsiPath.ERROR_MESSAGE), VOLUME_SIZE_INVALID("VOL-13",
        "The size property must be a non-zero integer up to " + Rasd.LIMIT_MAX), VOLUME_IN_USE(
        "VOL-14", "The volume cannot be edited because it is being used in a virtual machine"), VOLUME_UPDATE(
        "VOL-15", "An unexpected error occurred and the bvolume could not be updated"),

    // RULES

    NON_EXISTENT_EER("RULE-1", "The requested restrict shared server rule does not exist"), NON_EXISTENT_FPR(
        "RULE-2", "The requested load balance rule does not exist"), NON_EXISTENT_MLR("RULE-3",
        "The requested load level rule does not exist"), ONE_FPR_REQUIRED("RULE-4",
        "At least one load balance rule is required"), ONE_LINK_REQUIRED("RULE-5",
        "It is expected one link with the rel attribute possible values (datacenter/rack/machine)"), INVALID_FPR(
        "RULE-6", "The load balance type indicated is null or invalid")

    ;

    /**
     * Internal error code
     */
    String code;

    /**
     * Description message
     */
    String message;

    String cause;

    private APIError(final String code, final String message)
    {
        this.code = code;
        this.message = message;
    }

    public String getCode()
    {
        return String.valueOf(this.code);
    }

    public String getMessage()
    {
        return this.message;
    }

    public void addCause(final String cause)
    {
        this.cause = cause;
    }

    public static void main(final String[] args)
    {
        APIError[] errors = APIError.values();
        Arrays.sort(errors, new Comparator<APIError>()
        {
            @Override
            public int compare(final APIError err1, final APIError err2)
            {
                return String.CASE_INSENSITIVE_ORDER.compare(err1.code, err2.code);
            }

        });

        // Outputs all errors in wiki table format
        for (APIError error : errors)
        {
            System.out.println(String.format("| %s | %s | %s |", error.code, error.message, error
                .name()));
        }
    }

}
