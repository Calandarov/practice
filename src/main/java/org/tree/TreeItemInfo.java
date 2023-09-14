package org.tree;

public class TreeItemInfo {
    private String orgName;
    private String orgGUID;
    private String parentGUID;

    public TreeItemInfo(String orgName, String orgGUID, String parentGUID) {
        this.orgName = orgName;
        this.orgGUID = orgGUID;
        this.parentGUID = parentGUID;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgGUID() {
        return orgGUID;
    }

    public void setOrgGUID(String orgGUID) {
        this.orgGUID = orgGUID;
    }

    public String getParentGUID() {
        return parentGUID;
    }

    public void setParentGUID(String parentGUID) {
        this.parentGUID = parentGUID;
    }
}
