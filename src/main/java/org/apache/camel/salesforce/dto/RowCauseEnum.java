/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RowCause
 */
public enum RowCauseEnum {

    // Owner
    OWNER("Owner"),
    // Manual
    MANUAL("Manual"),
    // Rule
    RULE("Rule"),
    // ImplicitChild
    IMPLICITCHILD("ImplicitChild"),
    // ImplicitParent
    IMPLICITPARENT("ImplicitParent"),
    // Team
    TEAM("Team"),
    // Territory
    TERRITORY("Territory"),
    // TerritoryManual
    TERRITORYMANUAL("TerritoryManual"),
    // TerritoryRule
    TERRITORYRULE("TerritoryRule"),
    // Territory2Forecast
    TERRITORY2FORECAST("Territory2Forecast");

    final String value;

    private RowCauseEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RowCauseEnum fromValue(String value) {
        for (RowCauseEnum e : RowCauseEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}