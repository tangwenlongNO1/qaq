package com.zenq.ssm.entity;

public class Plate {
    private Integer plateId;

    private String plateName;

    public Integer getPlateId() {
        return plateId;
    }

    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
    }

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName == null ? null : plateName.trim();
    }
}