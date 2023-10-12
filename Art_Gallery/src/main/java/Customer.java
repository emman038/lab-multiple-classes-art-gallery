
public class Customer {
    private String name;
    private int wallet;
   
   public Customer(String name, int wallet) {
       this.name = name;
       this.wallet = wallet;
   }

   public void buyArtwork(String artworkName, Gallery gallery) {
       for (Artwork artwork : gallery.getStock()) {
           if (artworkName.equals(artwork.getTitle())) {
               gallery.sellStock(artwork);
               gallery.addTill(artwork.getPrice());
               withdraw(artwork.getPrice());
               break;
           }
       }
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

    public void withdraw(int amount) {
       this.wallet -= amount;
    }

}
