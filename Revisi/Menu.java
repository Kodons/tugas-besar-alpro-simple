class Menu {
    String namaMenu;
    int hargaMenu;

    public Menu(String namaMenu, int hargaMenu) {
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }

    public String toString() {
        return namaMenu + "\tRp." + hargaMenu;
    }
}