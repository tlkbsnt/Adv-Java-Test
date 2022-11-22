package fr.epita.tests.orm;

import fr.epita.module.Competitor;
import fr.epita.service.CompetitorJPADAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ORMTestContextConfiguration.class)
public class TestJPADAO {

    @Inject
    CompetitorJPADAO competitorJPADAO;

    @Inject
    DataSource ds;

    @Test
    public void testJPADAO() throws SQLException {

        Competitor competitor1 = new Competitor();
        Competitor competitor2 = new Competitor();
        competitorJPADAO.create(competitor1);
        competitorJPADAO.create(competitor2);



        ResultSet resultSet = ds.getConnection().prepareStatement("SELECT count(1) as cnt FROM QUESTIONS WHERE Q_TITLE IN ('test', 'test2')").executeQuery();
        resultSet.next();
        int cnt = resultSet.getInt("cnt");
        Assertions.assertEquals(2, cnt);
    }

}
