/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject ClientBrowser
 */
@XStreamAlias("ClientBrowser")
public class ClientBrowser extends AbstractSObjectBase {

    // UsersId
    private String UsersId;

    @JsonProperty("UsersId")
    public String getUsersId() {
        return this.UsersId;
    }

    @JsonProperty("UsersId")
    public void setUsersId(String UsersId) {
        this.UsersId = UsersId;
    }

    // FullUserAgent
    private String FullUserAgent;

    @JsonProperty("FullUserAgent")
    public String getFullUserAgent() {
        return this.FullUserAgent;
    }

    @JsonProperty("FullUserAgent")
    public void setFullUserAgent(String FullUserAgent) {
        this.FullUserAgent = FullUserAgent;
    }

    // ProxyInfo
    private String ProxyInfo;

    @JsonProperty("ProxyInfo")
    public String getProxyInfo() {
        return this.ProxyInfo;
    }

    @JsonProperty("ProxyInfo")
    public void setProxyInfo(String ProxyInfo) {
        this.ProxyInfo = ProxyInfo;
    }

    // LastUpdate
    private org.joda.time.DateTime LastUpdate;

    @JsonProperty("LastUpdate")
    public org.joda.time.DateTime getLastUpdate() {
        return this.LastUpdate;
    }

    @JsonProperty("LastUpdate")
    public void setLastUpdate(org.joda.time.DateTime LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

}