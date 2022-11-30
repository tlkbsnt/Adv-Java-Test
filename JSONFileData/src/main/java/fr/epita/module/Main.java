package fr.epita.module;

import fr.epita.services.CompetitorsDAO;

public class Main {
    public static void main(String[] args) {
        CompetitorsDAO competitorsDAO = new CompetitorsDAO();
        competitorsDAO.readData();

        //System.out.println(competitorsDAO);
    }
}
