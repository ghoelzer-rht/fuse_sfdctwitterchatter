/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject OrgWideEmailAddress
 */
@XStreamAlias("OrgWideEmailAddress")
public class OrgWideEmailAddress extends AbstractSObjectBase {

    // Address
    private String Address;

    @JsonProperty("Address")
    public String getAddress() {
        return this.Address;
    }

    @JsonProperty("Address")
    public void setAddress(String Address) {
        this.Address = Address;
    }

    // DisplayName
    private String DisplayName;

    @JsonProperty("DisplayName")
    public String getDisplayName() {
        return this.DisplayName;
    }

    @JsonProperty("DisplayName")
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    // IsAllowAllProfiles
    private Boolean IsAllowAllProfiles;

    @JsonProperty("IsAllowAllProfiles")
    public Boolean getIsAllowAllProfiles() {
        return this.IsAllowAllProfiles;
    }

    @JsonProperty("IsAllowAllProfiles")
    public void setIsAllowAllProfiles(Boolean IsAllowAllProfiles) {
        this.IsAllowAllProfiles = IsAllowAllProfiles;
    }

}