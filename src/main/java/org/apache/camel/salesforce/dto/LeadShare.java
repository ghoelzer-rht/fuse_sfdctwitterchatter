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
 * Salesforce DTO for SObject LeadShare
 */
@XStreamAlias("LeadShare")
public class LeadShare extends AbstractSObjectBase {

    // LeadId
    private String LeadId;

    @JsonProperty("LeadId")
    public String getLeadId() {
        return this.LeadId;
    }

    @JsonProperty("LeadId")
    public void setLeadId(String LeadId) {
        this.LeadId = LeadId;
    }

    // UserOrGroupId
    private String UserOrGroupId;

    @JsonProperty("UserOrGroupId")
    public String getUserOrGroupId() {
        return this.UserOrGroupId;
    }

    @JsonProperty("UserOrGroupId")
    public void setUserOrGroupId(String UserOrGroupId) {
        this.UserOrGroupId = UserOrGroupId;
    }

    // LeadAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private LeadAccessLevelEnum LeadAccessLevel;

    @JsonProperty("LeadAccessLevel")
    public LeadAccessLevelEnum getLeadAccessLevel() {
        return this.LeadAccessLevel;
    }

    @JsonProperty("LeadAccessLevel")
    public void setLeadAccessLevel(LeadAccessLevelEnum LeadAccessLevel) {
        this.LeadAccessLevel = LeadAccessLevel;
    }

    // RowCause
    @XStreamConverter(PicklistEnumConverter.class)
    private RowCauseEnum RowCause;

    @JsonProperty("RowCause")
    public RowCauseEnum getRowCause() {
        return this.RowCause;
    }

    @JsonProperty("RowCause")
    public void setRowCause(RowCauseEnum RowCause) {
        this.RowCause = RowCause;
    }

}