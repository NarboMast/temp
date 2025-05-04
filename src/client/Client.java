package client;

import account.Account;

public class Client {
    private Account account;

    public Client(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
