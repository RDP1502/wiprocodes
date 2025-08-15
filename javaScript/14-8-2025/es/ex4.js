class BankAccount{
    constructor(accountNumber, balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    deposit(amount){
        this.balance+= amount;
        console.log(`Deposited ${amount}. New balance is ${this.balance}`);
    }

    withdraw(amount){
        if(amount > this.balance){
            console.log('Insufficient Funds for withdrawal')

        }
        else{
            this.balance -= amount;
            console.log(`Withdrew ${amount}. new balance is ${this.balance}`)
        }
    }
}

let myAccount = new BankAccount('1234', 1000)
 myAccount.withdraw(100)
myAccount.deposit(200)