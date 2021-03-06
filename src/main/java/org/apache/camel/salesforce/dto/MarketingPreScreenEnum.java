/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist MarketingPreScreen
 */
public enum MarketingPreScreenEnum {

    // L
    L("L"),
    // M
    M("M"),
    // H
    H("H");

    final String value;

    private MarketingPreScreenEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MarketingPreScreenEnum fromValue(String value) {
        for (MarketingPreScreenEnum e : MarketingPreScreenEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}