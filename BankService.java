package com.sai.Service;

import org.springframework.ui.Model;

import com.sai.Entity.HDFCBank;

public interface BankService {

	public HDFCBank saveCustomerData(HDFCBank bank);	
	public HDFCBank getHDFCBankByAccountNumberForCheckBalance(long accountNumber);
	//public HDFCBank saveDepositAmount(long accountNumber);	
	//public void saveWithdrawAmount(HDFCBank bank);
	HDFCBank getWithdrawAmount(long accountNumber, String fullName, String password, double amount, Model model);
	HDFCBank saveDepositAmount(long accountNumber, String fullName, String password, double amount, Model model);
	//public HDFCBank getTranferAmountProcess(long accountNumber, String fullName, String password, long targetacNumber,
			//double amount, Model model);
	HDFCBank getTransferAmountProcess(long accountNumber, String fullName, String password, long targetacNumber,
			double amount, Model model);
	public void closeAccount(HDFCBank banks, long accountNumber, String fullName, String password, Model model);

	

}
