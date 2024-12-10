import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library thuVien = null;

        while (true) {
            System.out.println("\n--- Quản lý thư viện ---");
            System.out.println("1. Tạo thư viện mới");
            System.out.println("2. Thêm sách vào thư viện");
            System.out.println("3. Xóa sách khỏi thư viện");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Hiển thị danh sách sách");
            System.out.println("6. Xuất thông tin thư viện");
            System.out.println("7. Sắp xếp sách theo năm xuất bản");
            System.out.println("8. Sắp xếp sách theo tên");
            System.out.println("9. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ đệm

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID thư viện: ");
                    String idThuVien = scanner.nextLine();
                    System.out.print("Nhập tên thư viện: ");
                    String tenThuVien = scanner.nextLine();
                    thuVien = new Library(idThuVien, tenThuVien);
                    System.out.println("Thư viện đã được tạo thành công!");
                    break;

                case 2:
                    if (thuVien == null) {
                        System.out.println("Bạn cần tạo thư viện trước!");
                        break;
                    }
                    System.out.print("Nhập ID sách: ");
                    String idSach = scanner.nextLine();
                    System.out.print("Nhập tiêu đề sách: ");
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tacGia = scanner.nextLine();
                    System.out.print("Nhập thể loại: ");
                    String theLoai = scanner.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int namXB = scanner.nextInt();
                    if ( namXB > 2024 ) {
                        System.out.println( " năm xuất bản không hợp lệ , hãy thử lại ");
                        break;
                    }
                    System.out.print("Trạng thái (1: Sẵn sàng, 0: Đang mượn): ");
                    boolean trangThai = scanner.nextInt() == 1;
                    scanner.nextLine();
                    Book sach = new Book(idSach, tieuDe, tacGia, theLoai, namXB, trangThai);
                    thuVien.addBook(sach);
                    break;

                case 3:
                    if (thuVien == null) {
                        System.out.println("Bạn cần tạo thư viện trước!");
                        break;
                    }
                    System.out.print("Nhập ID sách cần xóa: ");
                    String idCanXoa = scanner.nextLine();
                    thuVien.removeBook(idCanXoa);
                    break;

                case 4:
                    if (thuVien == null) {
                        System.out.println("Bạn cần tạo thư viện trước!");
                        break;
                    }
                    System.out.print("Nhập tiêu đề hoặc tác giả cần tìm: ");
                    String tuKhoa = scanner.nextLine();
                    List<Book> ketQua = thuVien.getBook(tuKhoa);
                    if (ketQua.isEmpty()) {
                        System.out.println("Không tìm thấy sách nào phù hợp.");
                    } else {
                        for (Book s : ketQua) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 5:
                    if (thuVien == null) {
                        System.out.println("Bạn cần tạo thư viện trước!");
                        break;
                    }
                    thuVien.getBookList();
                    break;

                case 6:
                    if (thuVien == null) {
                        System.out.println("Bạn cần tạo thư viện trước!");
                        break;
                    }
                    System.out.println(thuVien);
                    break;

                case 7:
                    if (thuVien == null) {
                        System.out.println("Bạn cần tạo thư viện trước!");
                        break;
                    }
                    thuVien.getBooksInLib().sort(Comparator.comparingInt( Book :: getPublicYear ));
                    System.out.println("Sắp xếp sách theo năm xuất bản thành công!");
                    break;

                case 8:
                    if (thuVien == null) {
                        System.out.println("Bạn cần tạo thư viện trước!");
                        break;
                    }
                    thuVien.getBooksInLib().sort(Comparator.comparing(Book ::getTitle ));
                    System.out.println("Sắp xếp sách theo tên thành công!");
                    break;

                case 9:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

