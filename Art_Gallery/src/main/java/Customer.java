import java.util.ArrayList;

public class Customer {
    private String name;
    private int wallet;
    private ArrayList<Artwork> artCollection;
   
   public Customer(String name, int wallet) {
       this.name = name;
       this.wallet = wallet;
       this.artCollection = new ArrayList<>();
   }

   public void buyArtwork(String artworkName, Gallery gallery) {
       if (gallery.checkStock(artworkName) != null){
           if (canBuy(gallery.checkStock(artworkName))){
               gallery.sellStock(gallery.checkStock(artworkName));
               withdraw(gallery.checkStock(artworkName).getPrice());
               gallery.addOrRemoveMoneyFromTill(gallery.checkStock(artworkName).getPrice());
               modifyArtCollection(gallery.checkStock(artworkName));
           }
       }
       gallery.stockTake();
   }

   public boolean canBuy(Artwork artwork){
       return artwork.getPrice() <= this.wallet;
   }

   public void modifyArtCollection(Artwork artwork){
       this.artCollection.add(artwork);
   }

   public void withdraw(int amount) {
       this.wallet -= amount;
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

   public ArrayList<Artwork> getArtCollection() {
       return artCollection;
   }

   public void setArtCollection(ArrayList<Artwork> artwork) {
       this.artCollection = artwork;
   }
}
