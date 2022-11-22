package fr.epita.tests.datamodule;

import fr.epita.module.Competitor;
import fr.epita.service.CompetitorDAO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DefaultDataTestContextConfiguration.class)
public class TestCompetitorDAO {

    @Inject
    @Named("main-ds")
    DataSource dataSource;


    @BeforeEach
    public void setup() throws SQLException {
        Connection connection = dataSource.getConnection();
        String sql =
                "CREATE TABLE IF NOT EXISTS QUESTION(" +
                "id INTEGER auto_increment," +
                "title VARCHAR(500)" +
                ")";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.execute();

    }

    @Test
    public void testDAOCreate() throws SQLException {

        Competitor competitor = new Competitor();
        CompetitorDAO dao = new CompetitorDAO(dataSource);

        dao.readData(competitor);

        ResultSet resultSet = dataSource.getConnection().prepareStatement("SELECT * FROM QUESTION WHERE title='what is dependency injection?'").executeQuery();
        Assertions.assertTrue(resultSet.next());
        Assertions.assertEquals(resultSet.getInt("id"), competitor.getAge());

    }

    @Test
    public void testDAO_Update() throws SQLException {

        CompetitorDAO dao = new CompetitorDAO(dataSource);
        Competitor test = new Competitor();
        dao.readData(test);


        String newTitle = "new title";
        test.setFamilyName(newTitle);
        dao.update(test);

        PreparedStatement verificationStatement = dataSource.getConnection().prepareStatement("SELECT * FROM QUESTION WHERE id=?");
        verificationStatement.setInt(1, test.getAge());
        ResultSet resultSet = verificationStatement.executeQuery();
        Assertions.assertTrue(resultSet.next());
        Assertions.assertEquals(resultSet.getString("title"), newTitle);

    }




}
