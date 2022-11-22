package fr.epita.tests.orm;

import fr.epita.module.Competitor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.inject.Inject;
import javax.sql.DataSource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ORMTestContextConfiguration.class)
public class TestHibernate {

    @Inject
    DataSource ds;

    @Inject
    SessionFactory factory;



    @Test
    public void test(){
        Session session = factory.openSession();

        Competitor competitor = new Competitor();

        session.saveOrUpdate(competitor);

      Competitor competitor1 = new Competitor();
      //competitor.setId(1);
      //competitor.setTitle("newValue");
      //session.update(competitor1);

    }


}
