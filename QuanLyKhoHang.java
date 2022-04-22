int loai = scanner.nextInt();
                KhoHang khoHang;

                if (loai == 1) {

                    System.out.println("Nhap thong tin của hang thuc pham can them");
                    int nsx = scanner.nextInt();
                    int hsd = scanner.nextInt();
                } else if (loai == 2) {
                    System.out.println("Nhap thong tin cua hang dien may can them");
                } else {
                    System.out.println("Nhap thong tin hang sanh su can them ");

                }

            }
            return;
        }
        System.out.println("Ban co nhap tiep không y/n");
        int nhap = scanner.nextInt();
        int x = scanner.nextInt();

        do {
            System.out.println("----------MENU----------------");
            System.out.println("\n|1.Them hang hoa|");
            System.out.println("\n|2.in ra danh sach hang hoa|");
            System.out.println("\n|3. Xoa hang hoa|");
            System.out.println("\n|4. Tim vi tri hang hoa|");
            System.out.println("\n|5. Sua thong tin hang hoa|");

            System.out.println("\n|0. Ket thuc |");

            switch (x) {
                case 1:

                    dHoa.Them(null);

                    break;
                case 2:
                    dHoa.inDanhSach();
                    break;
                case 3:
                    dHoa.xoaGiaoDich(null);
                    break;
                case 4:
                    dHoa.viTri(true);
                    break;
                case 5:
                    dHoa.suaGiaoDich(null);
                    break;

                default:
                    break;
            }
        } while (x != 0);
        FileInputStream inFile = new FileInputStream("KhoHang");
        ObjectInputStream objIn = new ObjectInputStream(inFile);
        System.out.println(dHoa);
        objIn.close();
        QLKhoHang myWindow = new QLKhoHang();
        myWindow.setSize(400, 540);
        myWindow.setLocationRelativeTo(null);
        myWindow.setVisible(true);
    }

    public QLKhoHang() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}