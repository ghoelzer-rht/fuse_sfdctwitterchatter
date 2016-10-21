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
 * Salesforce DTO for SObject Site
 */
@XStreamAlias("Site")
public class Site extends AbstractSObjectBase {

    // Subdomain
    private String Subdomain;

    @JsonProperty("Subdomain")
    public String getSubdomain() {
        return this.Subdomain;
    }

    @JsonProperty("Subdomain")
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    // UrlPathPrefix
    private String UrlPathPrefix;

    @JsonProperty("UrlPathPrefix")
    public String getUrlPathPrefix() {
        return this.UrlPathPrefix;
    }

    @JsonProperty("UrlPathPrefix")
    public void setUrlPathPrefix(String UrlPathPrefix) {
        this.UrlPathPrefix = UrlPathPrefix;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // AdminId
    private String AdminId;

    @JsonProperty("AdminId")
    public String getAdminId() {
        return this.AdminId;
    }

    @JsonProperty("AdminId")
    public void setAdminId(String AdminId) {
        this.AdminId = AdminId;
    }

    // OptionsEnableFeeds
    private Boolean OptionsEnableFeeds;

    @JsonProperty("OptionsEnableFeeds")
    public Boolean getOptionsEnableFeeds() {
        return this.OptionsEnableFeeds;
    }

    @JsonProperty("OptionsEnableFeeds")
    public void setOptionsEnableFeeds(Boolean OptionsEnableFeeds) {
        this.OptionsEnableFeeds = OptionsEnableFeeds;
    }

    // OptionsAllowHomePage
    private Boolean OptionsAllowHomePage;

    @JsonProperty("OptionsAllowHomePage")
    public Boolean getOptionsAllowHomePage() {
        return this.OptionsAllowHomePage;
    }

    @JsonProperty("OptionsAllowHomePage")
    public void setOptionsAllowHomePage(Boolean OptionsAllowHomePage) {
        this.OptionsAllowHomePage = OptionsAllowHomePage;
    }

    // OptionsAllowStandardIdeasPages
    private Boolean OptionsAllowStandardIdeasPages;

    @JsonProperty("OptionsAllowStandardIdeasPages")
    public Boolean getOptionsAllowStandardIdeasPages() {
        return this.OptionsAllowStandardIdeasPages;
    }

    @JsonProperty("OptionsAllowStandardIdeasPages")
    public void setOptionsAllowStandardIdeasPages(Boolean OptionsAllowStandardIdeasPages) {
        this.OptionsAllowStandardIdeasPages = OptionsAllowStandardIdeasPages;
    }

    // OptionsAllowStandardSearch
    private Boolean OptionsAllowStandardSearch;

    @JsonProperty("OptionsAllowStandardSearch")
    public Boolean getOptionsAllowStandardSearch() {
        return this.OptionsAllowStandardSearch;
    }

    @JsonProperty("OptionsAllowStandardSearch")
    public void setOptionsAllowStandardSearch(Boolean OptionsAllowStandardSearch) {
        this.OptionsAllowStandardSearch = OptionsAllowStandardSearch;
    }

    // OptionsAllowStandardLookups
    private Boolean OptionsAllowStandardLookups;

    @JsonProperty("OptionsAllowStandardLookups")
    public Boolean getOptionsAllowStandardLookups() {
        return this.OptionsAllowStandardLookups;
    }

    @JsonProperty("OptionsAllowStandardLookups")
    public void setOptionsAllowStandardLookups(Boolean OptionsAllowStandardLookups) {
        this.OptionsAllowStandardLookups = OptionsAllowStandardLookups;
    }

    // OptionsAllowStandardAnswersPages
    private Boolean OptionsAllowStandardAnswersPages;

    @JsonProperty("OptionsAllowStandardAnswersPages")
    public Boolean getOptionsAllowStandardAnswersPages() {
        return this.OptionsAllowStandardAnswersPages;
    }

    @JsonProperty("OptionsAllowStandardAnswersPages")
    public void setOptionsAllowStandardAnswersPages(Boolean OptionsAllowStandardAnswersPages) {
        this.OptionsAllowStandardAnswersPages = OptionsAllowStandardAnswersPages;
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

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // AnalyticsTrackingCode
    private String AnalyticsTrackingCode;

    @JsonProperty("AnalyticsTrackingCode")
    public String getAnalyticsTrackingCode() {
        return this.AnalyticsTrackingCode;
    }

    @JsonProperty("AnalyticsTrackingCode")
    public void setAnalyticsTrackingCode(String AnalyticsTrackingCode) {
        this.AnalyticsTrackingCode = AnalyticsTrackingCode;
    }

    // SiteType
    @XStreamConverter(PicklistEnumConverter.class)
    private SiteTypeEnum SiteType;

    @JsonProperty("SiteType")
    public SiteTypeEnum getSiteType() {
        return this.SiteType;
    }

    @JsonProperty("SiteType")
    public void setSiteType(SiteTypeEnum SiteType) {
        this.SiteType = SiteType;
    }

    // DailyBandwidthLimit
    private Integer DailyBandwidthLimit;

    @JsonProperty("DailyBandwidthLimit")
    public Integer getDailyBandwidthLimit() {
        return this.DailyBandwidthLimit;
    }

    @JsonProperty("DailyBandwidthLimit")
    public void setDailyBandwidthLimit(Integer DailyBandwidthLimit) {
        this.DailyBandwidthLimit = DailyBandwidthLimit;
    }

    // DailyBandwidthUsed
    private Integer DailyBandwidthUsed;

    @JsonProperty("DailyBandwidthUsed")
    public Integer getDailyBandwidthUsed() {
        return this.DailyBandwidthUsed;
    }

    @JsonProperty("DailyBandwidthUsed")
    public void setDailyBandwidthUsed(Integer DailyBandwidthUsed) {
        this.DailyBandwidthUsed = DailyBandwidthUsed;
    }

    // DailyRequestTimeLimit
    private Integer DailyRequestTimeLimit;

    @JsonProperty("DailyRequestTimeLimit")
    public Integer getDailyRequestTimeLimit() {
        return this.DailyRequestTimeLimit;
    }

    @JsonProperty("DailyRequestTimeLimit")
    public void setDailyRequestTimeLimit(Integer DailyRequestTimeLimit) {
        this.DailyRequestTimeLimit = DailyRequestTimeLimit;
    }

    // DailyRequestTimeUsed
    private Integer DailyRequestTimeUsed;

    @JsonProperty("DailyRequestTimeUsed")
    public Integer getDailyRequestTimeUsed() {
        return this.DailyRequestTimeUsed;
    }

    @JsonProperty("DailyRequestTimeUsed")
    public void setDailyRequestTimeUsed(Integer DailyRequestTimeUsed) {
        this.DailyRequestTimeUsed = DailyRequestTimeUsed;
    }

    // MonthlyPageViewsEntitlement
    private Integer MonthlyPageViewsEntitlement;

    @JsonProperty("MonthlyPageViewsEntitlement")
    public Integer getMonthlyPageViewsEntitlement() {
        return this.MonthlyPageViewsEntitlement;
    }

    @JsonProperty("MonthlyPageViewsEntitlement")
    public void setMonthlyPageViewsEntitlement(Integer MonthlyPageViewsEntitlement) {
        this.MonthlyPageViewsEntitlement = MonthlyPageViewsEntitlement;
    }

}