package Nov.ex_18112024_Exception_Handle_Part2;

public class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {

        return amount;
    }

    public void setAmount(Integer amount) {

        this.amount = amount;
    }

public Integer add(Bank bankName) throws Exception {

        if(!bankName.currency.equalsIgnoreCase("INR")){
            throw new Exception("Currency mismatch, cant procced");
        }
        return bankName.amount + this.amount;
}

}
