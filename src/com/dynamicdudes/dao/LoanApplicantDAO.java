package com.dynamicdudes.dao;

import java.util.List;

import com.dynamicdudes.model.LoanApplicant;

public interface LoanApplicantDAO {
	
	public void saveLoanApplicant(LoanApplicant loanApplicant);
	public List<LoanApplicant> getLoanApplicants();
	public LoanApplicant getLoanApplicantById(int applicationIdd);
	

}
