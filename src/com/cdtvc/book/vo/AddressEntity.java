package com.cdtvc.book.vo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "book station", catalog = "")
public class AddressEntity {
    private int addressId;
    private int userId;
    private String address;
    private String addressName;
    private int addressMobile;

    @Id
    @Column(name = "Address_ID")
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "User_ID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Address_name")
    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Basic
    @Column(name = "Address_mobile")
    public int getAddressMobile() {
        return addressMobile;
    }

    public void setAddressMobile(int addressMobile) {
        this.addressMobile = addressMobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return addressId == that.addressId &&
                userId == that.userId &&
                addressMobile == that.addressMobile &&
                Objects.equals(address, that.address) &&
                Objects.equals(addressName, that.addressName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, userId, address, addressName, addressMobile);
    }
}
