package com.sedin.workbookrealm.parser;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by raja on 06/04/16.
 */
public class WorkOrder {

    @JsonProperty("description")
    private String description;
    @JsonProperty("scheduled_finish_date")
    private String scheduledFinishDate;
    @JsonProperty("targeted_start_date")
    private String targetedStartDate;
    @JsonProperty("assigned_date")
    private String assignedDate;
    @JsonProperty("changed_by")
    private String changedBy;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("scheduled_start_date")
    private String scheduledStartDate;
    @JsonProperty("attachments")
    private List<Attachment> attachments = new ArrayList<Attachment>();
    @JsonProperty("reported_date")
    private String reportedDate;
    @JsonProperty("locations")
    private List<Location> locations = new ArrayList<Location>();
    @JsonProperty("status")
    private String status;
    @JsonProperty("workorder_id")
    private Integer workorderId;
    @JsonProperty("site_id")
    private String siteId;
    @JsonProperty("reported_by")
    private String reportedBy;
    @JsonProperty("changed_date")
    private String changedDate;
    @JsonProperty("estimated_duration")
    private Double estimatedDuration;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("location")
    private String location;
    @JsonProperty("work_type")
    private String workType;
    @JsonProperty("workorder_num")
    private String workorderNum;
    @JsonProperty("asset")
    private Asset asset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("priority")
    public Integer getPriority() {

        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        Integer mypriority;
        if (priority == null) {
            mypriority = 0;
        } else {
            mypriority = priority;
        }
        this.priority = mypriority;
    }

    /**
     * @return The scheduledFinishDate
     */
    @JsonProperty("scheduled_finish_date")
    public String getScheduledFinishDate() {
        return scheduledFinishDate;
    }

    /**
     * @param scheduledFinishDate The scheduled_finish_date
     */
    @JsonProperty("scheduled_finish_date")
    public void setScheduledFinishDate(String scheduledFinishDate) {
        this.scheduledFinishDate = scheduledFinishDate;
    }

    @JsonProperty("assigned_date")
    public void setAssignedDate(String assignedDate) {
        this.assignedDate = assignedDate;
    }


    @JsonProperty("assigned_date")
    public String getAssignedDate() {
        return assignedDate;
    }

    /**
     * @return The targetedStartDate
     */
    @JsonProperty("targeted_start_date")
    public String getTargetedStartDate() {
        return targetedStartDate;
    }

    /**
     * @param targetedStartDate The targeted_start_date
     */
    @JsonProperty("targeted_start_date")
    public void setTargetedStartDate(String targetedStartDate) {
        this.targetedStartDate = targetedStartDate;
    }

    /**
     * @return The changedBy
     */
    @JsonProperty("changed_by")
    public String getChangedBy() {
        return changedBy;
    }

    /**
     * @param changedBy The changed_by
     */
    @JsonProperty("changed_by")
    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    /**
     * @return The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return The scheduledStartDate
     */
    @JsonProperty("scheduled_start_date")
    public String getScheduledStartDate() {
        return scheduledStartDate;
    }

    /**
     * @param scheduledStartDate The scheduled_start_date
     */
    @JsonProperty("scheduled_start_date")
    public void setScheduledStartDate(String scheduledStartDate) {
        this.scheduledStartDate = scheduledStartDate;
    }

    /**
     * @return The attachments
     */
    @JsonProperty("attachments")
    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * @param attachments The attachments
     */
    @JsonProperty("attachments")
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    /**
     * @return The reportedDate
     */
    @JsonProperty("reported_date")
    public String getReportedDate() {
        return reportedDate;
    }

    /**
     * @param reportedDate The reported_date
     */
    @JsonProperty("reported_date")
    public void setReportedDate(String reportedDate) {
        this.reportedDate = reportedDate;
    }

    /**
     * @return The locations
     */
    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * @param locations The locations
     */
    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * @return The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The workorderId
     */
    @JsonProperty("workorder_id")
    public Integer getWorkorderId() {
        return workorderId;
    }

    /**
     * @param workorderId The workorder_id
     */
    @JsonProperty("workorder_id")
    public void setWorkorderId(
            Integer workorderId) {
        this.workorderId = workorderId;

    }

    /**
     * @return The siteId
     */
    @JsonProperty("site_id")
    public String getSiteId() {
        return siteId;
    }

    /**
     * @param siteId The site_id
     */
    @JsonProperty("site_id")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * @return The reportedBy
     */
    @JsonProperty("reported_by")
    public String getReportedBy() {
        return reportedBy;
    }

    /**
     * @param reportedBy The reported_by
     */
    @JsonProperty("reported_by")
    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    /**
     * @return The changedDate
     */
    @JsonProperty("changed_date")
    public String getChangedDate() {
        return changedDate;
    }

    /**
     * @param changedDate The changed_date
     */
    @JsonProperty("changed_date")
    public void setChangedDate(String changedDate) {
        this.changedDate = changedDate;

    }

    /**
     * @return The estimatedDuration
     */
    @JsonProperty("estimated_duration")
    public Double getEstimatedDuration() {
        return estimatedDuration;
    }

    /**
     * @param estimatedDuration The estimated_duration
     */
    @JsonProperty("estimated_duration")
    public void setEstimatedDuration(Double estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    /**
     * @return The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return The workType
     */
    @JsonProperty("work_type")
    public String getWorkType() {
        return workType;
    }

    /**
     * @param workType The work_type
     */
    @JsonProperty("work_type")
    public void setWorkType(String workType) {
        this.workType = workType;
    }

    /**
     * @return The workorderNum
     */
    @JsonProperty("workorder_num")
    public String getWorkorderNum() {
        return workorderNum;
    }

    /**
     * @param workorderNum The workorder_num
     */
    @JsonProperty("workorder_num")
    public void setWorkorderNum(String workorderNum) {
        this.workorderNum = workorderNum;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("asset")
    public Asset getAsset() {
        return asset;
    }

    @JsonProperty("asset")
    public void setAsset(Asset asset) {
        this.asset = asset;
    }


}
