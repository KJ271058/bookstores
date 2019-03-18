package com.cdtvc.book.vo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orderdetails", schema = "book station", catalog = "")
public class OrderdetailsEntity {
    private int orderDetailsId;
    private int orderId;
    private int bookId;
    private int number;

    @Id
    @Column(name = "OrderDetails_ID")
    public int getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(int orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    @Basic
    @Column(name = "Order_ID")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "Book_ID")
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "Number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderdetailsEntity that = (OrderdetailsEntity) o;
        return orderDetailsId == that.orderDetailsId &&
                orderId == that.orderId &&
                bookId == that.bookId &&
                number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDetailsId, orderId, bookId, number);
    }
}
