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
 * Salesforce DTO for SObject CollaborationGroup
 */
@XStreamAlias("CollaborationGroup")
public class CollaborationGroup extends AbstractSObjectBase {

    // MemberCount
    private Integer MemberCount;

    @JsonProperty("MemberCount")
    public Integer getMemberCount() {
        return this.MemberCount;
    }

    @JsonProperty("MemberCount")
    public void setMemberCount(Integer MemberCount) {
        this.MemberCount = MemberCount;
    }

    // CollaborationType
    @XStreamConverter(PicklistEnumConverter.class)
    private CollaborationTypeEnum CollaborationType;

    @JsonProperty("CollaborationType")
    public CollaborationTypeEnum getCollaborationType() {
        return this.CollaborationType;
    }

    @JsonProperty("CollaborationType")
    public void setCollaborationType(CollaborationTypeEnum CollaborationType) {
        this.CollaborationType = CollaborationType;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // FullPhotoUrl
    private String FullPhotoUrl;

    @JsonProperty("FullPhotoUrl")
    public String getFullPhotoUrl() {
        return this.FullPhotoUrl;
    }

    @JsonProperty("FullPhotoUrl")
    public void setFullPhotoUrl(String FullPhotoUrl) {
        this.FullPhotoUrl = FullPhotoUrl;
    }

    // SmallPhotoUrl
    private String SmallPhotoUrl;

    @JsonProperty("SmallPhotoUrl")
    public String getSmallPhotoUrl() {
        return this.SmallPhotoUrl;
    }

    @JsonProperty("SmallPhotoUrl")
    public void setSmallPhotoUrl(String SmallPhotoUrl) {
        this.SmallPhotoUrl = SmallPhotoUrl;
    }

    // LastFeedModifiedDate
    private org.joda.time.DateTime LastFeedModifiedDate;

    @JsonProperty("LastFeedModifiedDate")
    public org.joda.time.DateTime getLastFeedModifiedDate() {
        return this.LastFeedModifiedDate;
    }

    @JsonProperty("LastFeedModifiedDate")
    public void setLastFeedModifiedDate(org.joda.time.DateTime LastFeedModifiedDate) {
        this.LastFeedModifiedDate = LastFeedModifiedDate;
    }

    // InformationTitle
    private String InformationTitle;

    @JsonProperty("InformationTitle")
    public String getInformationTitle() {
        return this.InformationTitle;
    }

    @JsonProperty("InformationTitle")
    public void setInformationTitle(String InformationTitle) {
        this.InformationTitle = InformationTitle;
    }

    // InformationBody
    private String InformationBody;

    @JsonProperty("InformationBody")
    public String getInformationBody() {
        return this.InformationBody;
    }

    @JsonProperty("InformationBody")
    public void setInformationBody(String InformationBody) {
        this.InformationBody = InformationBody;
    }

    // HasPrivateFieldsAccess
    private Boolean HasPrivateFieldsAccess;

    @JsonProperty("HasPrivateFieldsAccess")
    public Boolean getHasPrivateFieldsAccess() {
        return this.HasPrivateFieldsAccess;
    }

    @JsonProperty("HasPrivateFieldsAccess")
    public void setHasPrivateFieldsAccess(Boolean HasPrivateFieldsAccess) {
        this.HasPrivateFieldsAccess = HasPrivateFieldsAccess;
    }

    // CanHaveGuests
    private Boolean CanHaveGuests;

    @JsonProperty("CanHaveGuests")
    public Boolean getCanHaveGuests() {
        return this.CanHaveGuests;
    }

    @JsonProperty("CanHaveGuests")
    public void setCanHaveGuests(Boolean CanHaveGuests) {
        this.CanHaveGuests = CanHaveGuests;
    }

}