public class PayPal implements Payment{
    private String email;
    private String transactionId;
    private boolean paymentSuccessful;

    public PayPal(String email, String transactionId) {
        this.email = email;
        this.transactionId = transactionId;
        this.paymentSuccessful = false;
    }

    @Override
    public void processPayment(double amount) {
        if (getEmail().contains("@") && getEmail().contains(".")){
            this.paymentSuccessful = true;
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Paypal: " + getEmail() + ", Transação: " + getTransactionId();
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }

    @Override
    public boolean isPaymentSuccessful() {
        return this.paymentSuccessful;
    }

    public String getEmail() {
        return email;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
