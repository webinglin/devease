package com.piedra.platease.dto;

/**
 * @author webinglin
 * @since 2017-05-06
 */
public class DeptDTO {

    private String id;
    private String deptName;
    private String deptCode;
    private String parentId;
    private String alias;
    private String remark;

    private String searchCont;
    private String searchDeptCode;

    public String getSearchDeptCode() {
        return searchDeptCode;
    }

    public void setSearchDeptCode(String searchDeptCode) {
        this.searchDeptCode = searchDeptCode;
    }

    public String getSearchCont() {
        return searchCont;
    }

    public void setSearchCont(String searchCont) {
        this.searchCont = searchCont;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
