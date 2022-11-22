package fr.epita.service;

import fr.epita.module.Competitor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.sql.DataSource;
import java.sql.*;

public class CompetitorDAO {
    private static final String INSERT = "INSERT INTO QUESTION(title) VALUES(?)";
    private static final Logger LOGGER = LogManager.getLogger(CompetitorDAO.class);
    DataSource dataSource;
    public CompetitorDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public void readData(Competitor competitor) {


        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, competitor.getFamilyName());
            preparedStatement.setString(2, competitor.getGivenName());
            preparedStatement.setString(3, String.valueOf(competitor.getWeight()));
            preparedStatement.setString(4, String.valueOf(competitor.getWeight()));
            preparedStatement.setString(5, String.valueOf(competitor.getWeight()));
            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            generatedKeys.next();

            int id = generatedKeys.getInt("id");
            competitor.setAge(id);
        } catch (SQLException e) {
            LOGGER.error("Error in database",e);
        }
    }
}
