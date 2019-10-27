/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Account;
import entity.History;
import entity.Product;
import interfaces.Saveble;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author lenovo
 */
public class SaveToBase implements Saveble{
    EntityManager em;
    EntityTransaction tx;

public SaveToBase() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SKTVp18ShopPU");
    em = emf.createEntityManager();
    tx = em.getTransaction();
}

    @Override
    public void saveProducts(List<Product>listProducts) {
        List<Product>listProductsSaved = loadProducts();

    for(int i=0; i<listProducts.size();i++){
        if(listProductsSaved.contains(listProducts.get(i))
                && !listProductsSaved.get(i).equals(listProducts.get(i))){
                tx.begin();
                em.merge(listProducts.get(i));
                tx.commit();
        }else if(listProducts.get(i).getId() == null){
                tx.begin();
                em.persist(listProducts.get(i));
                tx.commit();
        }else{
            }
        }
    } 

    @Override
    public List<Product>loadProducts(){
       return em.createQuery("SELECT p FROM Product p")
               .getResultList();
}

    @Override
    public void saveAccounts(List<Account> listAccounts){
          List<Account> listAccountsSaved = loadAccounts();
    for(int i=0; i<listAccounts.size();i++){
        if(listAccountsSaved.contains(listAccounts.get(i))
                && !listAccountsSaved.get(i).equals(listAccounts.get(i))){
                tx.begin();
                em.merge(listAccounts.get(i));
                tx.commit();
        }else if(listAccounts.get(i).getId()==null){
                tx.begin();
                em.persist(listAccounts.get(i));
                tx.commit();
        }else{
                continue;
        } 
    } 
} 

    @Override
    public List<Account>loadAccounts(){
       return em.createQuery("SELECT a FROM Account a").getResultList();
}

    @Override
    public void saveHistorys(List<History>listHistorys) {
        for(History delHistory : listHistorys){
int flag = 0;
            for(int i=0;i<listHistorys.size();i++){
                if(delHistory.getAccount().equals(listHistorys.get(i).getAccount())){
                    if(delHistory.getAccount().getId() == listHistorys.get(i).getAccount().getId()){
                        flag++;
                    }
if(flag >1){
                        listHistorys.get(i).getAccount().setCount(listHistorys.get(i).getAccount().getCount()+1);
                        listHistorys.remove(listHistorys.get(i));
                        System.out.println("Этот товар уже куплен");
                        break;
                    }
                }
            }
            if(flag > 1) break;
}
    List<History>listHistorysSaved = loadHistorys();
    History newHistory = null; 
    History editHistory = null;
    History returnHistory = null;
            int i = 0;
for(History h : listHistorys){
            if(!listHistorysSaved.contains(h) && h.getId() == null){
                newHistory = h;
                break;
}
if(listHistorysSaved.contains(h) && !listHistorysSaved.get(i).equals(h)){
                editHistory = h;
                break;
            }
if(listHistorysSaved.get(i).getId() == h.getId()
                    && listHistorysSaved.get(i).getReturnDate() == null && h.getReturnDate()!=null){
                returnHistory = h;
                break;
            }
            i++;
        }
        if(newHistory != null){
            tx.begin();
            em.persist(newHistory);
            em.flush();
            em.merge(newHistory.getProduct());
            tx.commit();
        }
        if(editHistory != null){
            tx.begin();
            em.merge(editHistory);
            em.merge(editHistory.getProduct());
            tx.commit();
        }
        if(returnHistory != null){
            tx.begin();
            em.merge(returnHistory);
            em.flush();
            em.merge(returnHistory.getProduct());
            tx.commit();
        }
    }

    @Override
    public List<History> loadHistorys() {
        return em.createQuery("SELECT h FROM History h")
                .getResultList();
    }
}



        