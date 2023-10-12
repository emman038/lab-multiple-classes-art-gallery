public class Customer {
    private String name;
   private int wallet;
   
   public Customer(String name, int wallet) {
       this.name = name;
       this.wallet = wallet;
   }
   
   public String getName() {
       return this.name;
   }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}
