package com.pluralsight.conference.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.RegistrationReport;

public interface RegistrationRepository extends JpaRepository<Registration, Long>{

	List<RegistrationReport> registrationReport();

}