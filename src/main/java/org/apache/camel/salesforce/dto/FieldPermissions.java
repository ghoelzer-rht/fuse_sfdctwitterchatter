/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject FieldPermissions
 */
@XStreamAlias("FieldPermissions")
public class FieldPermissions extends AbstractSObjectBase {

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // SobjectType
    @XStreamConverter(PicklistEnumConverter.class)
    private SobjectTypeEnum SobjectType;

    @JsonProperty("SobjectType")
    public SobjectTypeEnum getSobjectType() {
        return this.SobjectType;
    }

    @JsonProperty("SobjectType")
    public void setSobjectType(SobjectTypeEnum SobjectType) {
        this.SobjectType = SobjectType;
    }

    // Field
    @XStreamConverter(PicklistEnumConverter.class)
    private FieldEnum Field;

    @JsonProperty("Field")
    public FieldEnum getField() {
        return this.Field;
    }

    @JsonProperty("Field")
    public void setField(FieldEnum Field) {
        this.Field = Field;
    }

    // PermissionsEdit
    private Boolean PermissionsEdit;

    @JsonProperty("PermissionsEdit")
    public Boolean getPermissionsEdit() {
        return this.PermissionsEdit;
    }

    @JsonProperty("PermissionsEdit")
    public void setPermissionsEdit(Boolean PermissionsEdit) {
        this.PermissionsEdit = PermissionsEdit;
    }

    // PermissionsRead
    private Boolean PermissionsRead;

    @JsonProperty("PermissionsRead")
    public Boolean getPermissionsRead() {
        return this.PermissionsRead;
    }

    @JsonProperty("PermissionsRead")
    public void setPermissionsRead(Boolean PermissionsRead) {
        this.PermissionsRead = PermissionsRead;
    }

}