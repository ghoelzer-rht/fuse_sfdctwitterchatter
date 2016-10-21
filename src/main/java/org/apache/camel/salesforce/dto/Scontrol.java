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
 * Salesforce DTO for SObject Scontrol
 */
@XStreamAlias("Scontrol")
public class Scontrol extends AbstractSObjectBase {

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
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

    // EncodingKey
    @XStreamConverter(PicklistEnumConverter.class)
    private EncodingKeyEnum EncodingKey;

    @JsonProperty("EncodingKey")
    public EncodingKeyEnum getEncodingKey() {
        return this.EncodingKey;
    }

    @JsonProperty("EncodingKey")
    public void setEncodingKey(EncodingKeyEnum EncodingKey) {
        this.EncodingKey = EncodingKey;
    }

    // HtmlWrapper
    private String HtmlWrapper;

    @JsonProperty("HtmlWrapper")
    public String getHtmlWrapper() {
        return this.HtmlWrapper;
    }

    @JsonProperty("HtmlWrapper")
    public void setHtmlWrapper(String HtmlWrapper) {
        this.HtmlWrapper = HtmlWrapper;
    }

    // Filename
    private String Filename;

    @JsonProperty("Filename")
    public String getFilename() {
        return this.Filename;
    }

    @JsonProperty("Filename")
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    // BodyLength
    private Integer BodyLength;

    @JsonProperty("BodyLength")
    public Integer getBodyLength() {
        return this.BodyLength;
    }

    @JsonProperty("BodyLength")
    public void setBodyLength(Integer BodyLength) {
        this.BodyLength = BodyLength;
    }

    // Binary
    // blob field url, use getBlobField to get the content
    @XStreamAlias("Binary")
    private String BinaryUrl;

    @JsonProperty("Binary")
    public String getBinaryUrl() {
        return this.BinaryUrl;
    }

    @JsonProperty("Binary")
    public void setBinaryUrl(String BinaryUrl) {
        this.BinaryUrl = BinaryUrl;
    }

    // ContentSource
    @XStreamConverter(PicklistEnumConverter.class)
    private ContentSourceEnum ContentSource;

    @JsonProperty("ContentSource")
    public ContentSourceEnum getContentSource() {
        return this.ContentSource;
    }

    @JsonProperty("ContentSource")
    public void setContentSource(ContentSourceEnum ContentSource) {
        this.ContentSource = ContentSource;
    }

    // SupportsCaching
    private Boolean SupportsCaching;

    @JsonProperty("SupportsCaching")
    public Boolean getSupportsCaching() {
        return this.SupportsCaching;
    }

    @JsonProperty("SupportsCaching")
    public void setSupportsCaching(Boolean SupportsCaching) {
        this.SupportsCaching = SupportsCaching;
    }

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

}