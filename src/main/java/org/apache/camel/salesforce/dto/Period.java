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
 * Salesforce DTO for SObject Period
 */
@XStreamAlias("Period")
public class Period extends AbstractSObjectBase {

    // FiscalYearSettingsId
    private String FiscalYearSettingsId;

    @JsonProperty("FiscalYearSettingsId")
    public String getFiscalYearSettingsId() {
        return this.FiscalYearSettingsId;
    }

    @JsonProperty("FiscalYearSettingsId")
    public void setFiscalYearSettingsId(String FiscalYearSettingsId) {
        this.FiscalYearSettingsId = FiscalYearSettingsId;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private TypeEnum Type;

    @JsonProperty("Type")
    public TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(TypeEnum Type) {
        this.Type = Type;
    }

    // StartDate
    private org.joda.time.DateTime StartDate;

    @JsonProperty("StartDate")
    public org.joda.time.DateTime getStartDate() {
        return this.StartDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(org.joda.time.DateTime StartDate) {
        this.StartDate = StartDate;
    }

    // EndDate
    private org.joda.time.DateTime EndDate;

    @JsonProperty("EndDate")
    public org.joda.time.DateTime getEndDate() {
        return this.EndDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(org.joda.time.DateTime EndDate) {
        this.EndDate = EndDate;
    }

    // IsForecastPeriod
    private Boolean IsForecastPeriod;

    @JsonProperty("IsForecastPeriod")
    public Boolean getIsForecastPeriod() {
        return this.IsForecastPeriod;
    }

    @JsonProperty("IsForecastPeriod")
    public void setIsForecastPeriod(Boolean IsForecastPeriod) {
        this.IsForecastPeriod = IsForecastPeriod;
    }

    // QuarterLabel
    @XStreamConverter(PicklistEnumConverter.class)
    private QuarterLabelEnum QuarterLabel;

    @JsonProperty("QuarterLabel")
    public QuarterLabelEnum getQuarterLabel() {
        return this.QuarterLabel;
    }

    @JsonProperty("QuarterLabel")
    public void setQuarterLabel(QuarterLabelEnum QuarterLabel) {
        this.QuarterLabel = QuarterLabel;
    }

    // PeriodLabel
    private String PeriodLabel;

    @JsonProperty("PeriodLabel")
    public String getPeriodLabel() {
        return this.PeriodLabel;
    }

    @JsonProperty("PeriodLabel")
    public void setPeriodLabel(String PeriodLabel) {
        this.PeriodLabel = PeriodLabel;
    }

    // Number
    private Integer Number;

    @JsonProperty("Number")
    public Integer getNumber() {
        return this.Number;
    }

    @JsonProperty("Number")
    public void setNumber(Integer Number) {
        this.Number = Number;
    }

}