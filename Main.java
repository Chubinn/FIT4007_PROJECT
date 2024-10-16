import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ĐộiBóng đội = new ĐộiBóng("Đội Bóng Của Tôi");

        int lựaChọn;
        do {
            // Hiển thị menu
            System.out.println("\n----- Quản Lý Đội Bóng -----");
            System.out.println("1. Thêm cầu thủ");
            System.out.println("2. Thêm trận đấu");
            System.out.println("3. Xem danh sách cầu thủ");
            System.out.println("4. Xem danh sách trận đấu");
            System.out.println("5. Xem thống kê");
            System.out.println("6. Xóa cầu thủ");
            System.out.println("7. Xóa trận đấu");
            System.out.println("8. Lưu danh sách cầu thủ vào tệp");
            System.out.println("9. Lưu danh sách trận đấu vào tệp");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            lựaChọn = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số

            switch (lựaChọn) {
                case 1:
                    // Thêm cầu thủ
                    System.out.print("Nhập tên cầu thủ: ");
                    String tên = scanner.nextLine();
                    System.out.print("Nhập tuổi cầu thủ: ");
                    int tuổi = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số
                    System.out.print("Nhập vị trí cầu thủ: ");
                    String vịTrí = scanner.nextLine();
                    CầuThủ cầuThủ = new CầuThủ(tên, tuổi, vịTrí);
                    đội.thêmCầuThủ(cầuThủ);
                    System.out.println("Đã thêm cầu thủ " + tên);
                    break;

                case 2:
                    // Thêm trận đấu
                    System.out.print("Nhập tên đối thủ: ");
                    String đốiThủ = scanner.nextLine();
                    System.out.print("Nhập số bàn thắng của đội: ");
                    int bànThắngĐội = scanner.nextInt();
                    System.out.print("Nhập số bàn thắng của đối thủ: ");
                    int bànThắngĐốiThủ = scanner.nextInt();
                    TrậnĐấu trậnĐấu = new TrậnĐấu(đốiThủ, bànThắngĐội, bànThắngĐốiThủ);
                    đội.thêmTrậnĐấu(trậnĐấu);
                    System.out.println("Đã thêm trận đấu với đối thủ " + đốiThủ);
                    break;

                case 3:
                    // Xem danh sách cầu thủ
                    đội.inDanhSáchCầuThủ();
                    break;

                case 4:
                    // Xem danh sách trận đấu
                    đội.inDanhSáchTrậnĐấu();
                    break;

                case 5:
                    // Xem thống kê
                    đội.inThốngKê();
                    break;

                case 6:
                    // Xóa cầu thủ
                    System.out.print("Nhập tên cầu thủ cần xóa: ");
                    String tênCầuThủXóa = scanner.nextLine();
                    boolean đãXóaCầuThủ = đội.xóaCầuThủ(tênCầuThủXóa);
                    if (đãXóaCầuThủ) {
                        System.out.println("Đã xóa cầu thủ " + tênCầuThủXóa);
                    } else {
                        System.out.println("Không tìm thấy cầu thủ " + tênCầuThủXóa);
                    }
                    break;

                case 7:
                    // Xóa trận đấu
                    System.out.print("Nhập tên đối thủ của trận đấu cần xóa: ");
                    String đốiThủXóa = scanner.nextLine();
                    boolean đãXóaTrận = đội.xóaTrậnĐấu(đốiThủXóa);
                    if (đãXóaTrận) {
                        System.out.println("Đã xóa trận đấu với đối thủ " + đốiThủXóa);
                    } else {
                        System.out.println("Không tìm thấy trận đấu với đối thủ " + đốiThủXóa);
                    }
                    break;

                case 8:
                    // Lưu danh sách cầu thủ vào tệp
                    System.out.print("Nhập tên tệp để lưu danh sách cầu thủ: ");
                    String tênTệpCầuThủ = scanner.nextLine();
                    đội.lưuCầuThủVàoTệp(tênTệpCầuThủ);
                    System.out.println("Đã lưu danh sách cầu thủ vào tệp " + tênTệpCầuThủ);
                    break;

                case 9:
                    // Lưu danh sách trận đấu vào tệp
                    System.out.print("Nhập tên tệp để lưu danh sách trận đấu: ");
                    String tênTệpTrậnĐấu = scanner.nextLine();
                    try {
                        đội.lưuTrậnĐấuVàoTệp(tênTệpTrậnĐấu);
                        System.out.println("Đã lưu danh sách trận đấu vào tệp " + tênTệpTrậnĐấu);
                    } catch (IOException e) {
                        System.out.println("Có lỗi khi lưu danh sách trận đấu: " + e.getMessage());
                    }
                    break;

                case 0:
                    // Thoát chương trình
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                    break;
            }

        } while (lựaChọn != 0); // Lặp lại cho đến khi người dùng chọn thoát

        scanner.close();
    }
}
