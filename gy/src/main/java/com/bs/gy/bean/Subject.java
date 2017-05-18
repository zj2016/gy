package com.bs.gy.bean;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private Integer ids;

    private String name;

    private String extra1;

    private String extra2;
    
    private List<Two> twoList = new ArrayList<Two>();
    
    private List<Major> majorList = new ArrayList<Major>();

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1 == null ? null : extra1.trim();
    }

    public String getExtra2() {
        return extra2;
    }

    public void setExtra2(String extra2) {
        this.extra2 = extra2 == null ? null : extra2.trim();
    }

	public List<Two> getTwoList() {
		return twoList;
	}

	public void setTwoList(List<Two> twoList) {
		this.twoList = twoList;
	}

	public List<Major> getMajorList() {
		return majorList;
	}

	public void setMajorList(List<Major> majorList) {
		this.majorList = majorList;
	}
    
    
}