package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("printer");

        Item item = new Item(new BigDecimal(1000), 5, new BigDecimal(5000));
        Item item2 = new Item(new BigDecimal(1000), 50, new BigDecimal(50000));

        Invoice invoice = new Invoice("7");
        invoice.getItems().add(item);

        product.getItems().add(item);
        product.getItems().add(item2);
        item.setProduct(product);
        item2.setProduct(product);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        productDao.save(product);
        int productId = product.getId();
        itemDao.save(item);
        int itemId = item.getId();


        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertNotEquals(0, productId);
        Assert.assertNotEquals(0, itemId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
        invoiceDao.deleteById(productId);
        invoiceDao.deleteById(itemId);

    }
}
