package org.tree;

import java.util.List;

public class TreeItem {
    private TreeItemInfo item;
    private List<TreeItemInfo> children;

    public TreeItem(TreeItemInfo item, List<TreeItemInfo> children) {
        this.item = item;
        this.children = children;
    }

    public TreeItemInfo getItem() {
        return item;
    }

    public void setItem(TreeItemInfo item) {
        this.item = item;
    }

    public List<TreeItemInfo> getChildren() {
        return children;
    }

    public void setChildren(List<TreeItemInfo> children) {
        this.children = children;
    }
}
