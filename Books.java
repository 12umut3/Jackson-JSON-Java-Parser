package umut;

import java.util.Arrays;
import java.util.List;


public class Books {
    private String id;
    private List<String> cat;
    private String name;
    private String author;
    private String series_t;
    private int sequence_i;
    private String genre_s;
    private boolean inStock;
    private int price;
    private int pages_i;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getCat() {
        return cat;
    }

    public void setCat(List<String> cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSeries_t() {
        return series_t;
    }

    public void setSeries_t(String seriesT) {
        this.series_t = seriesT;
    }

    public int getSequence_i() {
        return sequence_i;
    }

    public void setSequence_i(Integer sequenceI) {
        this.sequence_i = sequenceI;
    }

    public String getGenre_s() {
        return genre_s;
    }

    public void setGenreS(String genreS) {
        this.genre_s = genre_s;
    }

    public boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public int getPages_i() {
        return pages_i;
    }

    public void setPages_i(int pages_i) {
        this.pages_i = pages_i;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("***** Book Details *****\n");
        sb.append("ID=" + getId() + "\n");
        sb.append("Category=" + Arrays.toString(getCat().toArray()) + "\n");
        sb.append("Name=" + getName() + "\n");
        sb.append("Author=" + getAuthor() + "\n");
        sb.append("series_t=" + getSeries_t() + "\n");
        sb.append("sequence_i=" + getSequence_i() + "\n");
        sb.append("Genre_s=" + getGenre_s() + "\n");
        sb.append("Price=" + getPrice() + "\n");
        sb.append("Pages_i=" + getPages_i() + "\n");
        sb.append("*****************************");

        return sb.toString();
    }
}
