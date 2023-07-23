package com.sai.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.sai.BankRepository.BankRepository;
import com.sai.Entity.HDFCBank;
import com.sai.Service.BankService;

@Service
public class BankServiceImpl implements BankService{
     @Autowired
	private BankRepository bankRepository;
     
	@Override
	public HDFCBank saveCustomerData(@ModelAttribute HDFCBank bank) {
		
		return bankRepository.save(bank);
	}

	public HDFCBank getHDFCBankByAccountNumberForCheckBalance(long accountNumber) {
       
		return bankRepository.findById(accountNumber).orElse(null);
    }

	@Override
	public HDFCBank getWithdrawAmount(long accountNumber, String fullName, String password, double amount, Model model) {
	    HDFCBank bank = bankRepository.findById(accountNumber).orElse(null);
	    HDFCBank resultBank = null;

	    if (bank != null && bank.getFullName().equals(fullName) && bank.getPassword().equals(password)) {
	        double currentBalance = bank.getAmount();
	        if (currentBalance >= amount) { 
	            double newBalance = currentBalance - amount;
	            bank.setAmount(newBalance);
	            resultBank = bankRepository.save(bank);
	            model.addAttribute("beforeWithDraw", currentBalance);
	            model.addAttribute("depositedWithDraw", amount);
	            model.addAttribute("afterWithDraw", newBalance);

	        } else {
	            String errorMessage = "Insufficient Balance, Check your account balance";
	            model.addAttribute("accountError", errorMessage);
	        }
	    } else {
	        String errorMessage = "Invalid account credentials. Please check your full name and password.";
	        model.addAttribute("accountError", errorMessage);
	    }

	    return resultBank;
	}

	
	@Override
	public HDFCBank saveDepositAmount(long accountNumber, String fullName, String password, double amount, Model model) {
	    HDFCBank bank = bankRepository.findById(accountNumber).orElse(null);
	    HDFCBank resultBank = null;

	    if (bank != null && bank.getFullName().equals(fullName) && bank.getPassword().equals(password)) {
	        double currentBalance = bank.getAmount();
	        double newBalance = currentBalance + amount;
	        bank.setAmount(newBalance);
	        resultBank = bankRepository.save(bank);	        
	        model.addAttribute("beforeDeposit", currentBalance);
	        model.addAttribute("afterDeposit", newBalance);
	        model.addAttribute("depositedAmount", amount);
	    } else {
	        String errorMessage = "Invalid account credentials. Please check your full name and password.";
	        model.addAttribute("accountError", errorMessage);
	    }

	    return resultBank;
	}

	@Override
	public HDFCBank getTransferAmountProcess(long accountNumber, String fullName, String password, long targetacNumber,
	        double amount, Model model) {
		HDFCBank resultBank = null;
	    HDFCBank acnumber = bankRepository.findById(accountNumber).orElse(null);
	    HDFCBank tcnumber = bankRepository.findById(targetacNumber).orElse(null);

	    if (acnumber != null && acnumber.getFullName().equals(fullName) && acnumber.getPassword().equals(password) && tcnumber != null) {
	        double accurrentBalance = acnumber.getAmount();
	        double newBalance = accurrentBalance - amount;
	        double tcCurrentBalance = tcnumber.getAmount();
	        double tcNewBalance = tcCurrentBalance + amount;

	        if (accurrentBalance >= amount) {
	            acnumber.setAmount(newBalance);
	            tcnumber.setAmount(tcNewBalance);

	            resultBank= bankRepository.save(acnumber);
	            resultBank=bankRepository.save(tcnumber);

	            model.addAttribute("newBalance", newBalance);
	           
	        } else {
	            model.addAttribute("errorAcount", "Insufficient balance in the source account.");
	            
	        }
	    } else {
	        
	    	 model.addAttribute("errorAcount", "Invalid account details or target account not found.");
	        
	    }

	    return resultBank;
	}

	@Override
	public void closeAccount(HDFCBank banks, long accountNumber, String fullName, String password, Model model) {
		HDFCBank account = bankRepository.findById(accountNumber).orElse(null);

        if (account != null) {
           
            if (account.getFullName().equals(fullName) && account.getPassword().equals(password)) {
                account.setActive(false);
                bankRepository.save(account);
                model.addAttribute("close", "Account Closed Successfully");
            } else {
                model.addAttribute("close", "Invalid Full Name or Password");
            }
        } else {
            model.addAttribute("close", "Account Not Found");
        }
    }
	
}
