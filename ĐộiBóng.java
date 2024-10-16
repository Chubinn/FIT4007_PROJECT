import java.io.*;
import java.util.ArrayList;

public class ĐộiBóng {
    private String tên;
    private ArrayList<CầuThủ> cầuThủ;
    private ArrayList<TrậnĐấu> trậnĐấu;

    public ĐộiBóng ( String tên ) {
        this.tên = tên;
        this.cầuThủ = new ArrayList<>();
        this.trậnĐấu = new ArrayList<>();
    }

    public void thêmCầuThủ ( CầuThủ cầuThủ ) {
        this.cầuThủ.add(cầuThủ);
    }

    public void thêmTrậnĐấu ( TrậnĐấu trậnĐấu ) {
        this.trậnĐấu.add(trậnĐấu);
    }

    public boolean xóaCầuThủ ( String tên ) {
        for (CầuThủ cầuThủ : this.cầuThủ) {
            if (cầuThủ.getTên().equals(tên)) {
                this.cầuThủ.remove(cầuThủ);
                return true;
            }
        }
        return false;
    }

    public boolean xóaTrậnĐấu ( String đốiThủ ) {
        for (TrậnĐấu trận : this.trậnĐấu) {
            if (trận.getĐốiThủ().equals(đốiThủ)) {
                this.trậnĐấu.remove(trận);
                return true;
            }
        }
        return false;
    }

    public void inDanhSáchCầuThủ () {
        System.out.println("Danh sách cầu thủ của đội " + tên + ":");
        for (CầuThủ cầuThủ : cầuThủ) {
            System.out.println(cầuThủ);
        }
    }

    public void inDanhSáchTrậnĐấu () {
        System.out.println("Danh sách trận đấu của đội " + tên + ":");
        for (TrậnĐấu trận : trậnĐấu) {
            System.out.println(trận);
        }
    }

    public void inThốngKê () {
        int tổngBànThắng = 0;
        for (CầuThủ cầuThủ : cầuThủ) {
            tổngBànThắng += cầuThủ.getSốBànThắng();
        }
        System.out.println("Tổng số bàn thắng của đội: " + tổngBànThắng);
    }

    public void lưuCầuThủVàoTệp ( String tênTệp ) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(tênTệp));
        for (CầuThủ cầuThủ : cầuThủ) {
            writer.write(cầuThủ.toString());
            writer.newLine();
        }
        writer.close();
    }

    public void lưuTrậnĐấuVàoTệp ( String tênTệp ) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(tênTệp));
        for (TrậnĐấu trận : trậnĐấu) {
            writer.write(trận.toString());
            writer.newLine();
        }
        writer.close();
    }
}