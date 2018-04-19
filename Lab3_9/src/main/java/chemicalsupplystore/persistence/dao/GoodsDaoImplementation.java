package chemicalsupplystore.persistence.dao;

import chemicalsupplystore.goods.Goods;

import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.io.Serializable;

@Named
@Dependent
public class GoodsDaoImplementation extends AbstractDao<Goods> implements GoodsDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Goods> getEntityClass() {
        return Goods.class;
    }

    @Resource
    private UserTransaction userTransaction;

}