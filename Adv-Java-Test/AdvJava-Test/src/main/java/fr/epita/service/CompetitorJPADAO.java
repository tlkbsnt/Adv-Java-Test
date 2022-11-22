package fr.epita.service;

import fr.epita.module.Competitor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CompetitorJPADAO {
    private final SessionFactory factory;

    public CompetitorJPADAO(SessionFactory factory) {
        this.factory = factory;
    }


    public void create(Competitor competitor) {
        Session session = this.factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(competitor);
        tx.commit();
    }


    public void update(Competitor competitor) {
        Session session = this.factory.openSession();
        session.update(competitor);
    }

    public void delete(Competitor competitor) {
        Session session = this.factory.openSession();
        session.delete(competitor);
    }

    public List<Competitor> search(Competitor competitor) {
        Session session = this.factory.openSession();
        Query<Competitor> from_question = session.createQuery("from Question q where q.title = :title", Competitor.class);
        from_question.setParameter("family_name", competitor.getFamilyName());
        return from_question.list();
    }

}
