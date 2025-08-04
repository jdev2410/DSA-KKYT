package com.dsa.learning.rough;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DuplicateTags {

    public static void main(String[] args) {
        Set<Tags> tagsSet= new HashSet<>();
        Tags tags= new Tags("ABC",1);
        Tags tags1= new Tags("ABC",1);
        tagsSet.add(tags);
        tagsSet.add(tags1);
        System.out.println(tagsSet);
    }
}
class Tags{
    private String tag;
    private Integer qty;

    public Tags(String tag, Integer qty) {
        this.tag = tag;
        this.qty = qty;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Tags{" +
                "tag='" + tag + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Tags tags = (Tags) object;
        return Objects.equals(tag, tags.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }
}
