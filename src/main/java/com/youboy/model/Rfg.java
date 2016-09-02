package com.youboy.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by neron.liu on 9/2/16.
 */
public class Rfg {

    private Integer id = 0;

    private String name = "";

    private Date createdAt = null;

    private Date modifiedAt = null;

    @ApiModelProperty
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ApiModelProperty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @ApiModelProperty
    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
