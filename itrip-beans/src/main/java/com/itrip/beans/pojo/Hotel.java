package com.itrip.beans.pojo;

import java.util.Date;

/**
 *酒店
 */
public class Hotel {

    private Integer id;
    private String hotelName;
    private Integer countryId;
    private Integer provinceId;
    private Integer cityId;
    private String address;
    private String details;
    private String facilities;
    private String hotelPolicy;
    private Integer hotelType;
    private Integer hotelLevel;
    private Integer isGroupPurchase;
    private String redundanCityName;
    private String redundanProvinceName;
    private String redundanCountryName;
    private Integer redundanHotelStore;
    private Date creationDate;
    private Integer createBy;
    private Date modifyDate;
    private Integer modifieBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getHotelPolicy() {
        return hotelPolicy;
    }

    public void setHotelPolicy(String hotelPolicy) {
        this.hotelPolicy = hotelPolicy;
    }

    public Integer getHotelType() {
        return hotelType;
    }

    public void setHotelType(Integer hotelType) {
        this.hotelType = hotelType;
    }

    public Integer getHotelLevel() {
        return hotelLevel;
    }

    public void setHotelLevel(Integer hotelLevel) {
        this.hotelLevel = hotelLevel;
    }

    public Integer getIsGroupPurchase() {
        return isGroupPurchase;
    }

    public void setIsGroupPurchase(Integer isGroupPurchase) {
        this.isGroupPurchase = isGroupPurchase;
    }

    public String getRedundanCityName() {
        return redundanCityName;
    }

    public void setRedundanCityName(String redundanCityName) {
        this.redundanCityName = redundanCityName;
    }

    public String getRedundanProvinceName() {
        return redundanProvinceName;
    }

    public void setRedundanProvinceName(String redundanProvinceName) {
        this.redundanProvinceName = redundanProvinceName;
    }

    public String getRedundanCountryName() {
        return redundanCountryName;
    }

    public void setRedundanCountryName(String redundanCountryName) {
        this.redundanCountryName = redundanCountryName;
    }

    public Integer getRedundanHotelStore() {
        return redundanHotelStore;
    }

    public void setRedundanHotelStore(Integer redundanHotelStore) {
        this.redundanHotelStore = redundanHotelStore;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getModifieBy() {
        return modifieBy;
    }

    public void setModifieBy(Integer modifieBy) {
        this.modifieBy = modifieBy;
    }
}
