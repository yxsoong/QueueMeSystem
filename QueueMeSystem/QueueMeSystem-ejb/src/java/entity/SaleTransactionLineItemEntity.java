/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author User
 */
@Entity
public class SaleTransactionLineItemEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleTransactionLineItemId;
    private Integer serialNumber;
    private Integer quantity;
    @Column(precision = 11, scale = 2)
    private BigDecimal unitPrice;
    @Column(precision = 11, scale = 2)
    private BigDecimal subTotal;
    private String specialRequest;
    @ManyToOne
    @JoinColumn(nullable = true)
    private MenuItemEntity menuItemEntity;
    @ManyToOne 
    private OrderEntity orderEntity;
    @ManyToOne 
    private SaleTransactionEntity saleTransactionEntity;
    

    public SaleTransactionLineItemEntity() {
    }

    public SaleTransactionLineItemEntity(Integer serialNumber, Integer quantity, BigDecimal unitPrice, BigDecimal subTotal, String specialRequest) {
        this.serialNumber = serialNumber;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subTotal = subTotal;
        this.specialRequest = specialRequest;
    }

    public SaleTransactionLineItemEntity(Integer serialNumber, Integer quantity, BigDecimal unitPrice, BigDecimal subTotal, String specialRequest, MenuItemEntity menuItemEntity) {
        this.serialNumber = serialNumber;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subTotal = subTotal;
        this.specialRequest = specialRequest;
        this.menuItemEntity = menuItemEntity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.saleTransactionLineItemId != null ? this.saleTransactionLineItemId.hashCode() : 0);

        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SaleTransactionLineItemEntity)) {
            return false;
        }

        SaleTransactionLineItemEntity other = (SaleTransactionLineItemEntity) object;

        if ((this.saleTransactionLineItemId == null && other.saleTransactionLineItemId != null) || (this.saleTransactionLineItemId != null && !this.saleTransactionLineItemId.equals(other.saleTransactionLineItemId))) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "entity.SaleTransactionLineItemEntity[ saleTransactionLineItemId=" + this.saleTransactionLineItemId + " ]";
    }

    public Long getSaleTransactionLineItemId() {
        return saleTransactionLineItemId;
    }

    public void setSaleTransactionLineItemId(Long saleTransactionLineItemId) {
        this.saleTransactionLineItemId = saleTransactionLineItemId;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public MenuItemEntity getMenuItemEntity() {
        return menuItemEntity;
    }

    public void setMenuItemEntity(MenuItemEntity menuItemEntity) {
        this.menuItemEntity = menuItemEntity;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }

    public SaleTransactionEntity getSaleTransactionEntity() {
        return saleTransactionEntity;
    }

    public void setSaleTransactionEntity(SaleTransactionEntity saleTransactionEntity) {
        this.saleTransactionEntity = saleTransactionEntity;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }
    
}
