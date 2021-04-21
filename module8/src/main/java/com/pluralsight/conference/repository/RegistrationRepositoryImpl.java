package com.pluralsight.conference.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.RegistrationReport;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Registration save(Registration registration) {
		entityManager.persist(registration);
		return registration;
	}

	@Override
	public List<Registration> findAll() {
		List<Registration> registrations = entityManager.createQuery("Select r from Registration r").getResultList();
		return registrations;
	}

	@Override
	public List<RegistrationReport> findAllReports() {
		
		List<RegistrationReport> registrationReports = 
				entityManager.createNamedQuery(Registration.REGISTRATION_REPORT).getResultList();
		return registrationReports;
	}
	
}
