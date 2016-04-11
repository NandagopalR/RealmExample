package com.sedin.workbookrealm.modules;


import java.util.Date;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by raja on 06/04/16.
 */
public class WorkOrderModule extends RealmObject {

    private String description;
    private String scheduledFinishDate;
    private String targetedStartDate;
    private String assignedDate;
    private String changedBy;
    private String phone;
    private String scheduledStartDate;
    private RealmList<Attachment> attachments;
    private String reportedDate;
    private RealmList<Location> locations;
    private String status;
    private Integer workorderId;
    private String siteId;
    private String reportedBy;
    private String changedDate;
    private Double estimatedDuration;
    private Integer priority;
    private String location;
    private String workType;
    private String workorderNum;
    private Asset asset;
    private Date mAssignedDateFormat;
    private Date mScheduleStartDateFormat;
    private Date mTargetStartDateFormat;
    private Date mScheduleFinishDateFormat;
    private Date mTargetFinishDateFormat;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScheduledFinishDate() {
        return scheduledFinishDate;
    }

    public void setScheduledFinishDate(String scheduledFinishDate) {
        this.scheduledFinishDate = scheduledFinishDate;
    }

    public String getTargetedStartDate() {
        return targetedStartDate;
    }

    public void setTargetedStartDate(String targetedStartDate) {
        this.targetedStartDate = targetedStartDate;
    }

    public String getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(String assignedDate) {
        this.assignedDate = assignedDate;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getScheduledStartDate() {
        return scheduledStartDate;
    }

    public void setScheduledStartDate(String scheduledStartDate) {
        this.scheduledStartDate = scheduledStartDate;
    }

    public RealmList<Attachment> getAttachments() {

        return attachments;
    }

    public void setAttachments(RealmList<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(String reportedDate) {
        this.reportedDate = reportedDate;
    }

    public RealmList<Location> getLocations() {
        return locations;
    }

    public void setLocations(RealmList<Location> locations) {
        this.locations = locations;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getWorkorderId() {
        return workorderId;
    }

    public void setWorkorderId(Integer workorderId) {
        this.workorderId = workorderId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(String changedDate) {
        this.changedDate = changedDate;
    }

    public Double getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(Double estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getWorkorderNum() {
        return workorderNum;
    }

    public void setWorkorderNum(String workorderNum) {
        this.workorderNum = workorderNum;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }
}
