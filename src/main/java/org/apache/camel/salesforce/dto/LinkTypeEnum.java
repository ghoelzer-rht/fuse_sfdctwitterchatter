/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LinkType
 */
public enum LinkTypeEnum {

    // url
    URL("url"),
    // sControl
    SCONTROL("sControl"),
    // javascript
    JAVASCRIPT("javascript"),
    // page
    PAGE("page"),
    // flow
    FLOW("flow");

    final String value;

    private LinkTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LinkTypeEnum fromValue(String value) {
        for (LinkTypeEnum e : LinkTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}