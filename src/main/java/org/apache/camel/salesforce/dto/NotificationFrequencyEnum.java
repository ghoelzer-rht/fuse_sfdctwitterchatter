/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist NotificationFrequency
 */
public enum NotificationFrequencyEnum {

    // P
    P("P"),
    // D
    D("D"),
    // W
    W("W"),
    // N
    N("N");

    final String value;

    private NotificationFrequencyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static NotificationFrequencyEnum fromValue(String value) {
        for (NotificationFrequencyEnum e : NotificationFrequencyEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}