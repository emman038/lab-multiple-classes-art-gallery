import java.util.ArrayList;

public class Gallery {
  private String name;
  private int till;
  private ArrayList<Artwork> stock;

  public Gallery(String name, int till, ArrayList<Artwork> stock){
   this.name = name;
   this.till = till;
   this.stock = stock;
  }

  public Artwork checkStock(String artworkName){
      for (Artwork artwork : stock){
          if (artworkName.equals(artwork.getTitle())){
              return artwork;
          }
      }
      return null;
  }

  public void sellStock(Artwork artworkSold) {
      stock.remove(artworkSold);
  }

  public int stockTake(){
      int total = 0;
      for (Artwork artwork : stock){
          total += artwork.getPrice();
      }
      return total;
  }

  public void addOrRemoveMoneyFromTill(int amount){
      this.till += amount;
  }

  public String getName() {
   return this.name;
  }

  public void setName(String name) {
   this.name = name;
  }

  public int getTill() {
   return this.till;
  }

  public void setTill(int till) {
   this.till = till;
  }

  public ArrayList<Artwork> getStock() {
   return this.stock;
  }

  public void setStock(ArrayList<Artwork> stock) {
   this.stock = stock;
  }

}
