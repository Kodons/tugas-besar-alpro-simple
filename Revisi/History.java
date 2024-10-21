import java.util.ArrayList;

public class History {
    String username;
    ArrayList<Menu> pesanan;

    History(String username, ArrayList<Menu> pesanan) {
        this.username = username;
        this.pesanan = pesanan;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Username: ").append(username).append("\nPesanan: ");
        for (Menu menu : pesanan) {
            sb.append(menu.namaMenu).append(" (Rp.").append(menu.hargaMenu).append("), ");
        }
        return sb.toString();
    }
}