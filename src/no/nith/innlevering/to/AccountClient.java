package no.nith.innlevering.to;

public class AccountClient {

	public static void main(String[] args){
		System.out.print(AccountMaintenance.getAccount("accounts", "11111111").getBalance());

		
	}
}
