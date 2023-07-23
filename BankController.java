package com.sai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sai.Entity.HDFCBank;
import com.sai.Service.BankService;


@Controller
public class BankController {
	@Autowired
	private BankService bankService;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/newaccount")
	public String openForm() {
		return "newaccount";
	}

	@PostMapping("/save")
	public String saveData(Model model, HDFCBank bank) {
		bankService.saveCustomerData(bank);
		model.addAttribute("success", "Your Account Created Successfully");
		return "newaccount";
	}

	@GetMapping("/balance")
	public String getBalanceForm() {
		return "balance";
	}

	@PostMapping("/getbalance")
	public String getBalance(HDFCBank banks, @RequestParam("accountNumber") long accountNumber,
			@RequestParam("fullName") String fullName, @RequestParam("password") String password, Model model) {
		HDFCBank bank = bankService.getHDFCBankByAccountNumberForCheckBalance(accountNumber);

		if (bank != null && bank.getFullName().equals(fullName) && bank.getPassword().equals(password)) {
			double balance = bank.getAmount();
			model.addAttribute("accountnumber", accountNumber);
			model.addAttribute("fullname", fullName);
			model.addAttribute("balance", balance);
			model.addAttribute("mobile", bank.getMobileNumber());
			return "balanceform";
		} else {
			return "invalid";
		}
	}

	@GetMapping("/deposit")
	public String getDepopsitForm() {
		return "deposit";
	}

	@PostMapping("/depositAmount")
    public String processDepositAmount(@RequestParam("accountNumber") long accountNumber,
                                       @RequestParam("fullName") String fullName,
                                       @RequestParam("password") String password,
                                       @RequestParam("amount") double amount,
                                       Model model) {
        HDFCBank bank = bankService.saveDepositAmount(accountNumber, fullName, password, amount, model);
        if (bank == null) {
        	model.addAttribute("hh", "invalid");
			  return "deposit";

        } else {
            model.addAttribute("fullname", fullName);
            model.addAttribute("beforeDeposit", model.getAttribute("beforeDeposit"));
            model.addAttribute("depositedAmount", model.getAttribute("depositedAmount"));
            model.addAttribute("afterDeposit", model.getAttribute("afterDeposit"));
            model.addAttribute("mobile", bank.getMobileNumber());

            return "depositform";
        }
	 }

	@GetMapping("/withdraw")
	public String getWithDrawForm() {
		return "withdraw";
	}

	@GetMapping("/withdrawAmount")
	public String processWithdrawAmount(@RequestParam("accountNumber") long accountNumber,
			@RequestParam("fullName") String fullName, @RequestParam("password") String password,
			@RequestParam("amount") double amount, Model model) {
		
	
		  HDFCBank bank=bankService.getWithdrawAmount(accountNumber, fullName,password, amount, model); 
		  if (bank==null) {
			  model.addAttribute("hh", "invalid");
			  return "withdraw";
			  } 
		  else {
		  
			    model.addAttribute("fullname", fullName);
	            model.addAttribute("beforeWithDraw", model.getAttribute("beforeWithDraw"));
	            model.addAttribute("depositedWithDraw", model.getAttribute("depositedWithDraw"));
	            model.addAttribute("afterWthDraw", model.getAttribute("afterWithDraw"));
	            model.addAttribute("mobile", bank.getMobileNumber());
		
		 return "withdrawfrom";		
		
	}
	}
	
	
	@GetMapping("/transfer")
	public String getTransferForm() 
	{
		return "transfer";
		
	}
	
	@PostMapping("/trasferamount")
	public String processTransferAmount(@RequestParam("accountNumber") long accountNumber,
			@RequestParam("fullName") String fullName, @RequestParam("password") String password,
			@RequestParam("targetacNumber") long targetacNumber,
			@RequestParam("amount") double amount, Model model)
	{
		 
		  HDFCBank bank=bankService.getTransferAmountProcess(accountNumber, fullName,password,targetacNumber,amount, model); 

		  if (bank==null) {
			  model.addAttribute("hh", "invalid");
			  return "transfer";
			  }else {
				  
				    model.addAttribute("fullname", fullName);
		            model.addAttribute("newBalance", model.getAttribute("newBalance"));
		            model.addAttribute("mobile", bank.getMobileNumber());
			
			 return "transferform";		

	}
	
	}
	
	@GetMapping("/closeacc")
	public String getCloseAccount() 
	{
		return "closeaccount";
		
	}
	
	@PostMapping("/closeAccount")
    public String closeAccount(HDFCBank bank,@RequestParam("accountNumber") long accountNumber,
                               @RequestParam("fullName") String fullName,
                               @RequestParam("password") String password,
                               Model model) {

        bankService.closeAccount(bank,accountNumber, fullName, password, model);
        model.addAttribute("close", "Account Closed Successfully");
        return "closeaccount";
    }
	
	@GetMapping("/aboutus")
	public String aboutUs()
	{
		return "contactUS";
		
	}
	
}
