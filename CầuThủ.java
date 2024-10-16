public class CầuThủ {
    private String tên;
    private int tuổi;
    private String vịTrí;
    private int sốBànThắng;

    public CầuThủ(String tên, int tuổi, String vịTrí) {
        this.tên = tên;
        this.tuổi = tuổi;
        this.vịTrí = vịTrí;
        this.sốBànThắng = 0;
    }

    public String getTên() {
        return tên;
    }

    public int getTuổi() {
        return tuổi;
    }

    public String getVịTrí() {
        return vịTrí;
    }

    public int getSốBànThắng() {
        return sốBànThắng;
    }

    public void ghiBàn() {
        this.sốBànThắng++;
    }

    @Override
    public String toString() {
        return "Cầu thủ{" +
                "Tên='" + tên + '\'' +
                ", Tuổi=" + tuổi +
                ", Vị trí='" + vịTrí + '\'' +
                ", Số bàn thắng=" + sốBànThắng +
                '}';
    }
}
