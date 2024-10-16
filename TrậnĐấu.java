public class TrậnĐấu {
    private String đốiThủ;
    private int sốBànThắngĐội;
    private int sốBànThắngĐốiThủ;

    public TrậnĐấu(String đốiThủ, int sốBànThắngĐội, int sốBànThắngĐốiThủ) {
        this.đốiThủ = đốiThủ;
        this.sốBànThắngĐội = sốBànThắngĐội;
        this.sốBànThắngĐốiThủ = sốBànThắngĐốiThủ;
    }

    public String getĐốiThủ() {
        return đốiThủ;
    }

    public int getSốBànThắngĐội() {
        return sốBànThắngĐội;
    }

    public int getSốBànThắngĐốiThủ() {
        return sốBànThắngĐốiThủ;
    }

    @Override
    public String toString() {
        return "Trận đấu{" +
                "Đối thủ='" + đốiThủ + '\'' +
                ", Số bàn thắng đội=" + sốBànThắngĐội +
                ", Số bàn thắng đối thủ=" + sốBànThắngĐốiThủ +
                '}';
    }
}