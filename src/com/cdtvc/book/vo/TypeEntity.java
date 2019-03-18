package com.cdtvc.book.vo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "type", schema = "book station", catalog = "")
public class TypeEntity {
    private int typeId;
    private String typeName;

    @Id
    @Column(name = "Type_ID")
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "Type_name")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeEntity that = (TypeEntity) o;
        return typeId == that.typeId &&
                Objects.equals(typeName, that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, typeName);
    }
}
