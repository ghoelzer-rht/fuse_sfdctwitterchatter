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
 * Salesforce DTO for SObject Domain
 */
@XStreamAlias("Domain")
public class Domain extends AbstractSObjectBase {

    // DomainType
    @XStreamConverter(PicklistEnumConverter.class)
    private DomainTypeEnum DomainType;

    @JsonProperty("DomainType")
    public DomainTypeEnum getDomainType() {
        return this.DomainType;
    }

    @JsonProperty("DomainType")
    public void setDomainType(DomainTypeEnum DomainType) {
        this.DomainType = DomainType;
    }

    // Domain
    private String Domain;

    @JsonProperty("Domain")
    public String getDomain() {
        return this.Domain;
    }

    @JsonProperty("Domain")
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

}