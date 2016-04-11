package com.sedin.workbookrealm.parser;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by raja on 06/04/16.
 */
public class Location {

    @JsonProperty("DESCRIPTION")
    private String DESCRIPTION;
    @JsonProperty("LOCATION")
    private String LOCATION;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The DESCRIPTION
     */
    @JsonProperty("DESCRIPTION")
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     *
     * @param DESCRIPTION
     * The DESCRIPTION
     */
    @JsonProperty("DESCRIPTION")
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     *
     * @return
     * The LOCATION
     */
    @JsonProperty("LOCATION")
    public String getLOCATION() {
        return LOCATION;
    }

    /**
     *
     * @param LOCATION
     * The LOCATION
     */
    @JsonProperty("LOCATION")
    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
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
