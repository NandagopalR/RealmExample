package com.sedin.workbookrealm.parser;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

import io.realm.RealmObject;

/**
 * Created by raja on 06/04/16.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OWNERTABLE",
        "DESCRIPTION",
        "CREATEDATE",
        "DOCUMENT",
        "URLTYPE",
        "WEBURL",
        "DOCTYPE",
        "OWNERID",
        "DOCINFOID",
        "URLNAME"
})
public class Attachment {
    @JsonProperty("url_type")
    private String urlType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("document_number")
    private String documentNumber;
    @JsonProperty("owner_id")
    private Integer ownerId;
    @JsonProperty("owner_table")
    private String ownerTable;
    @JsonProperty("document_id")
    private Integer documentId;
    @JsonProperty("url_name")
    private String urlName;
    @JsonProperty("document_type")
    private String documentType;
    @JsonProperty("web_url")
    private String webUrl;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The urlType
     */
    @JsonProperty("url_type")
    public String getUrlType() {
        return urlType;
    }

    /**
     * @param urlType The url_type
     */
    @JsonProperty("url_type")
    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

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

    /**
     * @return The documentNumber
     */
    @JsonProperty("document_number")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * @param documentNumber The document_number
     */
    @JsonProperty("document_number")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * @return The ownerId
     */
    @JsonProperty("owner_id")
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId The owner_id
     */
    @JsonProperty("owner_id")
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * @return The ownerTable
     */
    @JsonProperty("owner_table")
    public String getOwnerTable() {
        return ownerTable;
    }

    /**
     * @param ownerTable The owner_table
     */
    @JsonProperty("owner_table")
    public void setOwnerTable(String ownerTable) {
        this.ownerTable = ownerTable;
    }

    /**
     * @return The documentId
     */
    @JsonProperty("document_id")
    public Integer getDocumentId() {
        return documentId;
    }

    /**
     * @param documentId The document_id
     */
    @JsonProperty("document_id")
    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    /**
     * @return The urlName
     */
    @JsonProperty("url_name")
    public String getUrlName() {
        return urlName;
    }

    /**
     * @param urlName The url_name
     */
    @JsonProperty("url_name")
    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    /**
     * @return The documentType
     */
    @JsonProperty("document_type")
    public String getDocumentType() {
        return documentType;
    }

    /**
     * @param documentType The document_type
     */
    @JsonProperty("document_type")
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * @return The webUrl
     */
    @JsonProperty("web_url")
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * @param webUrl The web_url
     */
    @JsonProperty("web_url")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    /**
     * @return The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
