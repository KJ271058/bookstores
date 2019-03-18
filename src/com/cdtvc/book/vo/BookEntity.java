package com.cdtvc.book.vo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "book", schema = "book station", catalog = "")
public class BookEntity {
    private int bookId;
    private int typeId;
    private String bookName;
    private String bookData;
    private BigDecimal bookPrice;

    @Id
    @Column(name = "Book_ID")
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "Type_ID")
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "Book_name")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "Book_data")
    public String getBookData() {
        return bookData;
    }

    public void setBookData(String bookData) {
        this.bookData = bookData;
    }

    @Basic
    @Column(name = "Book_price")
    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity that = (BookEntity) o;
        return bookId == that.bookId &&
                typeId == that.typeId &&
                Objects.equals(bookName, that.bookName) &&
                Objects.equals(bookData, that.bookData) &&
                Objects.equals(bookPrice, that.bookPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, typeId, bookName, bookData, bookPrice);
    }
}
