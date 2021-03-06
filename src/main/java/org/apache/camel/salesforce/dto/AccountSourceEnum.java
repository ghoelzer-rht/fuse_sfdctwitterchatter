/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist AccountSource
 */
public enum AccountSourceEnum {

    // Web
    WEB("Web"),
    // Phone Inquiry
    PHONE_INQUIRY("Phone Inquiry"),
    // Partner Referral
    PARTNER_REFERRAL("Partner Referral"),
    // Purchased List
    PURCHASED_LIST("Purchased List"),
    // Other
    OTHER("Other");

    final String value;

    private AccountSourceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AccountSourceEnum fromValue(String value) {
        for (AccountSourceEnum e : AccountSourceEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}