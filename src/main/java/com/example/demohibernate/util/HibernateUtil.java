package com.example.demohibernate.util;



import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    static final SessionFactory sessionFactory = buildSessionFactory();

    static final SessionFactory buildSessionFactory (){
        // configre n lay thong tin tu file hibernate.cfg.xml
        ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources((org.hibernate.service.ServiceRegistry) serviceRegistry).getMetadataBuilder().build();
        return metadata.getSessionFactoryBuilder().build();
    }

    public HibernateUtil() {
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
