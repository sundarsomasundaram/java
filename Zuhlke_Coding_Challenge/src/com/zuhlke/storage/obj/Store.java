package com.zuhlke.storage.obj;

import com.opencsv.bean.CsvBindByName;
import com.zuhlke.storage.utils.LocalDateConverter;

import java.math.BigDecimal;

public class Store {
    @CsvBindByName(column = "Row ID")
    private String Row_ID;
    @CsvBindByName(column = "Order ID")
    private String Order_ID;
    @CsvBindByName(column = "Order Date")
    private String Order_Date;
    @CsvBindByName(column = "Ship Date")
    private String Ship_Date;
    @CsvBindByName(column = "Ship Mode")
    private String Ship_Mode;
    @CsvBindByName(column = "Customer ID")
    private String Customer_ID;
    @CsvBindByName(column = "Customer Name")
    private String CustomerName;
    @CsvBindByName(column = "Segment")
    private String Segment;
    @CsvBindByName(column = "Country")
    private String Country;
    @CsvBindByName(column = "City")
    private String City;
    @CsvBindByName(column = "State")
    private String State;
    @CsvBindByName(column = "Postal Code")
    private String Postal_Code;
    @CsvBindByName(column = "Region")
    private String Region;
    @CsvBindByName(column = "Product ID")
    private String Product_ID;
    @CsvBindByName(column = "Category")
    private String Category;
    @CsvBindByName(column = "Sub-Category")
    private String Sub_Category;
    @CsvBindByName(column = "Product Name")
    private String Product_Name;
    @CsvBindByName(column = "Sales")
    private String Sales;
    @CsvBindByName(column = "Quantity")
    private Integer Quantity;
    @CsvBindByName(column = "Discount")
    private BigDecimal Discount;
    @CsvBindByName(column = "Profit")
    private BigDecimal Profit;

    public java.sql.Date getOrder_Date() {
        return new java.sql.Date(LocalDateConverter.convert(Order_Date).getTime());
    }

    public void setOrder_Date(String order_Date) {
        Order_Date = order_Date;
    }

    public java.sql.Date getShip_Date() {
        return new java.sql.Date(LocalDateConverter.convert(Ship_Date).getTime());
    }

    public void setShip_Date(String ship_Date) {
        Ship_Date = ship_Date;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public BigDecimal getDiscount() {
        return Discount;
    }

    public void setDiscount(BigDecimal discount) {
        Discount = discount;
    }

    public BigDecimal getProfit() {
        return Profit;
    }

    public void setProfit(BigDecimal profit) {
        Profit = profit;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String order_ID) {
        Order_ID = order_ID;
    }


    public String getShip_Mode() {
        return Ship_Mode;
    }

    public void setShip_Mode(String ship_Mode) {
        Ship_Mode = ship_Mode;
    }

    public String getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(String customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getSegment() {
        return Segment;
    }

    public void setSegment(String segment) {
        Segment = segment;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(String postal_Code) {
        Postal_Code = postal_Code;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(String product_ID) {
        Product_ID = product_ID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getSales() {
        return Sales;
    }

    public void setSales(String sales) {
        Sales = sales;
    }


    public String getSub_Category() {
        return Sub_Category;
    }

    public void setSub_Category(String sub_Category) {
        this.Sub_Category = sub_Category;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.Product_Name = product_Name;
    }

    public String getRow_ID() {
        return Row_ID;
    }

    public void setRow_ID(String row_ID) {
        this.Row_ID = row_ID;
    }
}
