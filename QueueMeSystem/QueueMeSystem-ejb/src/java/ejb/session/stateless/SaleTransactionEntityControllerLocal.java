/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.SaleTransactionEntity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface SaleTransactionEntityControllerLocal {

    public SaleTransactionEntity createSaleTransaction(SaleTransactionEntity saleTransactionEntity);

    public List<SaleTransactionEntity> retrieveSaleTransaction(Long customerId);
    
    public List<SaleTransactionEntity> retrieveAllSaleTransactions();
    
}
