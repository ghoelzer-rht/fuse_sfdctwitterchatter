/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type Profile
 */
public class QueryRecordsProfile extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<Profile> records;

    public List<Profile> getRecords() {
        return records;
    }

    public void setRecords(List<Profile> records) {
        this.records = records;
    }
}
