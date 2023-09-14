package org.tree;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tree {
    private String branchName;

    public Tree(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void createTree() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        HashMap<String, TreeItem> companyDependencies = new HashMap<>();
        List<TreeItemInfo> items = new ArrayList<>();
        List<TreeItemInfo> children = new ArrayList<>();

        items.add(new TreeItemInfo("AUP", "1", "0"));
        items.add(new TreeItemInfo("ASB", "2", "1"));
        items.add(new TreeItemInfo("KRB", "3", "1"));
        items.add(new TreeItemInfo("ORB", "4", "2"));
        items.add(new TreeItemInfo("URB", "5", "4"));

        for(TreeItemInfo item : items) {
            String orgGuid = item.getOrgGUID();

            companyDependencies.put(orgGuid, new TreeItem(item, children));
        }

        for(Map.Entry<String, TreeItem> mapObj : companyDependencies.entrySet()) {
            String orgGUID = mapObj.getKey();

            for(TreeItemInfo item : items) {
                String parentGUID = item.getParentGUID();
                String name = item.getOrgName();

                if(orgGUID.equals(parentGUID)) {
                    children.add(item);
                }
            }

            companyDependencies.get(orgGUID).setChildren(children);

//            System.out.println(gson.toJson(companyDependencies));
//            TreeItem newItem = companyDependencies.get(orgGUID);
//
//            companyDependencies.put(orgGUID, newItem);
            System.out.println(gson.toJson(companyDependencies.get(orgGUID)));
            System.out.println("-----------------------------------------------");
            System.out.println(gson.toJson(companyDependencies.get("2")));
            children.clear();
//            System.out.println(gson.toJson(companyDependencies.get(orgGUID)));
        }

//        System.out.println(gson.toJson(companyDependencies));
    }
}
